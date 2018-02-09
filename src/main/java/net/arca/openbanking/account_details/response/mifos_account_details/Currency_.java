
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
    "code",
    "name",
    "decimalPlaces",
    "inMultiplesOf",
    "displaySymbol",
    "nameCode",
    "displayLabel"
})
public class Currency_ {

    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("decimalPlaces")
    private Integer decimalPlaces;
    @JsonProperty("inMultiplesOf")
    private Integer inMultiplesOf;
    @JsonProperty("displaySymbol")
    private String displaySymbol;
    @JsonProperty("nameCode")
    private String nameCode;
    @JsonProperty("displayLabel")
    private String displayLabel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("decimalPlaces")
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    @JsonProperty("decimalPlaces")
    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @JsonProperty("inMultiplesOf")
    public Integer getInMultiplesOf() {
        return inMultiplesOf;
    }

    @JsonProperty("inMultiplesOf")
    public void setInMultiplesOf(Integer inMultiplesOf) {
        this.inMultiplesOf = inMultiplesOf;
    }

    @JsonProperty("displaySymbol")
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    @JsonProperty("displaySymbol")
    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @JsonProperty("nameCode")
    public String getNameCode() {
        return nameCode;
    }

    @JsonProperty("nameCode")
    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    @JsonProperty("displayLabel")
    public String getDisplayLabel() {
        return displayLabel;
    }

    @JsonProperty("displayLabel")
    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
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
