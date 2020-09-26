package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceAnalysis;
import org.bian.dto.BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFXTransactionPricingRetrieveInputModel
 */
public class BQFXTransactionPricingRetrieveInputModel   {
  private Object fXTransactionPricingRetrieveActionTaskRecord = null;

  private String fXTransactionPricingRetrieveActionRequest = null;

  private BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceReport fXTransactionPricingInstanceReport = null;

  private BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceAnalysis fXTransactionPricingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fXTransactionPricingRetrieveActionTaskRecord
  **/

  public Object getFXTransactionPricingRetrieveActionTaskRecord() {
    return fXTransactionPricingRetrieveActionTaskRecord;
  }

  public void setFXTransactionPricingRetrieveActionTaskRecord(Object fXTransactionPricingRetrieveActionTaskRecord) {
    this.fXTransactionPricingRetrieveActionTaskRecord = fXTransactionPricingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fXTransactionPricingRetrieveActionRequest
  **/

  public String getFXTransactionPricingRetrieveActionRequest() {
    return fXTransactionPricingRetrieveActionRequest;
  }

  public void setFXTransactionPricingRetrieveActionRequest(String fXTransactionPricingRetrieveActionRequest) {
    this.fXTransactionPricingRetrieveActionRequest = fXTransactionPricingRetrieveActionRequest;
  }


  /**
   * Get fXTransactionPricingInstanceReport
   * @return fXTransactionPricingInstanceReport
  **/

  public BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceReport getFXTransactionPricingInstanceReport() {
    return fXTransactionPricingInstanceReport;
  }

  public void setFXTransactionPricingInstanceReport(BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceReport fXTransactionPricingInstanceReport) {
    this.fXTransactionPricingInstanceReport = fXTransactionPricingInstanceReport;
  }


  /**
   * Get fXTransactionPricingInstanceAnalysis
   * @return fXTransactionPricingInstanceAnalysis
  **/

  public BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceAnalysis getFXTransactionPricingInstanceAnalysis() {
    return fXTransactionPricingInstanceAnalysis;
  }

  public void setFXTransactionPricingInstanceAnalysis(BQFXTransactionPricingRetrieveInputModelFXTransactionPricingInstanceAnalysis fXTransactionPricingInstanceAnalysis) {
    this.fXTransactionPricingInstanceAnalysis = fXTransactionPricingInstanceAnalysis;
  }


}

