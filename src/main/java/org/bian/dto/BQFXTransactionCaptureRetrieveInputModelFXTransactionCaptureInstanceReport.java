package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceReport
 */
public class BQFXTransactionCaptureRetrieveInputModelFXTransactionCaptureInstanceReport   {
  private String fXTransactionCaptureInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fXTransactionCaptureInstanceReportReference
  **/

  public String getFXTransactionCaptureInstanceReportReference() {
    return fXTransactionCaptureInstanceReportReference;
  }

  public void setFXTransactionCaptureInstanceReportReference(String fXTransactionCaptureInstanceReportReference) {
    this.fXTransactionCaptureInstanceReportReference = fXTransactionCaptureInstanceReportReference;
  }


}

