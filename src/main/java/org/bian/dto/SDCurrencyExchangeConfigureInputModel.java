package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeConfigureInputModel
 */
public class SDCurrencyExchangeConfigureInputModel   {
  private Object currencyExchangeConfigurationActionTaskRecord = null;

  private String currencyExchangeServicingSessionReference = null;

  private String currencyExchangeServiceReference = null;

  private SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecord currencyExchangeServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return currencyExchangeServiceReference
  **/

  public String getCurrencyExchangeServiceReference() {
    return currencyExchangeServiceReference;
  }

  public void setCurrencyExchangeServiceReference(String currencyExchangeServiceReference) {
    this.currencyExchangeServiceReference = currencyExchangeServiceReference;
  }


  /**
   * Get currencyExchangeServiceConfigurationRecord
   * @return currencyExchangeServiceConfigurationRecord
  **/

  public SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecord getCurrencyExchangeServiceConfigurationRecord() {
    return currencyExchangeServiceConfigurationRecord;
  }

  public void setCurrencyExchangeServiceConfigurationRecord(SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecord currencyExchangeServiceConfigurationRecord) {
    this.currencyExchangeServiceConfigurationRecord = currencyExchangeServiceConfigurationRecord;
  }


}

