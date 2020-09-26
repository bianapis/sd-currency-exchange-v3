/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CurrencyExchangeApiServiceImpl implements CurrencyExchangeApiService {

	public SDCurrencyExchangeActivateOutputModel activate(SDCurrencyExchangeActivateInputModel request){
		return JsonReader.read("activate-SDCurrencyExchangeActivateOutputModel.json",new TypeReference<SDCurrencyExchangeActivateOutputModel>(){});
	}
	
	public SDCurrencyExchangeConfigureOutputModel configure(String sdReferenceId, SDCurrencyExchangeConfigureInputModel request){
		return JsonReader.read("configure-SDCurrencyExchangeConfigureOutputModel.json",new TypeReference<SDCurrencyExchangeConfigureOutputModel>(){});
	}
	
	public CRCurrencyExchangeTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionControlInputModel request){
		return JsonReader.read("control-CRCurrencyExchangeTransactionControlOutputModel.json",new TypeReference<CRCurrencyExchangeTransactionControlOutputModel>(){});
	}
	
	public BQFXTransactionCaptureExchangeOutputModel exchangeFxtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFXTransactionCaptureExchangeInputModel request){
		return JsonReader.read("exchange-BQFXTransactionCaptureExchangeOutputModel.json",new TypeReference<BQFXTransactionCaptureExchangeOutputModel>(){});
	}
	
	public CRCurrencyExchangeTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionExchangeInputModel request){
		return JsonReader.read("exchange-CRCurrencyExchangeTransactionExchangeOutputModel.json",new TypeReference<CRCurrencyExchangeTransactionExchangeOutputModel>(){});
	}
	
	public BQDocumentHandlingExecuteOutputModel executeDocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentHandlingExecuteInputModel request){
		return JsonReader.read("execute-BQDocumentHandlingExecuteOutputModel.json",new TypeReference<BQDocumentHandlingExecuteOutputModel>(){});
	}
	
	public CRCurrencyExchangeTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionExecuteInputModel request){
		return JsonReader.read("execute-CRCurrencyExchangeTransactionExecuteOutputModel.json",new TypeReference<CRCurrencyExchangeTransactionExecuteOutputModel>(){});
	}
	
	public SDCurrencyExchangeFeedbackOutputModel feedback(String sdReferenceId, SDCurrencyExchangeFeedbackInputModel request){
		return JsonReader.read("feedback-SDCurrencyExchangeFeedbackOutputModel.json",new TypeReference<SDCurrencyExchangeFeedbackOutputModel>(){});
	}
	
	public CRCurrencyExchangeTransactionInitiateOutputModel initiate(String sdReferenceId, CRCurrencyExchangeTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRCurrencyExchangeTransactionInitiateOutputModel.json",new TypeReference<CRCurrencyExchangeTransactionInitiateOutputModel>(){});
	}
	
	public BQDocumentHandlingInitiateOutputModel initiateDocumenthandling(String sdReferenceId, String crReferenceId, BQDocumentHandlingInitiateInputModel request){
		return JsonReader.read("initiate-BQDocumentHandlingInitiateOutputModel.json",new TypeReference<BQDocumentHandlingInitiateOutputModel>(){});
	}
	
	public BQFXTransactionCaptureInitiateOutputModel initiateFxtransactioncapture(String sdReferenceId, String crReferenceId, BQFXTransactionCaptureInitiateInputModel request){
		return JsonReader.read("initiate-BQFXTransactionCaptureInitiateOutputModel.json",new TypeReference<BQFXTransactionCaptureInitiateOutputModel>(){});
	}
	
	public BQFXTransactionPricingInitiateOutputModel initiateFxtransactionpricing(String sdReferenceId, String crReferenceId, BQFXTransactionPricingInitiateInputModel request){
		return JsonReader.read("initiate-BQFXTransactionPricingInitiateOutputModel.json",new TypeReference<BQFXTransactionPricingInitiateOutputModel>(){});
	}
	
	public CRCurrencyExchangeTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionRequestInputModel request){
		return JsonReader.read("request-CRCurrencyExchangeTransactionRequestOutputModel.json",new TypeReference<CRCurrencyExchangeTransactionRequestOutputModel>(){});
	}
	
	public CRCurrencyExchangeTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCurrencyExchangeTransactionRetrieveOutputModel.json",new TypeReference<CRCurrencyExchangeTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQDocumentHandlingRetrieveOutputModel retrieveDocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDocumentHandlingRetrieveOutputModel.json",new TypeReference<BQDocumentHandlingRetrieveOutputModel>(){});
	}
	
	public BQFXTransactionCaptureRetrieveOutputModel retrieveFxtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFXTransactionCaptureRetrieveOutputModel.json",new TypeReference<BQFXTransactionCaptureRetrieveOutputModel>(){});
	}
	
	public BQFXTransactionPricingRetrieveOutputModel retrieveFxtransactionpricing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFXTransactionPricingRetrieveOutputModel.json",new TypeReference<BQFXTransactionPricingRetrieveOutputModel>(){});
	}
	
	public SDCurrencyExchangeRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCurrencyExchangeRetrieveOutputModel.json",new TypeReference<SDCurrencyExchangeRetrieveOutputModel>(){});
	}
	
	public CRCurrencyExchangeTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCurrencyExchangeTransactionUpdateInputModel request){
		return JsonReader.read("update-CRCurrencyExchangeTransactionUpdateOutputModel.json",new TypeReference<CRCurrencyExchangeTransactionUpdateOutputModel>(){});
	}
	
	public BQDocumentHandlingUpdateOutputModel updateDocumenthandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDocumentHandlingUpdateInputModel request){
		return JsonReader.read("update-BQDocumentHandlingUpdateOutputModel.json",new TypeReference<BQDocumentHandlingUpdateOutputModel>(){});
	}
	
	public BQFXTransactionCaptureUpdateOutputModel updateFxtransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFXTransactionCaptureUpdateInputModel request){
		return JsonReader.read("update-BQFXTransactionCaptureUpdateOutputModel.json",new TypeReference<BQFXTransactionCaptureUpdateOutputModel>(){});
	}
	
	public BQFXTransactionPricingUpdateOutputModel updateFxtransactionpricing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFXTransactionPricingUpdateInputModel request){
		return JsonReader.read("update-BQFXTransactionPricingUpdateOutputModel.json",new TypeReference<BQFXTransactionPricingUpdateOutputModel>(){});
	}
	
}
