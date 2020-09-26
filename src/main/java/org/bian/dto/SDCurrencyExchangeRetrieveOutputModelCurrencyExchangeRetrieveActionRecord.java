package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangeActivityAnalysis;
import org.bian.dto.SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangePerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecord
 */
public class SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecord   {
  private SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangeActivityAnalysis currencyExchangeActivityAnalysis = null;

  private SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangePerformanceAnalysis currencyExchangePerformanceAnalysis = null;

  private SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get currencyExchangeActivityAnalysis
   * @return currencyExchangeActivityAnalysis
  **/

  public SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangeActivityAnalysis getCurrencyExchangeActivityAnalysis() {
    return currencyExchangeActivityAnalysis;
  }

  public void setCurrencyExchangeActivityAnalysis(SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangeActivityAnalysis currencyExchangeActivityAnalysis) {
    this.currencyExchangeActivityAnalysis = currencyExchangeActivityAnalysis;
  }


  /**
   * Get currencyExchangePerformanceAnalysis
   * @return currencyExchangePerformanceAnalysis
  **/

  public SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangePerformanceAnalysis getCurrencyExchangePerformanceAnalysis() {
    return currencyExchangePerformanceAnalysis;
  }

  public void setCurrencyExchangePerformanceAnalysis(SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangePerformanceAnalysis currencyExchangePerformanceAnalysis) {
    this.currencyExchangePerformanceAnalysis = currencyExchangePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCurrencyExchangeRetrieveOutputModelCurrencyExchangeRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

