/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Transact;

@BianRestController
public class CurrencyExchangeApiController {

	@Autowired
	CurrencyExchangeApiService service;
	
	@Transact.Activate
	public BianResponse<SDCurrencyExchangeActivateOutputModel> activate(@RequestBody BianRequest<SDCurrencyExchangeActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Transact.Configure
	public BianResponse<SDCurrencyExchangeConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCurrencyExchangeConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Control
	public BianResponse<CRCurrencyExchangeTransactionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCurrencyExchangeTransactionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fxtransactioncapture")
	@Transact.Exchange
	public BianResponse<BQFXTransactionCaptureExchangeOutputModel> exchangeFxtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFXTransactionCaptureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFxtransactioncapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Exchange
	public BianResponse<CRCurrencyExchangeTransactionExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCurrencyExchangeTransactionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("documenthandling")
	@Transact.Execute
	public BianResponse<BQDocumentHandlingExecuteOutputModel> executeDocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDocumentHandlingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeDocumenthandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Execute
	public BianResponse<CRCurrencyExchangeTransactionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCurrencyExchangeTransactionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Feedback
	public BianResponse<SDCurrencyExchangeFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCurrencyExchangeFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Initiate
	public BianResponse<CRCurrencyExchangeTransactionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCurrencyExchangeTransactionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("documenthandling")
	@Transact.Initiate
	public BianResponse<BQDocumentHandlingInitiateOutputModel> initiateDocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDocumentHandlingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDocumenthandling(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fxtransactioncapture")
	@Transact.Initiate
	public BianResponse<BQFXTransactionCaptureInitiateOutputModel> initiateFxtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFXTransactionCaptureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFxtransactioncapture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fxtransactionpricing")
	@Transact.Initiate
	public BianResponse<BQFXTransactionPricingInitiateOutputModel> initiateFxtransactionpricing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFXTransactionPricingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFxtransactionpricing(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Request
	public BianResponse<CRCurrencyExchangeTransactionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCurrencyExchangeTransactionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Retrieve
	public BianResponse<CRCurrencyExchangeTransactionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Transact.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Transact.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Transact.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("documenthandling")
	@Transact.Retrieve
	public BianResponse<BQDocumentHandlingRetrieveOutputModel> retrieveDocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDocumenthandling(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fxtransactioncapture")
	@Transact.Retrieve
	public BianResponse<BQFXTransactionCaptureRetrieveOutputModel> retrieveFxtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFxtransactioncapture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fxtransactionpricing")
	@Transact.Retrieve
	public BianResponse<BQFXTransactionPricingRetrieveOutputModel> retrieveFxtransactionpricing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFxtransactionpricing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Transact.RetrieveSD
	public BianResponse<SDCurrencyExchangeRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Transact.Update
	public BianResponse<CRCurrencyExchangeTransactionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCurrencyExchangeTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("documenthandling")
	@Transact.Update
	public BianResponse<BQDocumentHandlingUpdateOutputModel> updateDocumenthandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDocumentHandlingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDocumenthandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fxtransactioncapture")
	@Transact.Update
	public BianResponse<BQFXTransactionCaptureUpdateOutputModel> updateFxtransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFXTransactionCaptureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFxtransactioncapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fxtransactionpricing")
	@Transact.Update
	public BianResponse<BQFXTransactionPricingUpdateOutputModel> updateFxtransactionpricing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFXTransactionPricingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFxtransactionpricing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
