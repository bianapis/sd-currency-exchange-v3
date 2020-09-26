package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrencyExchangeTransactionExchangeInputModelCurrencyExchangeTransactionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQFXTransactionCaptureExchangeInputModel
 */
public class BQFXTransactionCaptureExchangeInputModel   {
  private String currencyExchangeTransactionInstanceReference = null;

  private String fXTransactionCaptureInstanceReference = null;

  private String fXTransactionCapturePreconditions = null;

  private String fXTransactionCaptureTaskSchedule = null;

  private String fXTransactionCapture = null;

  private String fXTransactionCapturePostconditions = null;

  private String fXTransactionCaptureFXTransactionCaptureServiceType = null;

  private String fXTransactionCaptureFXTransactionCaptureServiceDescription = null;

  private String fXTransactionCaptureFXTransactionCaptureServiceInputsandOuputs = null;

  private String fXTransactionCaptureFXTransactionCaptureServiceWorkProduct = null;

  private Object fXTransactionCaptureExchangeActionTaskRecord = null;

  private CRCurrencyExchangeTransactionExchangeInputModelCurrencyExchangeTransactionExchangeActionRequest fXTransactionCaptureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Currency Exchange Transaction instance 
   * @return currencyExchangeTransactionInstanceReference
  **/

  public String getCurrencyExchangeTransactionInstanceReference() {
    return currencyExchangeTransactionInstanceReference;
  }

  public void setCurrencyExchangeTransactionInstanceReference(String currencyExchangeTransactionInstanceReference) {
    this.currencyExchangeTransactionInstanceReference = currencyExchangeTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the FXTransaction Capture instance 
   * @return fXTransactionCaptureInstanceReference
  **/

  public String getFXTransactionCaptureInstanceReference() {
    return fXTransactionCaptureInstanceReference;
  }

  public void setFXTransactionCaptureInstanceReference(String fXTransactionCaptureInstanceReference) {
    this.fXTransactionCaptureInstanceReference = fXTransactionCaptureInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return fXTransactionCaptureExchangeActionTaskRecord
  **/

  public Object getFXTransactionCaptureExchangeActionTaskRecord() {
    return fXTransactionCaptureExchangeActionTaskRecord;
  }

  public void setFXTransactionCaptureExchangeActionTaskRecord(Object fXTransactionCaptureExchangeActionTaskRecord) {
    this.fXTransactionCaptureExchangeActionTaskRecord = fXTransactionCaptureExchangeActionTaskRecord;
  }


  /**
   * Get fXTransactionCaptureExchangeActionRequest
   * @return fXTransactionCaptureExchangeActionRequest
  **/

  public CRCurrencyExchangeTransactionExchangeInputModelCurrencyExchangeTransactionExchangeActionRequest getFXTransactionCaptureExchangeActionRequest() {
    return fXTransactionCaptureExchangeActionRequest;
  }

  public void setFXTransactionCaptureExchangeActionRequest(CRCurrencyExchangeTransactionExchangeInputModelCurrencyExchangeTransactionExchangeActionRequest fXTransactionCaptureExchangeActionRequest) {
    this.fXTransactionCaptureExchangeActionRequest = fXTransactionCaptureExchangeActionRequest;
  }


}

