package net.arca.openbanking.account_details.service;

import net.arca.openbanking.account_details.constants.Constant;
import net.arca.openbanking.account_details.domain.Account;
import net.arca.openbanking.account_details.response.AccountDetailsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import net.arca.openbanking.account_details.config.Mifosconfig;
import net.arca.openbanking.account_details.exception.AccountEnquiryValidationException;
import net.arca.openbanking.account_details.exception.AccountNotFoundException;
import net.arca.openbanking.account_details.repository.AccountRepo;
import net.arca.openbanking.account_details.response.mifos_account_details.MifosAccountDetailsResponse;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class AccountDetailsService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders headers;

    @Autowired
    private Mifosconfig mifosConfig;

    public AccountDetailsResponse getAccountDetails(Account account)
            throws URISyntaxException, AccountEnquiryValidationException {

        logger.debug("accountId for querying mifos ==> " + account.getAccountId() + " ============ |");

        //Route request based on customers bank code
        if(account.getBranchCode().equalsIgnoreCase(Constant.BRANCH_CODE)){
            // route request to mifos
            return getAccountDetailsFromSwitch(account.getAccountId());

        }else{
            //Todo: route request to mifos middleware to fetch account details from switch
        }

        throw new AccountEnquiryValidationException("Bank code not available.");
    }

    private AccountDetailsResponse getAccountDetailsFromSwitch(String accountId) throws URISyntaxException, AccountEnquiryValidationException {
        StringBuilder mifosInstanceUrl = new StringBuilder(mifosConfig.getInstanceip());
        mifosInstanceUrl.append(":");
        mifosInstanceUrl.append(mifosConfig.getPort());
        mifosInstanceUrl.append("/fineract-provider/api/v1/savingsaccounts/");
        mifosInstanceUrl.append(accountId);
        mifosInstanceUrl.append("?tenantIdentifier=default&pretty=true");

        logger.debug("mifos instance url ====> " + mifosInstanceUrl.toString() + " ==============|");
        URI uri = new URI(mifosInstanceUrl.toString());

        final ResponseEntity<MifosAccountDetailsResponse> accountDetailsResponseEntity = restTemplate
                .exchange(uri, HttpMethod.GET, new HttpEntity<>(headers), MifosAccountDetailsResponse.class);

        logger.debug("accountDetailsResponseEntity ===> "  +  accountDetailsResponseEntity.toString() + " ===============|");

        if (accountDetailsResponseEntity.getStatusCodeValue() != 200) {
            throw new AccountEnquiryValidationException("Account not found.");
        }

        final MifosAccountDetailsResponse mifosAccountDetailsResponse = accountDetailsResponseEntity.getBody();

        logger.debug("accountDetailsResponseEntity content =====> "
                + accountDetailsResponseEntity.toString() + " =============|");
        logger.debug("mifosAccountDetailsResponse content == > " + mifosAccountDetailsResponse.toString()
                + " ==========|");

        logger.debug("mifosAccountDetailsResponse client name ====> " + mifosAccountDetailsResponse.getClientName() + " ==============|");
        return buildAccountDetailsResponse(mifosAccountDetailsResponse);
    }

    private AccountDetailsResponse buildAccountDetailsResponse(MifosAccountDetailsResponse mAcctDetailsResponse) {
        AccountDetailsResponse accountDetailsResponse = new AccountDetailsResponse();

        accountDetailsResponse.setAccountNumber(mAcctDetailsResponse.getAccountNo());
        accountDetailsResponse.setSubscriberName(mAcctDetailsResponse.getClientName());
        accountDetailsResponse.setAccountType(mAcctDetailsResponse.getSavingsProductName());
        accountDetailsResponse.setCurrencyCode(mAcctDetailsResponse.getSummary().getCurrency().getCode());

//        Note: deprecated.
//        accountDetailsResponse.setAccountId(mAcctDetailsResponse.getId().toString());
//        accountDetailsResponse.setClientId(mAcctDetailsResponse.getClientId().toString());
//        accountDetailsResponse.setClientName(mAcctDetailsResponse.getClientName());
//        accountDetailsResponse.setDepositType(mAcctDetailsResponse.getDepositType());
//        accountDetailsResponse.setDormancyTrackingActive(mAcctDetailsResponse.getIsDormancyTrackingActive());
//        accountDetailsResponse.setFieldOfficerId(mAcctDetailsResponse.getFieldOfficerId().toString());
//        accountDetailsResponse.setSavingsProductId(mAcctDetailsResponse.getSavingsProductId().toString());
//        accountDetailsResponse.setSavingsProductName(mAcctDetailsResponse.getSavingsProductName());
//        accountDetailsResponse.setStatus(mAcctDetailsResponse.getStatus());
//        accountDetailsResponse.setSubStatus(mAcctDetailsResponse.getSubStatus());
//        accountDetailsResponse.setSummary(mAcctDetailsResponse.getSummary());

        return accountDetailsResponse;
    }

    public Account fetchAccountIdByUsername(String username) throws AccountNotFoundException {
        final List<Account> accountList = accountRepo.findByUsername(username);
        if (accountList.size() == 0) {
            throw new AccountNotFoundException("Account not found.");
        }
        return accountList.get(0); //users can have more than one account, but for will be defaulted to 1 for now
    }

    public Account fetchAccountIdByAccountNo(String accountNo) throws AccountNotFoundException {
        final List<Account> accountList = accountRepo.findByAccountNo(accountNo);
        if (accountList.size() == 0) {
            throw new AccountNotFoundException("Account not found.");
        }
        return accountList.get(0); //users can have more than one account, but for will be defaulted to 1 for now
    }
}
