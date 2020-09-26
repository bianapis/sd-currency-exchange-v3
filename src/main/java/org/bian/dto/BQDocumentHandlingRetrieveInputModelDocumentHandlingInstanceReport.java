package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceReport
 */
public class BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceReport   {
  private String documentHandlingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return documentHandlingInstanceReportReference
  **/

  public String getDocumentHandlingInstanceReportReference() {
    return documentHandlingInstanceReportReference;
  }

  public void setDocumentHandlingInstanceReportReference(String documentHandlingInstanceReportReference) {
    this.documentHandlingInstanceReportReference = documentHandlingInstanceReportReference;
  }


}

