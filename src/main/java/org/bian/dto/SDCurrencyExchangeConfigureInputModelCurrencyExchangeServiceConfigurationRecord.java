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
 * SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecord
 */
public class SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecord   {
  private String currencyExchangeServiceConfigurationSettingReference = null;

  private String currencyExchangeServiceConfigurationSettingType = null;

  private SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceConfigurationSetup currencyExchangeServiceConfigurationSetup = null;

  private SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceSubscription currencyExchangeServiceSubscription = null;

  private SDCurrencyExchangeConfigureInputModelCurrencyExchangeServiceConfigurationRecordCurrencyExchangeServiceAgreement currencyExchangeServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return currencyExchangeServiceConfigurationSettingType
  **/

  public String getCurrencyExchangeServiceConfigurationSettingType() {
    return currencyExchangeServiceConfigurationSettingType;
  }

  public void setCurrencyExchangeServiceConfigurationSettingType(String currencyExchangeServiceConfigurationSettingType) {
    this.currencyExchangeServiceConfigurationSettingType = currencyExchangeServiceConfigurationSettingType;
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


}

