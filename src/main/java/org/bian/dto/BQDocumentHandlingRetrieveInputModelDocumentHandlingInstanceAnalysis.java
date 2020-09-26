package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceAnalysis
 */
public class BQDocumentHandlingRetrieveInputModelDocumentHandlingInstanceAnalysis   {
  private String documentHandlingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return documentHandlingInstanceAnalysisReference
  **/

  public String getDocumentHandlingInstanceAnalysisReference() {
    return documentHandlingInstanceAnalysisReference;
  }

  public void setDocumentHandlingInstanceAnalysisReference(String documentHandlingInstanceAnalysisReference) {
    this.documentHandlingInstanceAnalysisReference = documentHandlingInstanceAnalysisReference;
  }


}

