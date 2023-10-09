package com.itq.saleService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.saleService.business.SaleService;
import com.itq.saleService.dto.Ack;
import com.itq.saleService.dto.Sale;

@Endpoint
public class SalesEndpoint {
	
	private static final String NAMESPACE_URI = "http://com.salesSchema";
	@Autowired SaleService saleService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "sale")
	@ResponsePayload
	
	public Ack SaleRegistration(@RequestPayload Sale request) {
		
		Ack response = saleService.insertSale(request); 
		return response;
		
	}

}
