package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceReportRecord
 */
public class CRCurrencyExchangeTransactionRetrieveOutputModelCurrencyExchangeTransactionInstanceReportRecord   {
  private String currencyExchangeTransactionInstanceReportData = null;

  private String currencyExchangeTransactionInstanceReportType = null;

  private Object currencyExchangeTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return currencyExchangeTransactionInstanceReportData
  **/

  public String getCurrencyExchangeTransactionInstanceReportData() {
    return currencyExchangeTransactionInstanceReportData;
  }

  public void setCurrencyExchangeTransactionInstanceReportData(String currencyExchangeTransactionInstanceReportData) {
    this.currencyExchangeTransactionInstanceReportData = currencyExchangeTransactionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return currencyExchangeTransactionInstanceReport
  **/

  public Object getCurrencyExchangeTransactionInstanceReport() {
    return currencyExchangeTransactionInstanceReport;
  }

  public void setCurrencyExchangeTransactionInstanceReport(Object currencyExchangeTransactionInstanceReport) {
    this.currencyExchangeTransactionInstanceReport = currencyExchangeTransactionInstanceReport;
  }


}

