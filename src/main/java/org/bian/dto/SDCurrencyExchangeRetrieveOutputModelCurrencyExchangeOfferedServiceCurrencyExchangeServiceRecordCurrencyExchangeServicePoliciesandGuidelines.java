package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecordCurrencyExchangeServicePoliciesandGuidelines
 */
public class SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecordCurrencyExchangeServicePoliciesandGuidelines   {
  private String currencyExchangeServiceEligibility = null;

  private String currencyExchangeServiceIntendedUses = null;

  private String currencyExchangeServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return currencyExchangeServiceEligibility
  **/

  public String getCurrencyExchangeServiceEligibility() {
    return currencyExchangeServiceEligibility;
  }

  public void setCurrencyExchangeServiceEligibility(String currencyExchangeServiceEligibility) {
    this.currencyExchangeServiceEligibility = currencyExchangeServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return currencyExchangeServiceIntendedUses
  **/

  public String getCurrencyExchangeServiceIntendedUses() {
    return currencyExchangeServiceIntendedUses;
  }

  public void setCurrencyExchangeServiceIntendedUses(String currencyExchangeServiceIntendedUses) {
    this.currencyExchangeServiceIntendedUses = currencyExchangeServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return currencyExchangeServicePricingandTerms
  **/

  public String getCurrencyExchangeServicePricingandTerms() {
    return currencyExchangeServicePricingandTerms;
  }

  public void setCurrencyExchangeServicePricingandTerms(String currencyExchangeServicePricingandTerms) {
    this.currencyExchangeServicePricingandTerms = currencyExchangeServicePricingandTerms;
  }


}

