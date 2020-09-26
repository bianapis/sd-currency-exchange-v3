package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrencyExchangeTransactionControlInputModelCurrencyExchangeTransactionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionControlInputModel
 */
public class CRCurrencyExchangeTransactionControlInputModel   {
  private String currencyExchangeServicingSessionReference = null;

  private String currencyExchangeTransactionInstanceReference = null;

  private String currencyExchangeTransactionParameterType = null;

  private String currencyExchangeTransactionSelectedOption = null;

  private String currencyExchangeTransactionStatus = null;

  private String currencyExchangeTransactionType = null;

  private String currencyExchangeTransactionTransactionType = null;

  private Object currencyExchangeTransactionControlActionTaskRecord = null;

  private CRCurrencyExchangeTransactionControlInputModelCurrencyExchangeTransactionControlActionRequest currencyExchangeTransactionControlActionRequest = null;


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
   * Get currencyExchangeTransactionControlActionRequest
   * @return currencyExchangeTransactionControlActionRequest
  **/

  public CRCurrencyExchangeTransactionControlInputModelCurrencyExchangeTransactionControlActionRequest getCurrencyExchangeTransactionControlActionRequest() {
    return currencyExchangeTransactionControlActionRequest;
  }

  public void setCurrencyExchangeTransactionControlActionRequest(CRCurrencyExchangeTransactionControlInputModelCurrencyExchangeTransactionControlActionRequest currencyExchangeTransactionControlActionRequest) {
    this.currencyExchangeTransactionControlActionRequest = currencyExchangeTransactionControlActionRequest;
  }


}

