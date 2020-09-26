package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecord
 */
public class SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecord   {
  private String currencyExchangeServiceConfigurationSettingReference = null;

  private String currencyExchangeServiceConfigurationSettingType = null;

  private SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup currencyExchangeServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return currencyExchangeServiceConfigurationSettingReference
  **/

  public String getCurrencyExchangeServiceConfigurationSettingReference() {
    return currencyExchangeServiceConfigurationSettingReference;
  }

  public void setCurrencyExchangeServiceConfigurationSettingReference(String currencyExchangeServiceConfigurationSettingReference) {
    this.currencyExchangeServiceConfigurationSettingReference = currencyExchangeServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return currencyExchangeServiceConfigurationSettingType
  **/

  public String getCurrencyExchangeServiceConfigurationSettingType() {
    return currencyExchangeServiceConfigurationSettingType;
  }

  public void setCurrencyExchangeServiceConfigurationSettingType(String currencyExchangeServiceConfigurationSettingType) {
    this.currencyExchangeServiceConfigurationSettingType = currencyExchangeServiceConfigurationSettingType;
  }


  /**
   * Get currencyExchangeServiceConfigurationSetup
   * @return currencyExchangeServiceConfigurationSetup
  **/

  public SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup getCurrencyExchangeServiceConfigurationSetup() {
    return currencyExchangeServiceConfigurationSetup;
  }

  public void setCurrencyExchangeServiceConfigurationSetup(SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup currencyExchangeServiceConfigurationSetup) {
    this.currencyExchangeServiceConfigurationSetup = currencyExchangeServiceConfigurationSetup;
  }


}

