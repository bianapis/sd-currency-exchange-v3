package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceAnalysis;
import org.bian.dto.BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDocumentHandlingRetrieveInputModel
 */
public class BQDocumentHandlingRetrieveInputModel   {
  private Object documentHandlingRetrieveActionTaskRecord = null;

  private String documentHandlingRetrieveActionRequest = null;

  private BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceReport documentHandlingInstanceReport = null;

  private BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceAnalysis documentHandlingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return documentHandlingRetrieveActionTaskRecord
  **/

  public Object getDocumentHandlingRetrieveActionTaskRecord() {
    return documentHandlingRetrieveActionTaskRecord;
  }

  public void setDocumentHandlingRetrieveActionTaskRecord(Object documentHandlingRetrieveActionTaskRecord) {
    this.documentHandlingRetrieveActionTaskRecord = documentHandlingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return documentHandlingRetrieveActionRequest
  **/

  public String getDocumentHandlingRetrieveActionRequest() {
    return documentHandlingRetrieveActionRequest;
  }

  public void setDocumentHandlingRetrieveActionRequest(String documentHandlingRetrieveActionRequest) {
    this.documentHandlingRetrieveActionRequest = documentHandlingRetrieveActionRequest;
  }


  /**
   * Get documentHandlingInstanceReport
   * @return documentHandlingInstanceReport
  **/

  public BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceReport getDocumentHandlingInstanceReport() {
    return documentHandlingInstanceReport;
  }

  public void setDocumentHandlingInstanceReport(BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceReport documentHandlingInstanceReport) {
    this.documentHandlingInstanceReport = documentHandlingInstanceReport;
  }


  /**
   * Get documentHandlingInstanceAnalysis
   * @return documentHandlingInstanceAnalysis
  **/

  public BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceAnalysis getDocumentHandlingInstanceAnalysis() {
    return documentHandlingInstanceAnalysis;
  }

  public void setDocumentHandlingInstanceAnalysis(BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceAnalysis documentHandlingInstanceAnalysis) {
    this.documentHandlingInstanceAnalysis = documentHandlingInstanceAnalysis;
  }


}

