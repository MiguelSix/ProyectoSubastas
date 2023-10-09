package com.itq.auctionService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.auctionService.business.AuctionService;
import com.itq.auctionService.dto.Ack;
import com.itq.auctionService.dto.ConsultAuction;
import com.itq.auctionService.dto.CreateAuction;
import com.itq.auctionService.dto.DeleteAuction;
import com.itq.auctionService.dto.UpdateAuction;

@Endpoint
public class AuctionsEndpoint {

		private static final String NAMESPACE_URI = "http://com.auctionSchema";
		@Autowired AuctionService auctionService;

		// Crear subasta
		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createAuction")
		@ResponsePayload
		public Ack createAuction(@RequestPayload CreateAuction request) {
			Ack response = auctionService.insertAuction(request); 
			return response;
		}
	
		// Modificar subasta
		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateAuction")
		@ResponsePayload
		public Ack updateAuction(@RequestPayload UpdateAuction request) {
			Ack response = auctionService.updateAuction(request); 
			return response;
		}
	
		// Borrar subasta
		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteAuction")
		@ResponsePayload
		public Ack deleteAuction(@RequestPayload DeleteAuction request) {
			Ack response = auctionService.deleteAuction(request); 
			return response;
		}
		
		// Buscar subasta
		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "consultAuction")
		@ResponsePayload
		public Ack consultAuction(@RequestPayload ConsultAuction request) {
			Ack response = auctionService.consultAuction(request); 
			return response;
		}
}
