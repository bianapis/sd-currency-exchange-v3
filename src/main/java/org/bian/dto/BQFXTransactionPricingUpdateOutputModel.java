package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionPricingUpdateOutputModel
 */
public class BQFXTransactionPricingUpdateOutputModel   {
  private String fXTransactionPricingPreconditions = null;

  private String fXTransactionPricingTaskSchedule = null;

  private String oTCFXTransactionPricing = null;

  private String fXTransactionPricingPostconditions = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceType = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceDescription = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceWorkProduct = null;

  private String fXTransactionPricingOTCFXTransactionPricingServiceName = null;

  private String fXTransactionPricingUpdateActionTaskReference = null;

  private Object fXTransactionPricingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return fXTransactionPricingUpdateActionTaskReference
  **/

  public String getFXTransactionPricingUpdateActionTaskReference() {
    return fXTransactionPricingUpdateActionTaskReference;
  }

  public void setFXTransactionPricingUpdateActionTaskReference(String fXTransactionPricingUpdateActionTaskReference) {
    this.fXTransactionPricingUpdateActionTaskReference = fXTransactionPricingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return fXTransactionPricingUpdateActionTaskRecord
  **/

  public Object getFXTransactionPricingUpdateActionTaskRecord() {
    return fXTransactionPricingUpdateActionTaskRecord;
  }

  public void setFXTransactionPricingUpdateActionTaskRecord(Object fXTransactionPricingUpdateActionTaskRecord) {
    this.fXTransactionPricingUpdateActionTaskRecord = fXTransactionPricingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

