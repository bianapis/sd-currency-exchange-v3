package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement
 */
public class SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement   {
  private String currencyExchangeServiceAgreementReference = null;

  private String currencyExchangeServiceUserReference = null;

  private String currencyExchangeServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return currencyExchangeServiceAgreementReference
  **/

  public String getCurrencyExchangeServiceAgreementReference() {
    return currencyExchangeServiceAgreementReference;
  }

  public void setCurrencyExchangeServiceAgreementReference(String currencyExchangeServiceAgreementReference) {
    this.currencyExchangeServiceAgreementReference = currencyExchangeServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return currencyExchangeServiceUserReference
  **/

  public String getCurrencyExchangeServiceUserReference() {
    return currencyExchangeServiceUserReference;
  }

  public void setCurrencyExchangeServiceUserReference(String currencyExchangeServiceUserReference) {
    this.currencyExchangeServiceUserReference = currencyExchangeServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return currencyExchangeServiceAgreementTermsandConditions
  **/

  public String getCurrencyExchangeServiceAgreementTermsandConditions() {
    return currencyExchangeServiceAgreementTermsandConditions;
  }

  public void setCurrencyExchangeServiceAgreementTermsandConditions(String currencyExchangeServiceAgreementTermsandConditions) {
    this.currencyExchangeServiceAgreementTermsandConditions = currencyExchangeServiceAgreementTermsandConditions;
  }


}

