/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CurrencyExchangeApiService {

	SDCurrencyExchangeActivateOutputModel activate(SDCurrencyExchangeActivateInputModel request);
	
	SDCurrencyExchangeConfigureOutputModel configure(String sdReferenceId, SDCurrencyExchangeConfigureInputModel request);
	
	CRCurrencyExchangeTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionControlInputModel request);
	
	BQFXTransactionCaptureExchangeOutputModel exchangeFxtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFXTransactionCaptureExchangeInputModel request);
	
	CRCurrencyExchangeTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionExchangeInputModel request);
	
	BQDocumentHandlingExecuteOutputModel executeDocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentHandlingExecuteInputModel request);
	
	CRCurrencyExchangeTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionExecuteInputModel request);
	
	SDCurrencyExchangeFeedbackOutputModel feedback(String sdReferenceId, SDCurrencyExchangeFeedbackInputModel request);
	
	CRCurrencyExchangeTransactionInitiateOutputModel initiate(String sdReferenceId, CRCurrencyExchangeTransactionInitiateInputModel request);
	
	BQDocumentHandlingInitiateOutputModel initiateDocumenthandling(String sdReferenceId, String crReferenceId, BQDocumentHandlingInitiateInputModel request);
	
	BQFXTransactionCaptureInitiateOutputModel initiateFxtransactioncapture(String sdReferenceId, String crReferenceId, BQFXTransactionCaptureInitiateInputModel request);
	
	BQFXTransactionPricingInitiateOutputModel initiateFxtransactionpricing(String sdReferenceId, String crReferenceId, BQFXTransactionPricingInitiateInputModel request);
	
	CRCurrencyExchangeTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionRequestInputModel request);
	
	CRCurrencyExchangeTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQDocumentHandlingRetrieveOutputModel retrieveDocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFXTransactionCaptureRetrieveOutputModel retrieveFxtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFXTransactionPricingRetrieveOutputModel retrieveFxtransactionpricing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCurrencyExchangeRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCurrencyExchangeTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionUpdateInputModel request);
	
	BQDocumentHandlingUpdateOutputModel updateDocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentHandlingUpdateInputModel request);
	
	BQFXTransactionCaptureUpdateOutputModel updateFxtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFXTransactionCaptureUpdateInputModel request);
	
	BQFXTransactionPricingUpdateOutputModel updateFxtransactionpricing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFXTransactionPricingUpdateInputModel request);
	
}
