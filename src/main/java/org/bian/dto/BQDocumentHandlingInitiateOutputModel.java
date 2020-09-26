package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentHandlingInitiateOutputModel
 */
public class BQDocumentHandlingInitiateOutputModel   {
  private String documentHandlingInstanceReference = null;

  private String documentHandlingInitiateActionReference = null;

  private Object documentHandlingInitiateActionRecord = null;

  private String documentHandlingInstanceStatus = null;

  private String documentHandlingPreconditions = null;

  private String documentHandlingTaskSchedule = null;

  private String documentServices = null;

  private String documentHandlingPostconditions = null;

  private String documentHandlingDocumentServicesServiceType = null;

  private String documentHandlingDocumentServicesServiceDescription = null;

  private String documentHandlingDocumentServicesServiceInputsandOuputs = null;

  private String documentHandlingDocumentServicesServiceWorkProduct = null;

  private String documentHandlingDocumentServicesServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Document Handling instance 
   * @return documentHandlingInstanceReference
  **/

  public String getDocumentHandlingInstanceReference() {
    return documentHandlingInstanceReference;
  }

  public void setDocumentHandlingInstanceReference(String documentHandlingInstanceReference) {
    this.documentHandlingInstanceReference = documentHandlingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return documentHandlingInitiateActionReference
  **/

  public String getDocumentHandlingInitiateActionReference() {
    return documentHandlingInitiateActionReference;
  }

  public void setDocumentHandlingInitiateActionReference(String documentHandlingInitiateActionReference) {
    this.documentHandlingInitiateActionReference = documentHandlingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return documentHandlingInitiateActionRecord
  **/

  public Object getDocumentHandlingInitiateActionRecord() {
    return documentHandlingInitiateActionRecord;
  }

  public void setDocumentHandlingInitiateActionRecord(Object documentHandlingInitiateActionRecord) {
    this.documentHandlingInitiateActionRecord = documentHandlingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Document Handling instance (e.g. initialised, pending, active) 
   * @return documentHandlingInstanceStatus
  **/

  public String getDocumentHandlingInstanceStatus() {
    return documentHandlingInstanceStatus;
  }

  public void setDocumentHandlingInstanceStatus(String documentHandlingInstanceStatus) {
    this.documentHandlingInstanceStatus = documentHandlingInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return documentHandlingPreconditions
  **/

  public String getDocumentHandlingPreconditions() {
    return documentHandlingPreconditions;
  }

  public void setDocumentHandlingPreconditions(String documentHandlingPreconditions) {
    this.documentHandlingPreconditions = documentHandlingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return documentHandlingTaskSchedule
  **/

  public String getDocumentHandlingTaskSchedule() {
    return documentHandlingTaskSchedule;
  }

  public void setDocumentHandlingTaskSchedule(String documentHandlingTaskSchedule) {
    this.documentHandlingTaskSchedule = documentHandlingTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Currency Exchange Transaction specific Business Service 
   * @return documentServices
  **/

  public String getDocumentServices() {
    return documentServices;
  }

  public void setDocumentServices(String documentServices) {
    this.documentServices = documentServices;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return documentHandlingPostconditions
  **/

  public String getDocumentHandlingPostconditions() {
    return documentHandlingPostconditions;
  }

  public void setDocumentHandlingPostconditions(String documentHandlingPostconditions) {
    this.documentHandlingPostconditions = documentHandlingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return documentHandlingDocumentServicesServiceType
  **/

  public String getDocumentHandlingDocumentServicesServiceType() {
    return documentHandlingDocumentServicesServiceType;
  }

  public void setDocumentHandlingDocumentServicesServiceType(String documentHandlingDocumentServicesServiceType) {
    this.documentHandlingDocumentServicesServiceType = documentHandlingDocumentServicesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return documentHandlingDocumentServicesServiceDescription
  **/

  public String getDocumentHandlingDocumentServicesServiceDescription() {
    return documentHandlingDocumentServicesServiceDescription;
  }

  public void setDocumentHandlingDocumentServicesServiceDescription(String documentHandlingDocumentServicesServiceDescription) {
    this.documentHandlingDocumentServicesServiceDescription = documentHandlingDocumentServicesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return documentHandlingDocumentServicesServiceInputsandOuputs
  **/

  public String getDocumentHandlingDocumentServicesServiceInputsandOuputs() {
    return documentHandlingDocumentServicesServiceInputsandOuputs;
  }

  public void setDocumentHandlingDocumentServicesServiceInputsandOuputs(String documentHandlingDocumentServicesServiceInputsandOuputs) {
    this.documentHandlingDocumentServicesServiceInputsandOuputs = documentHandlingDocumentServicesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return documentHandlingDocumentServicesServiceWorkProduct
  **/

  public String getDocumentHandlingDocumentServicesServiceWorkProduct() {
    return documentHandlingDocumentServicesServiceWorkProduct;
  }

  public void setDocumentHandlingDocumentServicesServiceWorkProduct(String documentHandlingDocumentServicesServiceWorkProduct) {
    this.documentHandlingDocumentServicesServiceWorkProduct = documentHandlingDocumentServicesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return documentHandlingDocumentServicesServiceName
  **/

  public String getDocumentHandlingDocumentServicesServiceName() {
    return documentHandlingDocumentServicesServiceName;
  }

  public void setDocumentHandlingDocumentServicesServiceName(String documentHandlingDocumentServicesServiceName) {
    this.documentHandlingDocumentServicesServiceName = documentHandlingDocumentServicesServiceName;
  }


}

