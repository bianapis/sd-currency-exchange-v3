package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeConfigureOutputModelCurrencyExchangeServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeConfigureOutputModel
 */
public class SDCurrencyExchangeConfigureOutputModel   {
  private String currencyExchangeConfigurationActionTaskReference = null;

  private Object currencyExchangeConfigurationActionTaskRecord = null;

  private SDCurrencyExchangeConfigureOutputModelCurrencyExchangeServiceConfigurationRecord currencyExchangeServiceConfigurationRecord = null;

  private String currencyExchangeServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return currencyExchangeConfigurationActionTaskReference
  **/

  public String getCurrencyExchangeConfigurationActionTaskReference() {
    return currencyExchangeConfigurationActionTaskReference;
  }

  public void setCurrencyExchangeConfigurationActionTaskReference(String currencyExchangeConfigurationActionTaskReference) {
    this.currencyExchangeConfigurationActionTaskReference = currencyExchangeConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return currencyExchangeConfigurationActionTaskRecord
  **/

  public Object getCurrencyExchangeConfigurationActionTaskRecord() {
    return currencyExchangeConfigurationActionTaskRecord;
  }

  public void setCurrencyExchangeConfigurationActionTaskRecord(Object currencyExchangeConfigurationActionTaskRecord) {
    this.currencyExchangeConfigurationActionTaskRecord = currencyExchangeConfigurationActionTaskRecord;
  }


  /**
   * Get currencyExchangeServiceConfigurationRecord
   * @return currencyExchangeServiceConfigurationRecord
  **/

  public SDCurrencyExchangeConfigureOutputModelCurrencyExchangeServiceConfigurationRecord getCurrencyExchangeServiceConfigurationRecord() {
    return currencyExchangeServiceConfigurationRecord;
  }

  public void setCurrencyExchangeServiceConfigurationRecord(SDCurrencyExchangeConfigureOutputModelCurrencyExchangeServiceConfigurationRecord currencyExchangeServiceConfigurationRecord) {
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

