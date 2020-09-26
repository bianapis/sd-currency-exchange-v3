package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecord
 */
public class SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecord   {
  private String currencyExchangeServiceVersion = null;


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


}

