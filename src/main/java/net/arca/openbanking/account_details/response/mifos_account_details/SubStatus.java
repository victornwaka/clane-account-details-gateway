
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
    "none",
    "inactive",
    "dormant",
    "escheat",
    "block",
    "blockCredit",
    "blockDebit"
})
public class SubStatus {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("value")
    private String value;
    @JsonProperty("none")
    private Boolean none;
    @JsonProperty("inactive")
    private Boolean inactive;
    @JsonProperty("dormant")
    private Boolean dormant;
    @JsonProperty("escheat")
    private Boolean escheat;
    @JsonProperty("block")
    private Boolean block;
    @JsonProperty("blockCredit")
    private Boolean blockCredit;
    @JsonProperty("blockDebit")
    private Boolean blockDebit;
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

    @JsonProperty("none")
    public Boolean getNone() {
        return none;
    }

    @JsonProperty("none")
    public void setNone(Boolean none) {
        this.none = none;
    }

    @JsonProperty("inactive")
    public Boolean getInactive() {
        return inactive;
    }

    @JsonProperty("inactive")
    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    @JsonProperty("dormant")
    public Boolean getDormant() {
        return dormant;
    }

    @JsonProperty("dormant")
    public void setDormant(Boolean dormant) {
        this.dormant = dormant;
    }

    @JsonProperty("escheat")
    public Boolean getEscheat() {
        return escheat;
    }

    @JsonProperty("escheat")
    public void setEscheat(Boolean escheat) {
        this.escheat = escheat;
    }

    @JsonProperty("block")
    public Boolean getBlock() {
        return block;
    }

    @JsonProperty("block")
    public void setBlock(Boolean block) {
        this.block = block;
    }

    @JsonProperty("blockCredit")
    public Boolean getBlockCredit() {
        return blockCredit;
    }

    @JsonProperty("blockCredit")
    public void setBlockCredit(Boolean blockCredit) {
        this.blockCredit = blockCredit;
    }

    @JsonProperty("blockDebit")
    public Boolean getBlockDebit() {
        return blockDebit;
    }

    @JsonProperty("blockDebit")
    public void setBlockDebit(Boolean blockDebit) {
        this.blockDebit = blockDebit;
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
