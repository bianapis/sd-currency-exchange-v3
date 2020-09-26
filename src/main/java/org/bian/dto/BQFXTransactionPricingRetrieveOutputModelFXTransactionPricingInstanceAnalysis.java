package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceAnalysis
 */
public class BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceAnalysis   {
  private Object fXTransactionPricingInstanceAnalysisRecord = null;

  private String fXTransactionPricingInstanceAnalysisReportType = null;

  private String fXTransactionPricingInstanceAnalysisParameters = null;

  private Object fXTransactionPricingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fXTransactionPricingInstanceAnalysisRecord
  **/

  public Object getFXTransactionPricingInstanceAnalysisRecord() {
    return fXTransactionPricingInstanceAnalysisRecord;
  }

  public void setFXTransactionPricingInstanceAnalysisRecord(Object fXTransactionPricingInstanceAnalysisRecord) {
    this.fXTransactionPricingInstanceAnalysisRecord = fXTransactionPricingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fXTransactionPricingInstanceAnalysisReportType
  **/

  public String getFXTransactionPricingInstanceAnalysisReportType() {
    return fXTransactionPricingInstanceAnalysisReportType;
  }

  public void setFXTransactionPricingInstanceAnalysisReportType(String fXTransactionPricingInstanceAnalysisReportType) {
    this.fXTransactionPricingInstanceAnalysisReportType = fXTransactionPricingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fXTransactionPricingInstanceAnalysisParameters
  **/

  public String getFXTransactionPricingInstanceAnalysisParameters() {
    return fXTransactionPricingInstanceAnalysisParameters;
  }

  public void setFXTransactionPricingInstanceAnalysisParameters(String fXTransactionPricingInstanceAnalysisParameters) {
    this.fXTransactionPricingInstanceAnalysisParameters = fXTransactionPricingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fXTransactionPricingInstanceAnalysisReport
  **/

  public Object getFXTransactionPricingInstanceAnalysisReport() {
    return fXTransactionPricingInstanceAnalysisReport;
  }

  public void setFXTransactionPricingInstanceAnalysisReport(Object fXTransactionPricingInstanceAnalysisReport) {
    this.fXTransactionPricingInstanceAnalysisReport = fXTransactionPricingInstanceAnalysisReport;
  }


}

