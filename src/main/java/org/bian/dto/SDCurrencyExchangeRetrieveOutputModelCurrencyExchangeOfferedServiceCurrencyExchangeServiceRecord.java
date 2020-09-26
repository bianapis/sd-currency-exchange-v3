package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecordCurrencyExchangeServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecord
 */
public class SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecord   {
  private String currencyExchangeServiceType = null;

  private String currencyExchangeServiceVersion = null;

  private String currencyExchangeServiceDescription = null;

  private SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecordCurrencyExchangeServicePoliciesandGuidelines currencyExchangeServicePoliciesandGuidelines = null;

  private String currencyExchangeServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return currencyExchangeServiceType
  **/

  public String getCurrencyExchangeServiceType() {
    return currencyExchangeServiceType;
  }

  public void setCurrencyExchangeServiceType(String currencyExchangeServiceType) {
    this.currencyExchangeServiceType = currencyExchangeServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return currencyExchangeServiceVersion
  **/

  public String getCurrencyExchangeServiceVersion() {
    return currencyExchangeServiceVersion;
  }

  public void setCurrencyExchangeServiceVersion(String currencyExchangeServiceVersion) {
    this.currencyExchangeServiceVersion = currencyExchangeServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return currencyExchangeServiceDescription
  **/

  public String getCurrencyExchangeServiceDescription() {
    return currencyExchangeServiceDescription;
  }

  public void setCurrencyExchangeServiceDescription(String currencyExchangeServiceDescription) {
    this.currencyExchangeServiceDescription = currencyExchangeServiceDescription;
  }


  /**
   * Get currencyExchangeServicePoliciesandGuidelines
   * @return currencyExchangeServicePoliciesandGuidelines
  **/

  public SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecordCurrencyExchangeServicePoliciesandGuidelines getCurrencyExchangeServicePoliciesandGuidelines() {
    return currencyExchangeServicePoliciesandGuidelines;
  }

  public void setCurrencyExchangeServicePoliciesandGuidelines(SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecordCurrencyExchangeServicePoliciesandGuidelines currencyExchangeServicePoliciesandGuidelines) {
    this.currencyExchangeServicePoliciesandGuidelines = currencyExchangeServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return currencyExchangeServiceSchedule
  **/

  public String getCurrencyExchangeServiceSchedule() {
    return currencyExchangeServiceSchedule;
  }

  public void setCurrencyExchangeServiceSchedule(String currencyExchangeServiceSchedule) {
    this.currencyExchangeServiceSchedule = currencyExchangeServiceSchedule;
  }


}

