package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceReport
 */
public class BQFXTransactionPricingRetrieveOutputModelFXTransactionPricingInstanceReport   {
  private Object fXTransactionPricingInstanceReportRecord = null;

  private String fXTransactionPricingInstanceReportType = null;

  private String fXTransactionPricingInstanceReportParameters = null;

  private Object fXTransactionPricingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fXTransactionPricingInstanceReportRecord
  **/

  public Object getFXTransactionPricingInstanceReportRecord() {
    return fXTransactionPricingInstanceReportRecord;
  }

  public void setFXTransactionPricingInstanceReportRecord(Object fXTransactionPricingInstanceReportRecord) {
    this.fXTransactionPricingInstanceReportRecord = fXTransactionPricingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fXTransactionPricingInstanceReportType
  **/

  public String getFXTransactionPricingInstanceReportType() {
    return fXTransactionPricingInstanceReportType;
  }

  public void setFXTransactionPricingInstanceReportType(String fXTransactionPricingInstanceReportType) {
    this.fXTransactionPricingInstanceReportType = fXTransactionPricingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fXTransactionPricingInstanceReportParameters
  **/

  public String getFXTransactionPricingInstanceReportParameters() {
    return fXTransactionPricingInstanceReportParameters;
  }

  public void setFXTransactionPricingInstanceReportParameters(String fXTransactionPricingInstanceReportParameters) {
    this.fXTransactionPricingInstanceReportParameters = fXTransactionPricingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fXTransactionPricingInstanceReport
  **/

  public Object getFXTransactionPricingInstanceReport() {
    return fXTransactionPricingInstanceReport;
  }

  public void setFXTransactionPricingInstanceReport(Object fXTransactionPricingInstanceReport) {
    this.fXTransactionPricingInstanceReport = fXTransactionPricingInstanceReport;
  }


}

