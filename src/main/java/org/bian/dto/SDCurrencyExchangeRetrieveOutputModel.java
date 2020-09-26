package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedService;
import org.bian.dto.SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeRetrieveOutputModel
 */
public class SDCurrencyExchangeRetrieveOutputModel   {
  private String currencyExchangeRetrieveActionTaskReference = null;

  private Object currencyExchangeRetrieveActionTaskRecord = null;

  private String currencyExchangeRetrieveActionResponse = null;

  private SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecord currencyExchangeRetrieveActionRecord = null;

  private SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedService currencyExchangeOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return currencyExchangeRetrieveActionTaskReference
  **/

  public String getCurrencyExchangeRetrieveActionTaskReference() {
    return currencyExchangeRetrieveActionTaskReference;
  }

  public void setCurrencyExchangeRetrieveActionTaskReference(String currencyExchangeRetrieveActionTaskReference) {
    this.currencyExchangeRetrieveActionTaskReference = currencyExchangeRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return currencyExchangeRetrieveActionResponse
  **/

  public String getCurrencyExchangeRetrieveActionResponse() {
    return currencyExchangeRetrieveActionResponse;
  }

  public void setCurrencyExchangeRetrieveActionResponse(String currencyExchangeRetrieveActionResponse) {
    this.currencyExchangeRetrieveActionResponse = currencyExchangeRetrieveActionResponse;
  }


  /**
   * Get currencyExchangeRetrieveActionRecord
   * @return currencyExchangeRetrieveActionRecord
  **/

  public SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecord getCurrencyExchangeRetrieveActionRecord() {
    return currencyExchangeRetrieveActionRecord;
  }

  public void setCurrencyExchangeRetrieveActionRecord(SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecord currencyExchangeRetrieveActionRecord) {
    this.currencyExchangeRetrieveActionRecord = currencyExchangeRetrieveActionRecord;
  }


  /**
   * Get currencyExchangeOfferedService
   * @return currencyExchangeOfferedService
  **/

  public SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedService getCurrencyExchangeOfferedService() {
    return currencyExchangeOfferedService;
  }

  public void setCurrencyExchangeOfferedService(SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeOfferedService currencyExchangeOfferedService) {
    this.currencyExchangeOfferedService = currencyExchangeOfferedService;
  }


}

