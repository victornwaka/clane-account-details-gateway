
package net.arca.openbanking.account_details.response.mifos_account_details;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "code",
    "value",
    "submittedAndPendingApproval",
    "approved",
    "rejected",
    "withdrawnByApplicant",
    "active",
    "closed",
    "prematureClosed",
    "transferInProgress",
    "transferOnHold",
    "matured"
})
public class Status {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("value")
    private String value;
    @JsonProperty("submittedAndPendingApproval")
    private Boolean submittedAndPendingApproval;
    @JsonProperty("approved")
    private Boolean approved;
    @JsonProperty("rejected")
    private Boolean rejected;
    @JsonProperty("withdrawnByApplicant")
    private Boolean withdrawnByApplicant;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("prematureClosed")
    private Boolean prematureClosed;
    @JsonProperty("transferInProgress")
    private Boolean transferInProgress;
    @JsonProperty("transferOnHold")
    private Boolean transferOnHold;
    @JsonProperty("matured")
    private Boolean matured;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("submittedAndPendingApproval")
    public Boolean getSubmittedAndPendingApproval() {
        return submittedAndPendingApproval;
    }

    @JsonProperty("submittedAndPendingApproval")
    public void setSubmittedAndPendingApproval(Boolean submittedAndPendingApproval) {
        this.submittedAndPendingApproval = submittedAndPendingApproval;
    }

    @JsonProperty("approved")
    public Boolean getApproved() {
        return approved;
    }

    @JsonProperty("approved")
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    @JsonProperty("rejected")
    public Boolean getRejected() {
        return rejected;
    }

    @JsonProperty("rejected")
    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    @JsonProperty("withdrawnByApplicant")
    public Boolean getWithdrawnByApplicant() {
        return withdrawnByApplicant;
    }

    @JsonProperty("withdrawnByApplicant")
    public void setWithdrawnByApplicant(Boolean withdrawnByApplicant) {
        this.withdrawnByApplicant = withdrawnByApplicant;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("prematureClosed")
    public Boolean getPrematureClosed() {
        return prematureClosed;
    }

    @JsonProperty("prematureClosed")
    public void setPrematureClosed(Boolean prematureClosed) {
        this.prematureClosed = prematureClosed;
    }

    @JsonProperty("transferInProgress")
    public Boolean getTransferInProgress() {
        return transferInProgress;
    }

    @JsonProperty("transferInProgress")
    public void setTransferInProgress(Boolean transferInProgress) {
        this.transferInProgress = transferInProgress;
    }

    @JsonProperty("transferOnHold")
    public Boolean getTransferOnHold() {
        return transferOnHold;
    }

    @JsonProperty("transferOnHold")
    public void setTransferOnHold(Boolean transferOnHold) {
        this.transferOnHold = transferOnHold;
    }

    @JsonProperty("matured")
    public Boolean getMatured() {
        return matured;
    }

    @JsonProperty("matured")
    public void setMatured(Boolean matured) {
        this.matured = matured;
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
