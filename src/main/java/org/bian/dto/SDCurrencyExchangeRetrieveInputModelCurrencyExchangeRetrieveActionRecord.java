package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangeActivityAnalysis;
import org.bian.dto.SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangePerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecord
 */
public class SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecord   {
  private SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangeActivityAnalysis currencyExchangeActivityAnalysis = null;

  private SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangePerformanceAnalysis currencyExchangePerformanceAnalysis = null;

  private SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get currencyExchangeActivityAnalysis
   * @return currencyExchangeActivityAnalysis
  **/

  public SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangeActivityAnalysis getCurrencyExchangeActivityAnalysis() {
    return currencyExchangeActivityAnalysis;
  }

  public void setCurrencyExchangeActivityAnalysis(SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangeActivityAnalysis currencyExchangeActivityAnalysis) {
    this.currencyExchangeActivityAnalysis = currencyExchangeActivityAnalysis;
  }


  /**
   * Get currencyExchangePerformanceAnalysis
   * @return currencyExchangePerformanceAnalysis
  **/

  public SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangePerformanceAnalysis getCurrencyExchangePerformanceAnalysis() {
    return currencyExchangePerformanceAnalysis;
  }

  public void setCurrencyExchangePerformanceAnalysis(SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordCurrencyExchangePerformanceAnalysis currencyExchangePerformanceAnalysis) {
    this.currencyExchangePerformanceAnalysis = currencyExchangePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCurrencyExchangeRetrieveInputModelCurrencyExchangeRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

