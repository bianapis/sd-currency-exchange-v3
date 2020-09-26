package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedService;
import org.bian.dto.SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeRetrieveInputModel
 */
public class SDCurrencyExchangeRetrieveInputModel   {
  private Object currencyExchangeRetrieveActionTaskRecord = null;

  private String currencyExchangeRetrieveActionRequest = null;

  private SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecord currencyExchangeRetrieveActionRecord = null;

  private SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedService currencyExchangeOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return currencyExchangeRetrieveActionTaskRecord
  **/

  public Object getCurrencyExchangeRetrieveActionTaskRecord() {
    return currencyExchangeRetrieveActionTaskRecord;
  }

  public void setCurrencyExchangeRetrieveActionTaskRecord(Object currencyExchangeRetrieveActionTaskRecord) {
    this.currencyExchangeRetrieveActionTaskRecord = currencyExchangeRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return currencyExchangeRetrieveActionRequest
  **/

  public String getCurrencyExchangeRetrieveActionRequest() {
    return currencyExchangeRetrieveActionRequest;
  }

  public void setCurrencyExchangeRetrieveActionRequest(String currencyExchangeRetrieveActionRequest) {
    this.currencyExchangeRetrieveActionRequest = currencyExchangeRetrieveActionRequest;
  }


  /**
   * Get currencyExchangeRetrieveActionRecord
   * @return currencyExchangeRetrieveActionRecord
  **/

  public SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecord getCurrencyExchangeRetrieveActionRecord() {
    return currencyExchangeRetrieveActionRecord;
  }

  public void setCurrencyExchangeRetrieveActionRecord(SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecord currencyExchangeRetrieveActionRecord) {
    this.currencyExchangeRetrieveActionRecord = currencyExchangeRetrieveActionRecord;
  }


  /**
   * Get currencyExchangeOfferedService
   * @return currencyExchangeOfferedService
  **/

  public SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedService getCurrencyExchangeOfferedService() {
    return currencyExchangeOfferedService;
  }

  public void setCurrencyExchangeOfferedService(SDCurrencyExchangeRetrieveInputModelCurrencyExchangeOfferedService currencyExchangeOfferedService) {
    this.currencyExchangeOfferedService = currencyExchangeOfferedService;
  }


}

