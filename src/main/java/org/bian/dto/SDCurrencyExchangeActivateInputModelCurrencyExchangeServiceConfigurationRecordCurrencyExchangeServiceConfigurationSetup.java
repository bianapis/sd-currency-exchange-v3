package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup
 */
public class SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup   {
  private String currencyExchangeServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return currencyExchangeServiceConfigurationParameter
  **/

  public String getCurrencyExchangeServiceConfigurationParameter() {
    return currencyExchangeServiceConfigurationParameter;
  }

  public void setCurrencyExchangeServiceConfigurationParameter(String currencyExchangeServiceConfigurationParameter) {
    this.currencyExchangeServiceConfigurationParameter = currencyExchangeServiceConfigurationParameter;
  }


}

