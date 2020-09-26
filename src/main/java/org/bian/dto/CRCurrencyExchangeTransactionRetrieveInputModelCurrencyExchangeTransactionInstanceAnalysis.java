package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceAnalysis
 */
public class CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceAnalysis   {
  private String currencyExchangeTransactionInstanceAnalysisReference = null;

  private String currencyExchangeTransactionInstanceAnalysisReportType = null;

  private String currencyExchangeTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return currencyExchangeTransactionInstanceAnalysisReference
  **/

  public String getCurrencyExchangeTransactionInstanceAnalysisReference() {
    return currencyExchangeTransactionInstanceAnalysisReference;
  }

  public void setCurrencyExchangeTransactionInstanceAnalysisReference(String currencyExchangeTransactionInstanceAnalysisReference) {
    this.currencyExchangeTransactionInstanceAnalysisReference = currencyExchangeTransactionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return currencyExchangeTransactionInstanceAnalysisParameters
  **/

  public String getCurrencyExchangeTransactionInstanceAnalysisParameters() {
    return currencyExchangeTransactionInstanceAnalysisParameters;
  }

  public void setCurrencyExchangeTransactionInstanceAnalysisParameters(String currencyExchangeTransactionInstanceAnalysisParameters) {
    this.currencyExchangeTransactionInstanceAnalysisParameters = currencyExchangeTransactionInstanceAnalysisParameters;
  }


}

