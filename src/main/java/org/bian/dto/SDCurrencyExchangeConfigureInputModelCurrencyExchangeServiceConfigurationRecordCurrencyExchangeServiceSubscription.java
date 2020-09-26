package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription
 */
public class SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription   {
  private String currencyExchangeServiceSubscriberReference = null;

  private String currencyExchangeServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return currencyExchangeServiceSubscriberReference
  **/

  public String getCurrencyExchangeServiceSubscriberReference() {
    return currencyExchangeServiceSubscriberReference;
  }

  public void setCurrencyExchangeServiceSubscriberReference(String currencyExchangeServiceSubscriberReference) {
    this.currencyExchangeServiceSubscriberReference = currencyExchangeServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return currencyExchangeServiceSubscriberAccessProfile
  **/

  public String getCurrencyExchangeServiceSubscriberAccessProfile() {
    return currencyExchangeServiceSubscriberAccessProfile;
  }

  public void setCurrencyExchangeServiceSubscriberAccessProfile(String currencyExchangeServiceSubscriberAccessProfile) {
    this.currencyExchangeServiceSubscriberAccessProfile = currencyExchangeServiceSubscriberAccessProfile;
  }


}

