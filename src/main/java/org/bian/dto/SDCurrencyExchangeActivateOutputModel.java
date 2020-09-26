package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeActivateOutputModel
 */
public class SDCurrencyExchangeActivateOutputModel   {
  private String currencyExchangeActivationActionTaskReference = null;

  private Object currencyExchangeActivationActionTaskRecord = null;

  private String currencyExchangeServicingSessionReference = null;

  private Object currencyExchangeServicingSessionRecord = null;

  private SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecord currencyExchangeServiceConfigurationRecord = null;

  private String currencyExchangeServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return currencyExchangeActivationActionTaskReference
  **/

  public String getCurrencyExchangeActivationActionTaskReference() {
    return currencyExchangeActivationActionTaskReference;
  }

  public void setCurrencyExchangeActivationActionTaskReference(String currencyExchangeActivationActionTaskReference) {
    this.currencyExchangeActivationActionTaskReference = currencyExchangeActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return currencyExchangeActivationActionTaskRecord
  **/

  public Object getCurrencyExchangeActivationActionTaskRecord() {
    return currencyExchangeActivationActionTaskRecord;
  }

  public void setCurrencyExchangeActivationActionTaskRecord(Object currencyExchangeActivationActionTaskRecord) {
    this.currencyExchangeActivationActionTaskRecord = currencyExchangeActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return currencyExchangeServicingSessionReference
  **/

  public String getCurrencyExchangeServicingSessionReference() {
    return currencyExchangeServicingSessionReference;
  }

  public void setCurrencyExchangeServicingSessionReference(String currencyExchangeServicingSessionReference) {
    this.currencyExchangeServicingSessionReference = currencyExchangeServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return currencyExchangeServicingSessionRecord
  **/

  public Object getCurrencyExchangeServicingSessionRecord() {
    return currencyExchangeServicingSessionRecord;
  }

  public void setCurrencyExchangeServicingSessionRecord(Object currencyExchangeServicingSessionRecord) {
    this.currencyExchangeServicingSessionRecord = currencyExchangeServicingSessionRecord;
  }


  /**
   * Get currencyExchangeServiceConfigurationRecord
   * @return currencyExchangeServiceConfigurationRecord
  **/

  public SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecord getCurrencyExchangeServiceConfigurationRecord() {
    return currencyExchangeServiceConfigurationRecord;
  }

  public void setCurrencyExchangeServiceConfigurationRecord(SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecord currencyExchangeServiceConfigurationRecord) {
    this.currencyExchangeServiceConfigurationRecord = currencyExchangeServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return currencyExchangeServicingSessionStatus
  **/

  public String getCurrencyExchangeServicingSessionStatus() {
    return currencyExchangeServicingSessionStatus;
  }

  public void setCurrencyExchangeServicingSessionStatus(String currencyExchangeServicingSessionStatus) {
    this.currencyExchangeServicingSessionStatus = currencyExchangeServicingSessionStatus;
  }


}

