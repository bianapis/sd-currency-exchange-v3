package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceAnalysis;
import org.bian.dto.BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFXTransactionCaptureRetrieveInputModel
 */
public class BQFXTransactionCaptureRetrieveInputModel   {
  private Object fXTransactionCaptureRetrieveActionTaskRecord = null;

  private String fXTransactionCaptureRetrieveActionRequest = null;

  private BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceReport fXTransactionCaptureInstanceReport = null;

  private BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceAnalysis fXTransactionCaptureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fXTransactionCaptureRetrieveActionTaskRecord
  **/

  public Object getFXTransactionCaptureRetrieveActionTaskRecord() {
    return fXTransactionCaptureRetrieveActionTaskRecord;
  }

  public void setFXTransactionCaptureRetrieveActionTaskRecord(Object fXTransactionCaptureRetrieveActionTaskRecord) {
    this.fXTransactionCaptureRetrieveActionTaskRecord = fXTransactionCaptureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fXTransactionCaptureRetrieveActionRequest
  **/

  public String getFXTransactionCaptureRetrieveActionRequest() {
    return fXTransactionCaptureRetrieveActionRequest;
  }

  public void setFXTransactionCaptureRetrieveActionRequest(String fXTransactionCaptureRetrieveActionRequest) {
    this.fXTransactionCaptureRetrieveActionRequest = fXTransactionCaptureRetrieveActionRequest;
  }


  /**
   * Get fXTransactionCaptureInstanceReport
   * @return fXTransactionCaptureInstanceReport
  **/

  public BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceReport getFXTransactionCaptureInstanceReport() {
    return fXTransactionCaptureInstanceReport;
  }

  public void setFXTransactionCaptureInstanceReport(BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceReport fXTransactionCaptureInstanceReport) {
    this.fXTransactionCaptureInstanceReport = fXTransactionCaptureInstanceReport;
  }


  /**
   * Get fXTransactionCaptureInstanceAnalysis
   * @return fXTransactionCaptureInstanceAnalysis
  **/

  public BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceAnalysis getFXTransactionCaptureInstanceAnalysis() {
    return fXTransactionCaptureInstanceAnalysis;
  }

  public void setFXTransactionCaptureInstanceAnalysis(BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceAnalysis fXTransactionCaptureInstanceAnalysis) {
    this.fXTransactionCaptureInstanceAnalysis = fXTransactionCaptureInstanceAnalysis;
  }


}

