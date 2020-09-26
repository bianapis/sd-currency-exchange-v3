package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeFeedbackInputModelCurrencyExchangeFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeFeedbackInputModel
 */
public class SDCurrencyExchangeFeedbackInputModel   {
  private Object currencyExchangeFeedbackActionTaskRecord = null;

  private SDCurrencyExchangeFeedbackInputModelCurrencyExchangeFeedbackActionRecord currencyExchangeFeedbackActionRecord = null;


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

  public SDCurrencyExchangeFeedbackInputModelCurrencyExchangeFeedbackActionRecord getCurrencyExchangeFeedbackActionRecord() {
    return currencyExchangeFeedbackActionRecord;
  }

  public void setCurrencyExchangeFeedbackActionRecord(SDCurrencyExchangeFeedbackInputModelCurrencyExchangeFeedbackActionRecord currencyExchangeFeedbackActionRecord) {
    this.currencyExchangeFeedbackActionRecord = currencyExchangeFeedbackActionRecord;
  }


}

