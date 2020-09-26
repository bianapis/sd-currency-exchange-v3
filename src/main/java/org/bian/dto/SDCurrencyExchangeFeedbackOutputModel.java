package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeFeedbackOutputModelCurrencyExchangeFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeFeedbackOutputModel
 */
public class SDCurrencyExchangeFeedbackOutputModel   {
  private String currencyExchangeFeedbackActionTaskReference = null;

  private Object currencyExchangeFeedbackActionTaskRecord = null;

  private SDCurrencyExchangeFeedbackOutputModelCurrencyExchangeFeedbackActionRecord currencyExchangeFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return currencyExchangeFeedbackActionTaskReference
  **/

  public String getCurrencyExchangeFeedbackActionTaskReference() {
    return currencyExchangeFeedbackActionTaskReference;
  }

  public void setCurrencyExchangeFeedbackActionTaskReference(String currencyExchangeFeedbackActionTaskReference) {
    this.currencyExchangeFeedbackActionTaskReference = currencyExchangeFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return currencyExchangeFeedbackActionTaskRecord
  **/

  public Object getCurrencyExchangeFeedbackActionTaskRecord() {
    return currencyExchangeFeedbackActionTaskRecord;
  }

  public void setCurrencyExchangeFeedbackActionTaskRecord(Object currencyExchangeFeedbackActionTaskRecord) {
    this.currencyExchangeFeedbackActionTaskRecord = currencyExchangeFeedbackActionTaskRecord;
  }


  /**
   * Get currencyExchangeFeedbackActionRecord
   * @return currencyExchangeFeedbackActionRecord
  **/

  public SDCurrencyExchangeFeedbackOutputModelCurrencyExchangeFeedbackActionRecord getCurrencyExchangeFeedbackActionRecord() {
    return currencyExchangeFeedbackActionRecord;
  }

  public void setCurrencyExchangeFeedbackActionRecord(SDCurrencyExchangeFeedbackOutputModelCurrencyExchangeFeedbackActionRecord currencyExchangeFeedbackActionRecord) {
    this.currencyExchangeFeedbackActionRecord = currencyExchangeFeedbackActionRecord;
  }


}

