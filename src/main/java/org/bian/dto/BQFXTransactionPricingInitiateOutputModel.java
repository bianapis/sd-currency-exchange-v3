package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionPricingInitiateOutputModel
 */
public class BQFXTransactionPricingInitiateOutputModel   {
  private String fXTransactionPricingInstanceReference = null;

  private String fXTransactionPricingInitiateActionReference = null;

  private Object fXTransactionPricingInitiateActionRecord = null;

  private String fXTransactionPricingInstanceStatus = null;

  private String fXTransactionPricingPreconditions = null;

  private String fXTransactionPricingTaskSchedule = null;

  private String oTCFXTransactionPricing = null;

  private String fXTransactionPricingPostconditions = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceType = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceDescription = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceWorkProduct = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the FXTransaction Pricing instance 
   * @return fXTransactionPricingInstanceReference
  **/

  public String getFXTransactionPricingInstanceReference() {
    return fXTransactionPricingInstanceReference;
  }

  public void setFXTransactionPricingInstanceReference(String fXTransactionPricingInstanceReference) {
    this.fXTransactionPricingInstanceReference = fXTransactionPricingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return fXTransactionPricingInitiateActionReference
  **/

  public String getFXTransactionPricingInitiateActionReference() {
    return fXTransactionPricingInitiateActionReference;
  }

  public void setFXTransactionPricingInitiateActionReference(String fXTransactionPricingInitiateActionReference) {
    this.fXTransactionPricingInitiateActionReference = fXTransactionPricingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return fXTransactionPricingInitiateActionRecord
  **/

  public Object getFXTransactionPricingInitiateActionRecord() {
    return fXTransactionPricingInitiateActionRecord;
  }

  public void setFXTransactionPricingInitiateActionRecord(Object fXTransactionPricingInitiateActionRecord) {
    this.fXTransactionPricingInitiateActionRecord = fXTransactionPricingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the FXTransaction Pricing instance (e.g. initialised, pending, active) 
   * @return fXTransactionPricingInstanceStatus
  **/

  public String getFXTransactionPricingInstanceStatus() {
    return fXTransactionPricingInstanceStatus;
  }

  public void setFXTransactionPricingInstanceStatus(String fXTransactionPricingInstanceStatus) {
    this.fXTransactionPricingInstanceStatus = fXTransactionPricingInstanceStatus;
  }


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


}

