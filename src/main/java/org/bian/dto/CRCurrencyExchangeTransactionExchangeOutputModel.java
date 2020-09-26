package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionExchangeOutputModel
 */
public class CRCurrencyExchangeTransactionExchangeOutputModel   {
  private String currencyExchangeTransactionParameterType = null;

  private String currencyExchangeTransactionSelectedOption = null;

  private String currencyExchangeTransactionStatus = null;

  private String currencyExchangeTransactionExchangeActionTaskReference = null;

  private Object currencyExchangeTransactionExchangeActionTaskRecord = null;

  private String currencyExchangeTransactionExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between business sercice transaction within Currency Exchange Transaction 
   * @return currencyExchangeTransactionParameterType
  **/

  public String getCurrencyExchangeTransactionParameterType() {
    return currencyExchangeTransactionParameterType;
  }

  public void setCurrencyExchangeTransactionParameterType(String currencyExchangeTransactionParameterType) {
    this.currencyExchangeTransactionParameterType = currencyExchangeTransactionParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Currency Exchange Transaction 
   * @return currencyExchangeTransactionSelectedOption
  **/

  public String getCurrencyExchangeTransactionSelectedOption() {
    return currencyExchangeTransactionSelectedOption;
  }

  public void setCurrencyExchangeTransactionSelectedOption(String currencyExchangeTransactionSelectedOption) {
    this.currencyExchangeTransactionSelectedOption = currencyExchangeTransactionSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Currency Exchange Transaction 
   * @return currencyExchangeTransactionStatus
  **/

  public String getCurrencyExchangeTransactionStatus() {
    return currencyExchangeTransactionStatus;
  }

  public void setCurrencyExchangeTransactionStatus(String currencyExchangeTransactionStatus) {
    this.currencyExchangeTransactionStatus = currencyExchangeTransactionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Currency Exchange Transaction instance exchange service call 
   * @return currencyExchangeTransactionExchangeActionTaskReference
  **/

  public String getCurrencyExchangeTransactionExchangeActionTaskReference() {
    return currencyExchangeTransactionExchangeActionTaskReference;
  }

  public void setCurrencyExchangeTransactionExchangeActionTaskReference(String currencyExchangeTransactionExchangeActionTaskReference) {
    this.currencyExchangeTransactionExchangeActionTaskReference = currencyExchangeTransactionExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return currencyExchangeTransactionExchangeActionTaskRecord
  **/

  public Object getCurrencyExchangeTransactionExchangeActionTaskRecord() {
    return currencyExchangeTransactionExchangeActionTaskRecord;
  }

  public void setCurrencyExchangeTransactionExchangeActionTaskRecord(Object currencyExchangeTransactionExchangeActionTaskRecord) {
    this.currencyExchangeTransactionExchangeActionTaskRecord = currencyExchangeTransactionExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return currencyExchangeTransactionExchangeActionResponse
  **/

  public String getCurrencyExchangeTransactionExchangeActionResponse() {
    return currencyExchangeTransactionExchangeActionResponse;
  }

  public void setCurrencyExchangeTransactionExchangeActionResponse(String currencyExchangeTransactionExchangeActionResponse) {
    this.currencyExchangeTransactionExchangeActionResponse = currencyExchangeTransactionExchangeActionResponse;
  }


}

