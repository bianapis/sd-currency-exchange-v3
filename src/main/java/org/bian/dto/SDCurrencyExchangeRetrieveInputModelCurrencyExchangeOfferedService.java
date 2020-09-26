package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedService
 */
public class SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedService   {
  private String currencyExchangeServiceReference = null;

  private SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecord currencyExchangeServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return currencyExchangeServiceReference
  **/

  public String getCurrencyExchangeServiceReference() {
    return currencyExchangeServiceReference;
  }

  public void setCurrencyExchangeServiceReference(String currencyExchangeServiceReference) {
    this.currencyExchangeServiceReference = currencyExchangeServiceReference;
  }


  /**
   * Get currencyExchangeServiceRecord
   * @return currencyExchangeServiceRecord
  **/

  public SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecord getCurrencyExchangeServiceRecord() {
    return currencyExchangeServiceRecord;
  }

  public void setCurrencyExchangeServiceRecord(SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedServiceCurrencyExchangeServiceRecord currencyExchangeServiceRecord) {
    this.currencyExchangeServiceRecord = currencyExchangeServiceRecord;
  }


}

