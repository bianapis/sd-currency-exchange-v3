package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup;
import org.bian.dto.SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement;
import org.bian.dto.SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecord
 */
public class SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecord   {
  private String currencyExchangeServiceConfigurationSettingReference = null;

  private String currencyExchangeServiceConfigurationSettingDescription = null;

  private SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup currencyExchangeServiceConfigurationSetup = null;

  private SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription currencyExchangeServiceSubscription = null;

  private SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement currencyExchangeServiceAgreement = null;

  private String currencyExchangeServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return currencyExchangeServiceConfigurationSettingReference
  **/

  public String getCurrencyExchangeServiceConfigurationSettingReference() {
    return currencyExchangeServiceConfigurationSettingReference;
  }

  public void setCurrencyExchangeServiceConfigurationSettingReference(String currencyExchangeServiceConfigurationSettingReference) {
    this.currencyExchangeServiceConfigurationSettingReference = currencyExchangeServiceConfigurationSettingReference;
  }


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

  public SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup getCurrencyExchangeServiceConfigurationSetup() {
    return currencyExchangeServiceConfigurationSetup;
  }

  public void setCurrencyExchangeServiceConfigurationSetup(SDCurrencyExchangeActivateInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup currencyExchangeServiceConfigurationSetup) {
    this.currencyExchangeServiceConfigurationSetup = currencyExchangeServiceConfigurationSetup;
  }


  /**
   * Get currencyExchangeServiceSubscription
   * @return currencyExchangeServiceSubscription
  **/

  public SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription getCurrencyExchangeServiceSubscription() {
    return currencyExchangeServiceSubscription;
  }

  public void setCurrencyExchangeServiceSubscription(SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription currencyExchangeServiceSubscription) {
    this.currencyExchangeServiceSubscription = currencyExchangeServiceSubscription;
  }


  /**
   * Get currencyExchangeServiceAgreement
   * @return currencyExchangeServiceAgreement
  **/

  public SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement getCurrencyExchangeServiceAgreement() {
    return currencyExchangeServiceAgreement;
  }

  public void setCurrencyExchangeServiceAgreement(SDCurrencyExchangeActivateOutputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement currencyExchangeServiceAgreement) {
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

