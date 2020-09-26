package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionInitiateOutputModel
 */
public class CRCurrencyExchangeTransactionInitiateOutputModel   {
  private String currencyExchangeTransactionInstanceReference = null;

  private String currencyExchangeTransactionInitiateActionReference = null;

  private Object currencyExchangeTransactionInitiateActionRecord = null;

  private String currencyExchangeTransactionInstanceStatus = null;

  private String currencyExchangeTransactionParameterType = null;

  private String currencyExchangeTransactionSelectedOption = null;

  private String currencyExchangeTransactionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Currency Exchange Transaction instance 
   * @return currencyExchangeTransactionInstanceReference
  **/

  public String getCurrencyExchangeTransactionInstanceReference() {
    return currencyExchangeTransactionInstanceReference;
  }

  public void setCurrencyExchangeTransactionInstanceReference(String currencyExchangeTransactionInstanceReference) {
    this.currencyExchangeTransactionInstanceReference = currencyExchangeTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return currencyExchangeTransactionInitiateActionReference
  **/

  public String getCurrencyExchangeTransactionInitiateActionReference() {
    return currencyExchangeTransactionInitiateActionReference;
  }

  public void setCurrencyExchangeTransactionInitiateActionReference(String currencyExchangeTransactionInitiateActionReference) {
    this.currencyExchangeTransactionInitiateActionReference = currencyExchangeTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return currencyExchangeTransactionInitiateActionRecord
  **/

  public Object getCurrencyExchangeTransactionInitiateActionRecord() {
    return currencyExchangeTransactionInitiateActionRecord;
  }

  public void setCurrencyExchangeTransactionInitiateActionRecord(Object currencyExchangeTransactionInitiateActionRecord) {
    this.currencyExchangeTransactionInitiateActionRecord = currencyExchangeTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Currency Exchange Transaction instance (e.g. initialised, pending, active) 
   * @return currencyExchangeTransactionInstanceStatus
  **/

  public String getCurrencyExchangeTransactionInstanceStatus() {
    return currencyExchangeTransactionInstanceStatus;
  }

  public void setCurrencyExchangeTransactionInstanceStatus(String currencyExchangeTransactionInstanceStatus) {
    this.currencyExchangeTransactionInstanceStatus = currencyExchangeTransactionInstanceStatus;
  }


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


}

