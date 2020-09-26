package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceAnalysis
 */
public class BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceAnalysis   {
  private String fXTransactionPricingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fXTransactionPricingInstanceAnalysisReference
  **/

  public String getFXTransactionPricingInstanceAnalysisReference() {
    return fXTransactionPricingInstanceAnalysisReference;
  }

  public void setFXTransactionPricingInstanceAnalysisReference(String fXTransactionPricingInstanceAnalysisReference) {
    this.fXTransactionPricingInstanceAnalysisReference = fXTransactionPricingInstanceAnalysisReference;
  }


}

