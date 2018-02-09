
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "totalDeposits",
    "totalWithdrawals",
    "totalInterestEarned",
    "totalInterestPosted",
    "accountBalance",
    "totalOverdraftInterestDerived",
    "interestNotPosted",
    "lastInterestCalculationDate",
    "availableBalance"
})
public class Summary {

    @JsonProperty("currency")
    private Currency_ currency;
    @JsonProperty("totalDeposits")
    private Double totalDeposits;
    @JsonProperty("totalWithdrawals")
    private Double totalWithdrawals;
    @JsonProperty("totalInterestEarned")
    private Double totalInterestEarned;
    @JsonProperty("totalInterestPosted")
    private Double totalInterestPosted;
    @JsonProperty("accountBalance")
    private Double accountBalance;
    @JsonProperty("totalOverdraftInterestDerived")
    private Integer totalOverdraftInterestDerived;
    @JsonProperty("interestNotPosted")
    private Double interestNotPosted;
    @JsonProperty("lastInterestCalculationDate")
    private List<Integer> lastInterestCalculationDate = null;
    @JsonProperty("availableBalance")
    private Double availableBalance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public Currency_ getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(Currency_ currency) {
        this.currency = currency;
    }

    @JsonProperty("totalDeposits")
    public Double getTotalDeposits() {
        return totalDeposits;
    }

    @JsonProperty("totalDeposits")
    public void setTotalDeposits(Double totalDeposits) {
        this.totalDeposits = totalDeposits;
    }

    @JsonProperty("totalWithdrawals")
    public Double getTotalWithdrawals() {
        return totalWithdrawals;
    }

    @JsonProperty("totalWithdrawals")
    public void setTotalWithdrawals(Double totalWithdrawals) {
        this.totalWithdrawals = totalWithdrawals;
    }

    @JsonProperty("totalInterestEarned")
    public Double getTotalInterestEarned() {
        return totalInterestEarned;
    }

    @JsonProperty("totalInterestEarned")
    public void setTotalInterestEarned(Double totalInterestEarned) {
        this.totalInterestEarned = totalInterestEarned;
    }

    @JsonProperty("totalInterestPosted")
    public Double getTotalInterestPosted() {
        return totalInterestPosted;
    }

    @JsonProperty("totalInterestPosted")
    public void setTotalInterestPosted(Double totalInterestPosted) {
        this.totalInterestPosted = totalInterestPosted;
    }

    @JsonProperty("accountBalance")
    public Double getAccountBalance() {
        return accountBalance;
    }

    @JsonProperty("accountBalance")
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @JsonProperty("totalOverdraftInterestDerived")
    public Integer getTotalOverdraftInterestDerived() {
        return totalOverdraftInterestDerived;
    }

    @JsonProperty("totalOverdraftInterestDerived")
    public void setTotalOverdraftInterestDerived(Integer totalOverdraftInterestDerived) {
        this.totalOverdraftInterestDerived = totalOverdraftInterestDerived;
    }

    @JsonProperty("interestNotPosted")
    public Double getInterestNotPosted() {
        return interestNotPosted;
    }

    @JsonProperty("interestNotPosted")
    public void setInterestNotPosted(Double interestNotPosted) {
        this.interestNotPosted = interestNotPosted;
    }

    @JsonProperty("lastInterestCalculationDate")
    public List<Integer> getLastInterestCalculationDate() {
        return lastInterestCalculationDate;
    }

    @JsonProperty("lastInterestCalculationDate")
    public void setLastInterestCalculationDate(List<Integer> lastInterestCalculationDate) {
        this.lastInterestCalculationDate = lastInterestCalculationDate;
    }

    @JsonProperty("availableBalance")
    public Double getAvailableBalance() {
        return availableBalance;
    }

    @JsonProperty("availableBalance")
    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
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
