package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceAnalysis;
import org.bian.dto.BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDocumentHandlingRetrieveOutputModel
 */
public class BQDocumentHandlingRetrieveOutputModel   {
  private String documentHandlingPreconditions = null;

  private String documentHandlingTaskSchedule = null;

  private String documentServices = null;

  private String documentHandlingPostconditions = null;

  private String documentHandlingDocumentServicesServiceType = null;

  private String documentHandlingDocumentServicesServiceDescription = null;

  private String documentHandlingDocumentServicesServiceInputsandOuputs = null;

  private String documentHandlingDocumentServicesServiceWorkProduct = null;

  private String documentHandlingDocumentServicesServiceName = null;

  private String documentHandlingRetrieveActionTaskReference = null;

  private Object documentHandlingRetrieveActionTaskRecord = null;

  private String documentHandlingRetrieveActionResponse = null;

  private BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceReport documentHandlingInstanceReport = null;

  private BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceAnalysis documentHandlingInstanceAnalysis = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Document Handling instance retrieve service call 
   * @return documentHandlingRetrieveActionTaskReference
  **/

  public String getDocumentHandlingRetrieveActionTaskReference() {
    return documentHandlingRetrieveActionTaskReference;
  }

  public void setDocumentHandlingRetrieveActionTaskReference(String documentHandlingRetrieveActionTaskReference) {
    this.documentHandlingRetrieveActionTaskReference = documentHandlingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return documentHandlingRetrieveActionTaskRecord
  **/

  public Object getDocumentHandlingRetrieveActionTaskRecord() {
    return documentHandlingRetrieveActionTaskRecord;
  }

  public void setDocumentHandlingRetrieveActionTaskRecord(Object documentHandlingRetrieveActionTaskRecord) {
    this.documentHandlingRetrieveActionTaskRecord = documentHandlingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return documentHandlingRetrieveActionResponse
  **/

  public String getDocumentHandlingRetrieveActionResponse() {
    return documentHandlingRetrieveActionResponse;
  }

  public void setDocumentHandlingRetrieveActionResponse(String documentHandlingRetrieveActionResponse) {
    this.documentHandlingRetrieveActionResponse = documentHandlingRetrieveActionResponse;
  }


  /**
   * Get documentHandlingInstanceReport
   * @return documentHandlingInstanceReport
  **/

  public BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceReport getDocumentHandlingInstanceReport() {
    return documentHandlingInstanceReport;
  }

  public void setDocumentHandlingInstanceReport(BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceReport documentHandlingInstanceReport) {
    this.documentHandlingInstanceReport = documentHandlingInstanceReport;
  }


  /**
   * Get documentHandlingInstanceAnalysis
   * @return documentHandlingInstanceAnalysis
  **/

  public BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceAnalysis getDocumentHandlingInstanceAnalysis() {
    return documentHandlingInstanceAnalysis;
  }

  public void setDocumentHandlingInstanceAnalysis(BQDocumentHandlingRetrieveOutputModelDocumentHandlingInstanceAnalysis documentHandlingInstanceAnalysis) {
    this.documentHandlingInstanceAnalysis = documentHandlingInstanceAnalysis;
  }


}

