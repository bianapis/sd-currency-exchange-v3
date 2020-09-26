package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceReportRecord
 */
public class CRCurrencyExchangeTransactionRetrieveInputModelCurrencyExchangeTransactionInstanceReportRecord   {
  private String currencyExchangeTransactionInstanceReportReference = null;

  private String currencyExchangeTransactionInstanceReportType = null;

  private String currencyExchangeTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return currencyExchangeTransactionInstanceReportReference
  **/

  public String getCurrencyExchangeTransactionInstanceReportReference() {
    return currencyExchangeTransactionInstanceReportReference;
  }

  public void setCurrencyExchangeTransactionInstanceReportReference(String currencyExchangeTransactionInstanceReportReference) {
    this.currencyExchangeTransactionInstanceReportReference = currencyExchangeTransactionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return currencyExchangeTransactionInstanceReportType
  **/

  public String getCurrencyExchangeTransactionInstanceReportType() {
    return currencyExchangeTransactionInstanceReportType;
  }

  public void setCurrencyExchangeTransactionInstanceReportType(String currencyExchangeTransactionInstanceReportType) {
    this.currencyExchangeTransactionInstanceReportType = currencyExchangeTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return currencyExchangeTransactionInstanceReportParameters
  **/

  public String getCurrencyExchangeTransactionInstanceReportParameters() {
    return currencyExchangeTransactionInstanceReportParameters;
  }

  public void setCurrencyExchangeTransactionInstanceReportParameters(String currencyExchangeTransactionInstanceReportParameters) {
    this.currencyExchangeTransactionInstanceReportParameters = currencyExchangeTransactionInstanceReportParameters;
  }


}

