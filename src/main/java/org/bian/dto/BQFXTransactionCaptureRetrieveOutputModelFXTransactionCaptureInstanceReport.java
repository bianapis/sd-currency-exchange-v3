package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceReport
 */
public class BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceReport   {
  private Object fXTransactionCaptureInstanceReportRecord = null;

  private String fXTransactionCaptureInstanceReportType = null;

  private String fXTransactionCaptureInstanceReportParameters = null;

  private Object fXTransactionCaptureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fXTransactionCaptureInstanceReportRecord
  **/

  public Object getFXTransactionCaptureInstanceReportRecord() {
    return fXTransactionCaptureInstanceReportRecord;
  }

  public void setFXTransactionCaptureInstanceReportRecord(Object fXTransactionCaptureInstanceReportRecord) {
    this.fXTransactionCaptureInstanceReportRecord = fXTransactionCaptureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fXTransactionCaptureInstanceReportType
  **/

  public String getFXTransactionCaptureInstanceReportType() {
    return fXTransactionCaptureInstanceReportType;
  }

  public void setFXTransactionCaptureInstanceReportType(String fXTransactionCaptureInstanceReportType) {
    this.fXTransactionCaptureInstanceReportType = fXTransactionCaptureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fXTransactionCaptureInstanceReportParameters
  **/

  public String getFXTransactionCaptureInstanceReportParameters() {
    return fXTransactionCaptureInstanceReportParameters;
  }

  public void setFXTransactionCaptureInstanceReportParameters(String fXTransactionCaptureInstanceReportParameters) {
    this.fXTransactionCaptureInstanceReportParameters = fXTransactionCaptureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fXTransactionCaptureInstanceReport
  **/

  public Object getFXTransactionCaptureInstanceReport() {
    return fXTransactionCaptureInstanceReport;
  }

  public void setFXTransactionCaptureInstanceReport(Object fXTransactionCaptureInstanceReport) {
    this.fXTransactionCaptureInstanceReport = fXTransactionCaptureInstanceReport;
  }


}

