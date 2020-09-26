package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeActivateInputModel
 */
public class SDCurrencyExchangeActivateInputModel   {
  private Object currencyExchangeActivationActionTaskRecord = null;

  private String currencyExchangeCenterReference = null;

  private String currencyExchangeServiceReference = null;

  private SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecord currencyExchangeServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return currencyExchangeCenterReference
  **/

  public String getCurrencyExchangeCenterReference() {
    return currencyExchangeCenterReference;
  }

  public void setCurrencyExchangeCenterReference(String currencyExchangeCenterReference) {
    this.currencyExchangeCenterReference = currencyExchangeCenterReference;
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

  public SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecord getCurrencyExchangeServiceConfigurationRecord() {
    return currencyExchangeServiceConfigurationRecord;
  }

  public void setCurrencyExchangeServiceConfigurationRecord(SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecord currencyExchangeServiceConfigurationRecord) {
    this.currencyExchangeServiceConfigurationRecord = currencyExchangeServiceConfigurationRecord;
  }


}

