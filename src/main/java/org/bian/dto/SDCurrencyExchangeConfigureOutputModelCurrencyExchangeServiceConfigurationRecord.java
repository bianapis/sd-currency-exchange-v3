package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement;
import org.bian.dto.SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup;
import org.bian.dto.SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeConfigureOutputModelCurrencyExchangeServiceConfigurationRecord
 */
public class SDCurrencyExchangeConfigureOutputModelCurrencyExchangeServiceConfigurationRecord   {
  private String currencyExchangeServiceConfigurationSettingDescription = null;

  private SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup currencyExchangeServiceConfigurationSetup = null;

  private SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription currencyExchangeServiceSubscription = null;

  private SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement currencyExchangeServiceAgreement = null;

  private String currencyExchangeServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return currencyExchangeServiceConfigurationSettingDescription
  **/

  public String getCurrencyExchangeServiceConfigurationSettingDescription() {
    return currencyExchangeServiceConfigurationSettingDescription;
  }

  public void setCurrencyExchangeServiceConfigurationSettingDescription(String currencyExchangeServiceConfigurationSettingDescription) {
    this.currencyExchangeServiceConfigurationSettingDescription = currencyExchangeServiceConfigurationSettingDescription;
  }


  /**
   * Get currencyExchangeServiceConfigurationSetup
   * @return currencyExchangeServiceConfigurationSetup
  **/

  public SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup getCurrencyExchangeServiceConfigurationSetup() {
    return currencyExchangeServiceConfigurationSetup;
  }

  public void setCurrencyExchangeServiceConfigurationSetup(SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup currencyExchangeServiceConfigurationSetup) {
    this.currencyExchangeServiceConfigurationSetup = currencyExchangeServiceConfigurationSetup;
  }


  /**
   * Get currencyExchangeServiceSubscription
   * @return currencyExchangeServiceSubscription
  **/

  public SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription getCurrencyExchangeServiceSubscription() {
    return currencyExchangeServiceSubscription;
  }

  public void setCurrencyExchangeServiceSubscription(SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription currencyExchangeServiceSubscription) {
    this.currencyExchangeServiceSubscription = currencyExchangeServiceSubscription;
  }


  /**
   * Get currencyExchangeServiceAgreement
   * @return currencyExchangeServiceAgreement
  **/

  public SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement getCurrencyExchangeServiceAgreement() {
    return currencyExchangeServiceAgreement;
  }

  public void setCurrencyExchangeServiceAgreement(SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement currencyExchangeServiceAgreement) {
    this.currencyExchangeServiceAgreement = currencyExchangeServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return currencyExchangeServiceStatus
  **/

  public String getCurrencyExchangeServiceStatus() {
    return currencyExchangeServiceStatus;
  }

  public void setCurrencyExchangeServiceStatus(String currencyExchangeServiceStatus) {
    this.currencyExchangeServiceStatus = currencyExchangeServiceStatus;
  }


}

