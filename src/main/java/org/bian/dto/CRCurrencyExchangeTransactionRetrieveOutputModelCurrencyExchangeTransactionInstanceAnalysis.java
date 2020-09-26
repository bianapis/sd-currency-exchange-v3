package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceAnalysis
 */
public class CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceAnalysis   {
  private String currencyExchangeTransactionInstanceAnalysisData = null;

  private String currencyExchangeTransactionInstanceAnalysisReportType = null;

  private Object currencyExchangeTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return currencyExchangeTransactionInstanceAnalysisData
  **/

  public String getCurrencyExchangeTransactionInstanceAnalysisData() {
    return currencyExchangeTransactionInstanceAnalysisData;
  }

  public void setCurrencyExchangeTransactionInstanceAnalysisData(String currencyExchangeTransactionInstanceAnalysisData) {
    this.currencyExchangeTransactionInstanceAnalysisData = currencyExchangeTransactionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return currencyExchangeTransactionInstanceAnalysisReportType
  **/

  public String getCurrencyExchangeTransactionInstanceAnalysisReportType() {
    return currencyExchangeTransactionInstanceAnalysisReportType;
  }

  public void setCurrencyExchangeTransactionInstanceAnalysisReportType(String currencyExchangeTransactionInstanceAnalysisReportType) {
    this.currencyExchangeTransactionInstanceAnalysisReportType = currencyExchangeTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return currencyExchangeTransactionInstanceAnalysisReport
  **/

  public Object getCurrencyExchangeTransactionInstanceAnalysisReport() {
    return currencyExchangeTransactionInstanceAnalysisReport;
  }

  public void setCurrencyExchangeTransactionInstanceAnalysisReport(Object currencyExchangeTransactionInstanceAnalysisReport) {
    this.currencyExchangeTransactionInstanceAnalysisReport = currencyExchangeTransactionInstanceAnalysisReport;
  }


}

