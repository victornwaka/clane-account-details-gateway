package net.arca.openbanking.account_details.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.arca.openbanking.account_details.domain.Account;
import net.arca.openbanking.account_details.exception.AccountNotFoundException;
import net.arca.openbanking.account_details.response.AccountDetailsResponse;
import net.arca.openbanking.account_details.response.Error;
import net.arca.openbanking.account_details.service.AccountDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import net.arca.openbanking.account_details.exception.AccountEnquiryValidationException;

import java.net.URISyntaxException;


@RestController
public class AccountDetailsController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AccountDetailsService accountDetailsService;

    @Cacheable(value = "account-details", key = "#username")
    @CrossOrigin
    @GetMapping("/v1/account/{username:[a-zA-Z0-9].+}") //regex mapping allows username like maxlopez@abc.com
    @ResponseBody
    @ApiOperation(value = "accountDetailsByUsername", notes = "Account details by username")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK", response = AccountDetailsResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)
    })
    public AccountDetailsResponse accountDetailsByUsername(@PathVariable(name = "username") String username)
            throws URISyntaxException, AccountNotFoundException, AccountEnquiryValidationException {

        logger.debug("username =========> " + username + " =======================|");
        final Account account = accountDetailsService.fetchAccountIdByUsername(username);
        return accountDetailsService.getAccountDetails(account);

    }

    @Cacheable(value = "account-details", key = "#accountNo")
    @CrossOrigin
    @PostMapping("/v1/account/")
    @ResponseBody
    @ApiOperation(value = "accountDetails", notes = "Account details")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK", response = AccountDetailsResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)
    })
    public AccountDetailsResponse accountDetails(String accountNo)
            throws URISyntaxException, HttpClientErrorException, AccountNotFoundException, AccountEnquiryValidationException {

        logger.debug("AccountId  for fetching account details  ========> " + accountNo + " ================|");
        final Account account = accountDetailsService.fetchAccountIdByAccountNo(accountNo);
        return accountDetailsService.getAccountDetails(account);

    }

}
