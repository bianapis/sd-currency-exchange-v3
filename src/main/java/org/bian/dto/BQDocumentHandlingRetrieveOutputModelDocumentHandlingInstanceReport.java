package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceReport
 */
public class BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceReport   {
  private Object documentHandlingInstanceReportRecord = null;

  private String documentHandlingInstanceReportType = null;

  private String documentHandlingInstanceReportParameters = null;

  private Object documentHandlingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return documentHandlingInstanceReportRecord
  **/

  public Object getDocumentHandlingInstanceReportRecord() {
    return documentHandlingInstanceReportRecord;
  }

  public void setDocumentHandlingInstanceReportRecord(Object documentHandlingInstanceReportRecord) {
    this.documentHandlingInstanceReportRecord = documentHandlingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return documentHandlingInstanceReportType
  **/

  public String getDocumentHandlingInstanceReportType() {
    return documentHandlingInstanceReportType;
  }

  public void setDocumentHandlingInstanceReportType(String documentHandlingInstanceReportType) {
    this.documentHandlingInstanceReportType = documentHandlingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return documentHandlingInstanceReportParameters
  **/

  public String getDocumentHandlingInstanceReportParameters() {
    return documentHandlingInstanceReportParameters;
  }

  public void setDocumentHandlingInstanceReportParameters(String documentHandlingInstanceReportParameters) {
    this.documentHandlingInstanceReportParameters = documentHandlingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return documentHandlingInstanceReport
  **/

  public Object getDocumentHandlingInstanceReport() {
    return documentHandlingInstanceReport;
  }

  public void setDocumentHandlingInstanceReport(Object documentHandlingInstanceReport) {
    this.documentHandlingInstanceReport = documentHandlingInstanceReport;
  }


}

