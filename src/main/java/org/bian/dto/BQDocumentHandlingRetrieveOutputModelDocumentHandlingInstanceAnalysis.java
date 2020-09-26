package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceAnalysis
 */
public class BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceAnalysis   {
  private Object documentHandlingInstanceAnalysisRecord = null;

  private String documentHandlingInstanceAnalysisReportType = null;

  private String documentHandlingInstanceAnalysisParameters = null;

  private Object documentHandlingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return documentHandlingInstanceAnalysisRecord
  **/

  public Object getDocumentHandlingInstanceAnalysisRecord() {
    return documentHandlingInstanceAnalysisRecord;
  }

  public void setDocumentHandlingInstanceAnalysisRecord(Object documentHandlingInstanceAnalysisRecord) {
    this.documentHandlingInstanceAnalysisRecord = documentHandlingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return documentHandlingInstanceAnalysisReportType
  **/

  public String getDocumentHandlingInstanceAnalysisReportType() {
    return documentHandlingInstanceAnalysisReportType;
  }

  public void setDocumentHandlingInstanceAnalysisReportType(String documentHandlingInstanceAnalysisReportType) {
    this.documentHandlingInstanceAnalysisReportType = documentHandlingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return documentHandlingInstanceAnalysisParameters
  **/

  public String getDocumentHandlingInstanceAnalysisParameters() {
    return documentHandlingInstanceAnalysisParameters;
  }

  public void setDocumentHandlingInstanceAnalysisParameters(String documentHandlingInstanceAnalysisParameters) {
    this.documentHandlingInstanceAnalysisParameters = documentHandlingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return documentHandlingInstanceAnalysisReport
  **/

  public Object getDocumentHandlingInstanceAnalysisReport() {
    return documentHandlingInstanceAnalysisReport;
  }

  public void setDocumentHandlingInstanceAnalysisReport(Object documentHandlingInstanceAnalysisReport) {
    this.documentHandlingInstanceAnalysisReport = documentHandlingInstanceAnalysisReport;
  }


}

