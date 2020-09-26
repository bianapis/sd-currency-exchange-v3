package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrencyExchangeTransactionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionRequestInputModel
 */
public class CRCurrencyExchangeTransactionRequestInputModel   {
  private String currencyExchangeServicingSessionReference = null;

  private String currencyExchangeTransactionInstanceReference = null;

  private String currencyExchangeTransactionParameterType = null;

  private String currencyExchangeTransactionSelectedOption = null;

  private String currencyExchangeTransactionStatus = null;

  private String currencyExchangeTransactionType = null;

  private String currencyExchangeTransactionTransactionType = null;

  private Object currencyExchangeTransactionRequestActionTaskRecord = null;

  private CRCurrencyExchangeTransactionRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return currencyExchangeServicingSessionReference
  **/

  public String getCurrencyExchangeServicingSessionReference() {
    return currencyExchangeServicingSessionReference;
  }

  public void setCurrencyExchangeServicingSessionReference(String currencyExchangeServicingSessionReference) {
    this.currencyExchangeServicingSessionReference = currencyExchangeServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of business action for this Currency Exchange Transaction 
   * @return currencyExchangeTransactionType
  **/

  public String getCurrencyExchangeTransactionType() {
    return currencyExchangeTransactionType;
  }

  public void setCurrencyExchangeTransactionType(String currencyExchangeTransactionType) {
    this.currencyExchangeTransactionType = currencyExchangeTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of transaction for this Currency Exchange Transaction 
   * @return currencyExchangeTransactionTransactionType
  **/

  public String getCurrencyExchangeTransactionTransactionType() {
    return currencyExchangeTransactionTransactionType;
  }

  public void setCurrencyExchangeTransactionTransactionType(String currencyExchangeTransactionTransactionType) {
    this.currencyExchangeTransactionTransactionType = currencyExchangeTransactionTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return currencyExchangeTransactionRequestActionTaskRecord
  **/

  public Object getCurrencyExchangeTransactionRequestActionTaskRecord() {
    return currencyExchangeTransactionRequestActionTaskRecord;
  }

  public void setCurrencyExchangeTransactionRequestActionTaskRecord(Object currencyExchangeTransactionRequestActionTaskRecord) {
    this.currencyExchangeTransactionRequestActionTaskRecord = currencyExchangeTransactionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCurrencyExchangeTransactionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCurrencyExchangeTransactionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

