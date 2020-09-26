package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceAnalysis;
import org.bian.dto.CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionRetrieveOutputModel
 */
public class CRCurrencyExchangeTransactionRetrieveOutputModel   {
  private String currencyExchangeTransactionParameterType = null;

  private String currencyExchangeTransactionSelectedOption = null;

  private String currencyExchangeTransactionStatus = null;

  private String currencyExchangeTransactionType = null;

  private String currencyExchangeTransactionTransactionType = null;

  private String currencyExchangeTransactionRetrieveActionTaskReference = null;

  private Object currencyExchangeTransactionRetrieveActionTaskRecord = null;

  private String currencyExchangeTransactionRetrieveActionResponse = null;

  private CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceReportRecord currencyExchangeTransactionInstanceReportRecord = null;

  private CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceAnalysis currencyExchangeTransactionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Currency Exchange Transaction instance retrieve service call 
   * @return currencyExchangeTransactionRetrieveActionTaskReference
  **/

  public String getCurrencyExchangeTransactionRetrieveActionTaskReference() {
    return currencyExchangeTransactionRetrieveActionTaskReference;
  }

  public void setCurrencyExchangeTransactionRetrieveActionTaskReference(String currencyExchangeTransactionRetrieveActionTaskReference) {
    this.currencyExchangeTransactionRetrieveActionTaskReference = currencyExchangeTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return currencyExchangeTransactionRetrieveActionTaskRecord
  **/

  public Object getCurrencyExchangeTransactionRetrieveActionTaskRecord() {
    return currencyExchangeTransactionRetrieveActionTaskRecord;
  }

  public void setCurrencyExchangeTransactionRetrieveActionTaskRecord(Object currencyExchangeTransactionRetrieveActionTaskRecord) {
    this.currencyExchangeTransactionRetrieveActionTaskRecord = currencyExchangeTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return currencyExchangeTransactionRetrieveActionResponse
  **/

  public String getCurrencyExchangeTransactionRetrieveActionResponse() {
    return currencyExchangeTransactionRetrieveActionResponse;
  }

  public void setCurrencyExchangeTransactionRetrieveActionResponse(String currencyExchangeTransactionRetrieveActionResponse) {
    this.currencyExchangeTransactionRetrieveActionResponse = currencyExchangeTransactionRetrieveActionResponse;
  }


  /**
   * Get currencyExchangeTransactionInstanceReportRecord
   * @return currencyExchangeTransactionInstanceReportRecord
  **/

  public CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceReportRecord getCurrencyExchangeTransactionInstanceReportRecord() {
    return currencyExchangeTransactionInstanceReportRecord;
  }

  public void setCurrencyExchangeTransactionInstanceReportRecord(CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceReportRecord currencyExchangeTransactionInstanceReportRecord) {
    this.currencyExchangeTransactionInstanceReportRecord = currencyExchangeTransactionInstanceReportRecord;
  }


  /**
   * Get currencyExchangeTransactionInstanceAnalysis
   * @return currencyExchangeTransactionInstanceAnalysis
  **/

  public CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceAnalysis getCurrencyExchangeTransactionInstanceAnalysis() {
    return currencyExchangeTransactionInstanceAnalysis;
  }

  public void setCurrencyExchangeTransactionInstanceAnalysis(CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceAnalysis currencyExchangeTransactionInstanceAnalysis) {
    this.currencyExchangeTransactionInstanceAnalysis = currencyExchangeTransactionInstanceAnalysis;
  }


}

