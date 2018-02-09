
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
    "submittedOnDate",
    "submittedByUsername",
    "submittedByFirstname",
    "submittedByLastname",
    "approvedOnDate",
    "approvedByUsername",
    "approvedByFirstname",
    "approvedByLastname",
    "activatedOnDate",
    "activatedByUsername",
    "activatedByFirstname",
    "activatedByLastname"
})
public class Timeline {

    @JsonProperty("submittedOnDate")
    private List<Integer> submittedOnDate = null;
    @JsonProperty("submittedByUsername")
    private String submittedByUsername;
    @JsonProperty("submittedByFirstname")
    private String submittedByFirstname;
    @JsonProperty("submittedByLastname")
    private String submittedByLastname;
    @JsonProperty("approvedOnDate")
    private List<Integer> approvedOnDate = null;
    @JsonProperty("approvedByUsername")
    private String approvedByUsername;
    @JsonProperty("approvedByFirstname")
    private String approvedByFirstname;
    @JsonProperty("approvedByLastname")
    private String approvedByLastname;
    @JsonProperty("activatedOnDate")
    private List<Integer> activatedOnDate = null;
    @JsonProperty("activatedByUsername")
    private String activatedByUsername;
    @JsonProperty("activatedByFirstname")
    private String activatedByFirstname;
    @JsonProperty("activatedByLastname")
    private String activatedByLastname;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("submittedOnDate")
    public List<Integer> getSubmittedOnDate() {
        return submittedOnDate;
    }

    @JsonProperty("submittedOnDate")
    public void setSubmittedOnDate(List<Integer> submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
    }

    @JsonProperty("submittedByUsername")
    public String getSubmittedByUsername() {
        return submittedByUsername;
    }

    @JsonProperty("submittedByUsername")
    public void setSubmittedByUsername(String submittedByUsername) {
        this.submittedByUsername = submittedByUsername;
    }

    @JsonProperty("submittedByFirstname")
    public String getSubmittedByFirstname() {
        return submittedByFirstname;
    }

    @JsonProperty("submittedByFirstname")
    public void setSubmittedByFirstname(String submittedByFirstname) {
        this.submittedByFirstname = submittedByFirstname;
    }

    @JsonProperty("submittedByLastname")
    public String getSubmittedByLastname() {
        return submittedByLastname;
    }

    @JsonProperty("submittedByLastname")
    public void setSubmittedByLastname(String submittedByLastname) {
        this.submittedByLastname = submittedByLastname;
    }

    @JsonProperty("approvedOnDate")
    public List<Integer> getApprovedOnDate() {
        return approvedOnDate;
    }

    @JsonProperty("approvedOnDate")
    public void setApprovedOnDate(List<Integer> approvedOnDate) {
        this.approvedOnDate = approvedOnDate;
    }

    @JsonProperty("approvedByUsername")
    public String getApprovedByUsername() {
        return approvedByUsername;
    }

    @JsonProperty("approvedByUsername")
    public void setApprovedByUsername(String approvedByUsername) {
        this.approvedByUsername = approvedByUsername;
    }

    @JsonProperty("approvedByFirstname")
    public String getApprovedByFirstname() {
        return approvedByFirstname;
    }

    @JsonProperty("approvedByFirstname")
    public void setApprovedByFirstname(String approvedByFirstname) {
        this.approvedByFirstname = approvedByFirstname;
    }

    @JsonProperty("approvedByLastname")
    public String getApprovedByLastname() {
        return approvedByLastname;
    }

    @JsonProperty("approvedByLastname")
    public void setApprovedByLastname(String approvedByLastname) {
        this.approvedByLastname = approvedByLastname;
    }

    @JsonProperty("activatedOnDate")
    public List<Integer> getActivatedOnDate() {
        return activatedOnDate;
    }

    @JsonProperty("activatedOnDate")
    public void setActivatedOnDate(List<Integer> activatedOnDate) {
        this.activatedOnDate = activatedOnDate;
    }

    @JsonProperty("activatedByUsername")
    public String getActivatedByUsername() {
        return activatedByUsername;
    }

    @JsonProperty("activatedByUsername")
    public void setActivatedByUsername(String activatedByUsername) {
        this.activatedByUsername = activatedByUsername;
    }

    @JsonProperty("activatedByFirstname")
    public String getActivatedByFirstname() {
        return activatedByFirstname;
    }

    @JsonProperty("activatedByFirstname")
    public void setActivatedByFirstname(String activatedByFirstname) {
        this.activatedByFirstname = activatedByFirstname;
    }

    @JsonProperty("activatedByLastname")
    public String getActivatedByLastname() {
        return activatedByLastname;
    }

    @JsonProperty("activatedByLastname")
    public void setActivatedByLastname(String activatedByLastname) {
        this.activatedByLastname = activatedByLastname;
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
