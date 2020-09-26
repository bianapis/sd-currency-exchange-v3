package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceAnalysis;
import org.bian.dto.BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFXTransactionCaptureRetrieveOutputModel
 */
public class BQFXTransactionCaptureRetrieveOutputModel   {
  private String fXTransactionCapturePreconditions = null;

  private String fXTransactionCaptureTaskSchedule = null;

  private String fXTransactionCapture = null;

  private String fXTransactionCapturePostconditions = null;

  private String fXTransactionCaptureFXTransactionCaptureServiceType = null;

  private String fXTransactionCaptureFXTransactionCaptureServiceDescription = null;

  private String fXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs = null;

  private String fXTransactionCaptureFXTransactionCaptureServiceWorkProduct = null;

  private String fXTransactionCaptureRetrieveActionTaskReference = null;

  private Object fXTransactionCaptureRetrieveActionTaskRecord = null;

  private String fXTransactionCaptureRetrieveActionResponse = null;

  private BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceReport fXTransactionCaptureInstanceReport = null;

  private BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceAnalysis fXTransactionCaptureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return fXTransactionCapturePreconditions
  **/

  public String getFXTransactionCapturePreconditions() {
    return fXTransactionCapturePreconditions;
  }

  public void setFXTransactionCapturePreconditions(String fXTransactionCapturePreconditions) {
    this.fXTransactionCapturePreconditions = fXTransactionCapturePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return fXTransactionCaptureTaskSchedule
  **/

  public String getFXTransactionCaptureTaskSchedule() {
    return fXTransactionCaptureTaskSchedule;
  }

  public void setFXTransactionCaptureTaskSchedule(String fXTransactionCaptureTaskSchedule) {
    this.fXTransactionCaptureTaskSchedule = fXTransactionCaptureTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Currency Exchange Transaction specific Business Service 
   * @return fXTransactionCapture
  **/

  public String getFXTransactionCapture() {
    return fXTransactionCapture;
  }

  public void setFXTransactionCapture(String fXTransactionCapture) {
    this.fXTransactionCapture = fXTransactionCapture;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return fXTransactionCapturePostconditions
  **/

  public String getFXTransactionCapturePostconditions() {
    return fXTransactionCapturePostconditions;
  }

  public void setFXTransactionCapturePostconditions(String fXTransactionCapturePostconditions) {
    this.fXTransactionCapturePostconditions = fXTransactionCapturePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return fXTransactionCaptureFXTransactionCaptureServiceType
  **/

  public String getFXTransactionCaptureFXTransactionCaptureServiceType() {
    return fXTransactionCaptureFXTransactionCaptureServiceType;
  }

  public void setFXTransactionCaptureFXTransactionCaptureServiceType(String fXTransactionCaptureFXTransactionCaptureServiceType) {
    this.fXTransactionCaptureFXTransactionCaptureServiceType = fXTransactionCaptureFXTransactionCaptureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return fXTransactionCaptureFXTransactionCaptureServiceDescription
  **/

  public String getFXTransactionCaptureFXTransactionCaptureServiceDescription() {
    return fXTransactionCaptureFXTransactionCaptureServiceDescription;
  }

  public void setFXTransactionCaptureFXTransactionCaptureServiceDescription(String fXTransactionCaptureFXTransactionCaptureServiceDescription) {
    this.fXTransactionCaptureFXTransactionCaptureServiceDescription = fXTransactionCaptureFXTransactionCaptureServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return fXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs
  **/

  public String getFXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs() {
    return fXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs;
  }

  public void setFXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs(String fXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs) {
    this.fXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs = fXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return fXTransactionCaptureFXTransactionCaptureServiceWorkProduct
  **/

  public String getFXTransactionCaptureFXTransactionCaptureServiceWorkProduct() {
    return fXTransactionCaptureFXTransactionCaptureServiceWorkProduct;
  }

  public void setFXTransactionCaptureFXTransactionCaptureServiceWorkProduct(String fXTransactionCaptureFXTransactionCaptureServiceWorkProduct) {
    this.fXTransactionCaptureFXTransactionCaptureServiceWorkProduct = fXTransactionCaptureFXTransactionCaptureServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a FXTransaction Capture instance retrieve service call 
   * @return fXTransactionCaptureRetrieveActionTaskReference
  **/

  public String getFXTransactionCaptureRetrieveActionTaskReference() {
    return fXTransactionCaptureRetrieveActionTaskReference;
  }

  public void setFXTransactionCaptureRetrieveActionTaskReference(String fXTransactionCaptureRetrieveActionTaskReference) {
    this.fXTransactionCaptureRetrieveActionTaskReference = fXTransactionCaptureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fXTransactionCaptureRetrieveActionTaskRecord
  **/

  public Object getFXTransactionCaptureRetrieveActionTaskRecord() {
    return fXTransactionCaptureRetrieveActionTaskRecord;
  }

  public void setFXTransactionCaptureRetrieveActionTaskRecord(Object fXTransactionCaptureRetrieveActionTaskRecord) {
    this.fXTransactionCaptureRetrieveActionTaskRecord = fXTransactionCaptureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fXTransactionCaptureRetrieveActionResponse
  **/

  public String getFXTransactionCaptureRetrieveActionResponse() {
    return fXTransactionCaptureRetrieveActionResponse;
  }

  public void setFXTransactionCaptureRetrieveActionResponse(String fXTransactionCaptureRetrieveActionResponse) {
    this.fXTransactionCaptureRetrieveActionResponse = fXTransactionCaptureRetrieveActionResponse;
  }


  /**
   * Get fXTransactionCaptureInstanceReport
   * @return fXTransactionCaptureInstanceReport
  **/

  public BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceReport getFXTransactionCaptureInstanceReport() {
    return fXTransactionCaptureInstanceReport;
  }

  public void setFXTransactionCaptureInstanceReport(BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceReport fXTransactionCaptureInstanceReport) {
    this.fXTransactionCaptureInstanceReport = fXTransactionCaptureInstanceReport;
  }


  /**
   * Get fXTransactionCaptureInstanceAnalysis
   * @return fXTransactionCaptureInstanceAnalysis
  **/

  public BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceAnalysis getFXTransactionCaptureInstanceAnalysis() {
    return fXTransactionCaptureInstanceAnalysis;
  }

  public void setFXTransactionCaptureInstanceAnalysis(BQFXTransactionCaptureRetrieveOutputModelFXTransactionCaptureInstanceAnalysis fXTransactionCaptureInstanceAnalysis) {
    this.fXTransactionCaptureInstanceAnalysis = fXTransactionCaptureInstanceAnalysis;
  }


}

