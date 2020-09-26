package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceReport
 */
public class BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceReport   {
  private String fXTransactionPricingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fXTransactionPricingInstanceReportReference
  **/

  public String getFXTransactionPricingInstanceReportReference() {
    return fXTransactionPricingInstanceReportReference;
  }

  public void setFXTransactionPricingInstanceReportReference(String fXTransactionPricingInstanceReportReference) {
    this.fXTransactionPricingInstanceReportReference = fXTransactionPricingInstanceReportReference;
  }


}

