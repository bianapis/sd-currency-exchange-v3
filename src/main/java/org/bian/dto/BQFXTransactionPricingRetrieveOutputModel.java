package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceAnalysis;
import org.bian.dto.BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFXTransactionPricingRetrieveOutputModel
 */
public class BQFXTransactionPricingRetrieveOutputModel   {
  private String fXTransactionPricingPreconditions = null;

  private String fXTransactionPricingTaskSchedule = null;

  private String oTCFXTransactionPricing = null;

  private String fXTransactionPricingPostconditions = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceType = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceDescription = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceWorkProduct = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceName = null;

  private String fXTransactionPricingRetrieveActionTaskReference = null;

  private Object fXTransactionPricingRetrieveActionTaskRecord = null;

  private String fXTransactionPricingRetrieveActionResponse = null;

  private BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceReport fXTransactionPricingInstanceReport = null;

  private BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceAnalysis fXTransactionPricingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return fXTransactionPricingPreconditions
  **/

  public String getFXTransactionPricingPreconditions() {
    return fXTransactionPricingPreconditions;
  }

  public void setFXTransactionPricingPreconditions(String fXTransactionPricingPreconditions) {
    this.fXTransactionPricingPreconditions = fXTransactionPricingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return fXTransactionPricingTaskSchedule
  **/

  public String getFXTransactionPricingTaskSchedule() {
    return fXTransactionPricingTaskSchedule;
  }

  public void setFXTransactionPricingTaskSchedule(String fXTransactionPricingTaskSchedule) {
    this.fXTransactionPricingTaskSchedule = fXTransactionPricingTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Currency Exchange Transaction specific Business Service 
   * @return oTCFXTransactionPricing
  **/

  public String getOTCFXTransactionPricing() {
    return oTCFXTransactionPricing;
  }

  public void setOTCFXTransactionPricing(String oTCFXTransactionPricing) {
    this.oTCFXTransactionPricing = oTCFXTransactionPricing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return fXTransactionPricingPostconditions
  **/

  public String getFXTransactionPricingPostconditions() {
    return fXTransactionPricingPostconditions;
  }

  public void setFXTransactionPricingPostconditions(String fXTransactionPricingPostconditions) {
    this.fXTransactionPricingPostconditions = fXTransactionPricingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return fXTransactionPricingOTCFXTransactionPricingServiceType
  **/

  public String getFXTransactionPricingOTCFXTransactionPricingServiceType() {
    return fXTransactionPricingOTCFXTransactionPricingServiceType;
  }

  public void setFXTransactionPricingOTCFXTransactionPricingServiceType(String fXTransactionPricingOTCFXTransactionPricingServiceType) {
    this.fXTransactionPricingOTCFXTransactionPricingServiceType = fXTransactionPricingOTCFXTransactionPricingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return fXTransactionPricingOTCFXTransactionPricingServiceDescription
  **/

  public String getFXTransactionPricingOTCFXTransactionPricingServiceDescription() {
    return fXTransactionPricingOTCFXTransactionPricingServiceDescription;
  }

  public void setFXTransactionPricingOTCFXTransactionPricingServiceDescription(String fXTransactionPricingOTCFXTransactionPricingServiceDescription) {
    this.fXTransactionPricingOTCFXTransactionPricingServiceDescription = fXTransactionPricingOTCFXTransactionPricingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return fXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs
  **/

  public String getFXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs() {
    return fXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs;
  }

  public void setFXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs(String fXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs) {
    this.fXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs = fXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return fXTransactionPricingOTCFXTransactionPricingServiceWorkProduct
  **/

  public String getFXTransactionPricingOTCFXTransactionPricingServiceWorkProduct() {
    return fXTransactionPricingOTCFXTransactionPricingServiceWorkProduct;
  }

  public void setFXTransactionPricingOTCFXTransactionPricingServiceWorkProduct(String fXTransactionPricingOTCFXTransactionPricingServiceWorkProduct) {
    this.fXTransactionPricingOTCFXTransactionPricingServiceWorkProduct = fXTransactionPricingOTCFXTransactionPricingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return fXTransactionPricingOTCFXTransactionPricingServiceName
  **/

  public String getFXTransactionPricingOTCFXTransactionPricingServiceName() {
    return fXTransactionPricingOTCFXTransactionPricingServiceName;
  }

  public void setFXTransactionPricingOTCFXTransactionPricingServiceName(String fXTransactionPricingOTCFXTransactionPricingServiceName) {
    this.fXTransactionPricingOTCFXTransactionPricingServiceName = fXTransactionPricingOTCFXTransactionPricingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a FXTransaction Pricing instance retrieve service call 
   * @return fXTransactionPricingRetrieveActionTaskReference
  **/

  public String getFXTransactionPricingRetrieveActionTaskReference() {
    return fXTransactionPricingRetrieveActionTaskReference;
  }

  public void setFXTransactionPricingRetrieveActionTaskReference(String fXTransactionPricingRetrieveActionTaskReference) {
    this.fXTransactionPricingRetrieveActionTaskReference = fXTransactionPricingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fXTransactionPricingRetrieveActionResponse
  **/

  public String getFXTransactionPricingRetrieveActionResponse() {
    return fXTransactionPricingRetrieveActionResponse;
  }

  public void setFXTransactionPricingRetrieveActionResponse(String fXTransactionPricingRetrieveActionResponse) {
    this.fXTransactionPricingRetrieveActionResponse = fXTransactionPricingRetrieveActionResponse;
  }


  /**
   * Get fXTransactionPricingInstanceReport
   * @return fXTransactionPricingInstanceReport
  **/

  public BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceReport getFXTransactionPricingInstanceReport() {
    return fXTransactionPricingInstanceReport;
  }

  public void setFXTransactionPricingInstanceReport(BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceReport fXTransactionPricingInstanceReport) {
    this.fXTransactionPricingInstanceReport = fXTransactionPricingInstanceReport;
  }


  /**
   * Get fXTransactionPricingInstanceAnalysis
   * @return fXTransactionPricingInstanceAnalysis
  **/

  public BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceAnalysis getFXTransactionPricingInstanceAnalysis() {
    return fXTransactionPricingInstanceAnalysis;
  }

  public void setFXTransactionPricingInstanceAnalysis(BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceAnalysis fXTransactionPricingInstanceAnalysis) {
    this.fXTransactionPricingInstanceAnalysis = fXTransactionPricingInstanceAnalysis;
  }


}

