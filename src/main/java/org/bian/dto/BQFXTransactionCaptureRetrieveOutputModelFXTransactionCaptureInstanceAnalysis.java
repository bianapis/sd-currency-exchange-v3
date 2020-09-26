package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceAnalysis
 */
public class BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceAnalysis   {
  private Object fXTransactionCaptureInstanceAnalysisRecord = null;

  private String fXTransactionCaptureInstanceAnalysisReportType = null;

  private String fXTransactionCaptureInstanceAnalysisParameters = null;

  private Object fXTransactionCaptureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fXTransactionCaptureInstanceAnalysisRecord
  **/

  public Object getFXTransactionCaptureInstanceAnalysisRecord() {
    return fXTransactionCaptureInstanceAnalysisRecord;
  }

  public void setFXTransactionCaptureInstanceAnalysisRecord(Object fXTransactionCaptureInstanceAnalysisRecord) {
    this.fXTransactionCaptureInstanceAnalysisRecord = fXTransactionCaptureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fXTransactionCaptureInstanceAnalysisReportType
  **/

  public String getFXTransactionCaptureInstanceAnalysisReportType() {
    return fXTransactionCaptureInstanceAnalysisReportType;
  }

  public void setFXTransactionCaptureInstanceAnalysisReportType(String fXTransactionCaptureInstanceAnalysisReportType) {
    this.fXTransactionCaptureInstanceAnalysisReportType = fXTransactionCaptureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fXTransactionCaptureInstanceAnalysisParameters
  **/

  public String getFXTransactionCaptureInstanceAnalysisParameters() {
    return fXTransactionCaptureInstanceAnalysisParameters;
  }

  public void setFXTransactionCaptureInstanceAnalysisParameters(String fXTransactionCaptureInstanceAnalysisParameters) {
    this.fXTransactionCaptureInstanceAnalysisParameters = fXTransactionCaptureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fXTransactionCaptureInstanceAnalysisReport
  **/

  public Object getFXTransactionCaptureInstanceAnalysisReport() {
    return fXTransactionCaptureInstanceAnalysisReport;
  }

  public void setFXTransactionCaptureInstanceAnalysisReport(Object fXTransactionCaptureInstanceAnalysisReport) {
    this.fXTransactionCaptureInstanceAnalysisReport = fXTransactionCaptureInstanceAnalysisReport;
  }


}

