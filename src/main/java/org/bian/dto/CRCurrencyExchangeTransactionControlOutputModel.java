package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionControlOutputModel
 */
public class CRCurrencyExchangeTransactionControlOutputModel   {
  private String currencyExchangeTransactionParameterType = null;

  private String currencyExchangeTransactionSelectedOption = null;

  private String currencyExchangeTransactionStatus = null;

  private String currencyExchangeTransactionControlActionTaskReference = null;

  private Object currencyExchangeTransactionControlActionTaskRecord = null;

  private String currencyExchangeTransactionControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Currency Exchange Transaction instance control processing service call 
   * @return currencyExchangeTransactionControlActionTaskReference
  **/

  public String getCurrencyExchangeTransactionControlActionTaskReference() {
    return currencyExchangeTransactionControlActionTaskReference;
  }

  public void setCurrencyExchangeTransactionControlActionTaskReference(String currencyExchangeTransactionControlActionTaskReference) {
    this.currencyExchangeTransactionControlActionTaskReference = currencyExchangeTransactionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return currencyExchangeTransactionControlActionTaskRecord
  **/

  public Object getCurrencyExchangeTransactionControlActionTaskRecord() {
    return currencyExchangeTransactionControlActionTaskRecord;
  }

  public void setCurrencyExchangeTransactionControlActionTaskRecord(Object currencyExchangeTransactionControlActionTaskRecord) {
    this.currencyExchangeTransactionControlActionTaskRecord = currencyExchangeTransactionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return currencyExchangeTransactionControlActionResponse
  **/

  public String getCurrencyExchangeTransactionControlActionResponse() {
    return currencyExchangeTransactionControlActionResponse;
  }

  public void setCurrencyExchangeTransactionControlActionResponse(String currencyExchangeTransactionControlActionResponse) {
    this.currencyExchangeTransactionControlActionResponse = currencyExchangeTransactionControlActionResponse;
  }


}

