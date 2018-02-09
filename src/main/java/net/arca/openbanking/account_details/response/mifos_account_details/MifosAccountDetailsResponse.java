
package net.arca.openbanking.account_details.response.mifos_account_details;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "accountNo",
        "depositType",
        "clientId",
        "clientName",
        "savingsProductId",
        "savingsProductName",
        "fieldOfficerId",
        "status",
        "subStatus",
        "timeline",
        "currency",
        "nominalAnnualInterestRate",
        "interestCompoundingPeriodType",
        "interestPostingPeriodType",
        "interestCalculationType",
        "interestCalculationDaysInYearType",
        "minRequiredOpeningBalance",
        "lockinPeriodFrequency",
        "lockinPeriodFrequencyType",
        "withdrawalFeeForTransfers",
        "allowOverdraft",
        "enforceMinRequiredBalance",
        "withHoldTax",
        "lastActiveTransactionDate",
        "isDormancyTrackingActive",
        "savingsAmountOnHold",
        "summary"
})
public class MifosAccountDetailsResponse {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("accountNo")
    private String accountNo;
    @JsonProperty("depositType")
    private DepositType depositType;
    @JsonProperty("clientId")
    private Integer clientId;
    @JsonProperty("clientName")
    private String clientName;
    @JsonProperty("savingsProductId")
    private Integer savingsProductId;
    @JsonProperty("savingsProductName")
    private String savingsProductName;
    @JsonProperty("fieldOfficerId")
    private Integer fieldOfficerId;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("subStatus")
    private SubStatus subStatus;
    @JsonProperty("timeline")
    private Timeline timeline;
    @JsonProperty("currency")
    private Currency currency;
    @JsonProperty("nominalAnnualInterestRate")
    private Double nominalAnnualInterestRate;
    @JsonProperty("interestCompoundingPeriodType")
    private InterestCompoundingPeriodType interestCompoundingPeriodType;
    @JsonProperty("interestPostingPeriodType")
    private InterestPostingPeriodType interestPostingPeriodType;
    @JsonProperty("interestCalculationType")
    private InterestCalculationType interestCalculationType;
    @JsonProperty("interestCalculationDaysInYearType")
    private InterestCalculationDaysInYearType interestCalculationDaysInYearType;
    @JsonProperty("minRequiredOpeningBalance")
    private Double minRequiredOpeningBalance;
    @JsonProperty("lockinPeriodFrequency")
    private Integer lockinPeriodFrequency;
    @JsonProperty("lockinPeriodFrequencyType")
    private LockinPeriodFrequencyType lockinPeriodFrequencyType;
    @JsonProperty("withdrawalFeeForTransfers")
    private Boolean withdrawalFeeForTransfers;
    @JsonProperty("allowOverdraft")
    private Boolean allowOverdraft;
    @JsonProperty("enforceMinRequiredBalance")
    private Boolean enforceMinRequiredBalance;
    @JsonProperty("withHoldTax")
    private Boolean withHoldTax;
    @JsonProperty("lastActiveTransactionDate")
    private List<Integer> lastActiveTransactionDate = null;
    @JsonProperty("isDormancyTrackingActive")
    private Boolean isDormancyTrackingActive;
    @JsonProperty("savingsAmountOnHold")
    private Double savingsAmountOnHold;
    @JsonProperty("summary")
    private Summary summary;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("accountNumber")
    public String getAccountNo() {
        return accountNo;
    }

    @JsonProperty("accountNumber")
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @JsonProperty("depositType")
    public DepositType getDepositType() {
        return depositType;
    }

    @JsonProperty("depositType")
    public void setDepositType(DepositType depositType) {
        this.depositType = depositType;
    }

    @JsonProperty("clientId")
    public Integer getClientId() {
        return clientId;
    }

    @JsonProperty("clientId")
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("clientName")
    public String getClientName() {
        return clientName;
    }

    @JsonProperty("clientName")
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @JsonProperty("savingsProductId")
    public Integer getSavingsProductId() {
        return savingsProductId;
    }

    @JsonProperty("savingsProductId")
    public void setSavingsProductId(Integer savingsProductId) {
        this.savingsProductId = savingsProductId;
    }

    @JsonProperty("savingsProductName")
    public String getSavingsProductName() {
        return savingsProductName;
    }

    @JsonProperty("savingsProductName")
    public void setSavingsProductName(String savingsProductName) {
        this.savingsProductName = savingsProductName;
    }

    @JsonProperty("fieldOfficerId")
    public Integer getFieldOfficerId() {
        return fieldOfficerId;
    }

    @JsonProperty("fieldOfficerId")
    public void setFieldOfficerId(Integer fieldOfficerId) {
        this.fieldOfficerId = fieldOfficerId;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("subStatus")
    public SubStatus getSubStatus() {
        return subStatus;
    }

    @JsonProperty("subStatus")
    public void setSubStatus(SubStatus subStatus) {
        this.subStatus = subStatus;
    }

    @JsonProperty("timeline")
    public Timeline getTimeline() {
        return timeline;
    }

    @JsonProperty("timeline")
    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @JsonProperty("currency")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @JsonProperty("nominalAnnualInterestRate")
    public Double getNominalAnnualInterestRate() {
        return nominalAnnualInterestRate;
    }

    @JsonProperty("nominalAnnualInterestRate")
    public void setNominalAnnualInterestRate(Double nominalAnnualInterestRate) {
        this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    }

    @JsonProperty("interestCompoundingPeriodType")
    public InterestCompoundingPeriodType getInterestCompoundingPeriodType() {
        return interestCompoundingPeriodType;
    }

    @JsonProperty("interestCompoundingPeriodType")
    public void setInterestCompoundingPeriodType(InterestCompoundingPeriodType interestCompoundingPeriodType) {
        this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    }

    @JsonProperty("interestPostingPeriodType")
    public InterestPostingPeriodType getInterestPostingPeriodType() {
        return interestPostingPeriodType;
    }

    @JsonProperty("interestPostingPeriodType")
    public void setInterestPostingPeriodType(InterestPostingPeriodType interestPostingPeriodType) {
        this.interestPostingPeriodType = interestPostingPeriodType;
    }

    @JsonProperty("interestCalculationType")
    public InterestCalculationType getInterestCalculationType() {
        return interestCalculationType;
    }

    @JsonProperty("interestCalculationType")
    public void setInterestCalculationType(InterestCalculationType interestCalculationType) {
        this.interestCalculationType = interestCalculationType;
    }

    @JsonProperty("interestCalculationDaysInYearType")
    public InterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
        return interestCalculationDaysInYearType;
    }

    @JsonProperty("interestCalculationDaysInYearType")
    public void setInterestCalculationDaysInYearType(InterestCalculationDaysInYearType interestCalculationDaysInYearType) {
        this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    }

    @JsonProperty("minRequiredOpeningBalance")
    public Double getMinRequiredOpeningBalance() {
        return minRequiredOpeningBalance;
    }

    @JsonProperty("minRequiredOpeningBalance")
    public void setMinRequiredOpeningBalance(Double minRequiredOpeningBalance) {
        this.minRequiredOpeningBalance = minRequiredOpeningBalance;
    }

    @JsonProperty("lockinPeriodFrequency")
    public Integer getLockinPeriodFrequency() {
        return lockinPeriodFrequency;
    }

    @JsonProperty("lockinPeriodFrequency")
    public void setLockinPeriodFrequency(Integer lockinPeriodFrequency) {
        this.lockinPeriodFrequency = lockinPeriodFrequency;
    }

    @JsonProperty("lockinPeriodFrequencyType")
    public LockinPeriodFrequencyType getLockinPeriodFrequencyType() {
        return lockinPeriodFrequencyType;
    }

    @JsonProperty("lockinPeriodFrequencyType")
    public void setLockinPeriodFrequencyType(LockinPeriodFrequencyType lockinPeriodFrequencyType) {
        this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
    }

    @JsonProperty("withdrawalFeeForTransfers")
    public Boolean getWithdrawalFeeForTransfers() {
        return withdrawalFeeForTransfers;
    }

    @JsonProperty("withdrawalFeeForTransfers")
    public void setWithdrawalFeeForTransfers(Boolean withdrawalFeeForTransfers) {
        this.withdrawalFeeForTransfers = withdrawalFeeForTransfers;
    }

    @JsonProperty("allowOverdraft")
    public Boolean getAllowOverdraft() {
        return allowOverdraft;
    }

    @JsonProperty("allowOverdraft")
    public void setAllowOverdraft(Boolean allowOverdraft) {
        this.allowOverdraft = allowOverdraft;
    }

    @JsonProperty("enforceMinRequiredBalance")
    public Boolean getEnforceMinRequiredBalance() {
        return enforceMinRequiredBalance;
    }

    @JsonProperty("enforceMinRequiredBalance")
    public void setEnforceMinRequiredBalance(Boolean enforceMinRequiredBalance) {
        this.enforceMinRequiredBalance = enforceMinRequiredBalance;
    }

    @JsonProperty("withHoldTax")
    public Boolean getWithHoldTax() {
        return withHoldTax;
    }

    @JsonProperty("withHoldTax")
    public void setWithHoldTax(Boolean withHoldTax) {
        this.withHoldTax = withHoldTax;
    }

    @JsonProperty("lastActiveTransactionDate")
    public List<Integer> getLastActiveTransactionDate() {
        return lastActiveTransactionDate;
    }

    @JsonProperty("lastActiveTransactionDate")
    public void setLastActiveTransactionDate(List<Integer> lastActiveTransactionDate) {
        this.lastActiveTransactionDate = lastActiveTransactionDate;
    }

    @JsonProperty("isDormancyTrackingActive")
    public Boolean getIsDormancyTrackingActive() {
        return isDormancyTrackingActive;
    }

    @JsonProperty("isDormancyTrackingActive")
    public void setIsDormancyTrackingActive(Boolean isDormancyTrackingActive) {
        this.isDormancyTrackingActive = isDormancyTrackingActive;
    }

    @JsonProperty("savingsAmountOnHold")
    public Double getSavingsAmountOnHold() {
        return savingsAmountOnHold;
    }

    @JsonProperty("savingsAmountOnHold")
    public void setSavingsAmountOnHold(Double savingsAmountOnHold) {
        this.savingsAmountOnHold = savingsAmountOnHold;
    }

    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
