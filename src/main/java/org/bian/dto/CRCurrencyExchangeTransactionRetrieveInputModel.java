package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceAnalysis;
import org.bian.dto.CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionRetrieveInputModel
 */
public class CRCurrencyExchangeTransactionRetrieveInputModel   {
  private Object currencyExchangeTransactionRetrieveActionTaskRecord = null;

  private String currencyExchangeTransactionRetrieveActionRequest = null;

  private CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceReportRecord currencyExchangeTransactionInstanceReportRecord = null;

  private CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceAnalysis currencyExchangeTransactionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return currencyExchangeTransactionRetrieveActionRequest
  **/

  public String getCurrencyExchangeTransactionRetrieveActionRequest() {
    return currencyExchangeTransactionRetrieveActionRequest;
  }

  public void setCurrencyExchangeTransactionRetrieveActionRequest(String currencyExchangeTransactionRetrieveActionRequest) {
    this.currencyExchangeTransactionRetrieveActionRequest = currencyExchangeTransactionRetrieveActionRequest;
  }


  /**
   * Get currencyExchangeTransactionInstanceReportRecord
   * @return currencyExchangeTransactionInstanceReportRecord
  **/

  public CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceReportRecord getCurrencyExchangeTransactionInstanceReportRecord() {
    return currencyExchangeTransactionInstanceReportRecord;
  }

  public void setCurrencyExchangeTransactionInstanceReportRecord(CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceReportRecord currencyExchangeTransactionInstanceReportRecord) {
    this.currencyExchangeTransactionInstanceReportRecord = currencyExchangeTransactionInstanceReportRecord;
  }


  /**
   * Get currencyExchangeTransactionInstanceAnalysis
   * @return currencyExchangeTransactionInstanceAnalysis
  **/

  public CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceAnalysis getCurrencyExchangeTransactionInstanceAnalysis() {
    return currencyExchangeTransactionInstanceAnalysis;
  }

  public void setCurrencyExchangeTransactionInstanceAnalysis(CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceAnalysis currencyExchangeTransactionInstanceAnalysis) {
    this.currencyExchangeTransactionInstanceAnalysis = currencyExchangeTransactionInstanceAnalysis;
  }


}

