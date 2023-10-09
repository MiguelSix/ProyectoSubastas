package com.itq.userService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.userService.business.UserService;
import com.itq.userService.dto.Ack;
import com.itq.userService.dto.ConsultUser;
import com.itq.userService.dto.CreateUser;
import com.itq.userService.dto.DeleteUser;
import com.itq.userService.dto.UpdateUser;

@Endpoint
public class UsersEndpoint {
	
	private static final String NAMESPACE_URI = "http://com.userSchema";
	@Autowired UserService userService;

	// Crear usuario
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUser")
	@ResponsePayload
	public Ack createUser(@RequestPayload CreateUser request) {
		Ack response = userService.createUser(request); 
		return response;
	}
	
	// Modificar usuario
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateUser")
	@ResponsePayload
	public Ack updateUser(@RequestPayload UpdateUser request) {
		Ack response = userService.updateUser(request); 
		return response;
	}
	
	// Borrar usuario
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteUser")
	@ResponsePayload
	public Ack deleteUser(@RequestPayload DeleteUser request) {
		Ack response = userService.deleteUser(request); 
		return response;
	}
	
	// Buscar usuario
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "consultUser")
	@ResponsePayload
	public Ack consultUser(@RequestPayload ConsultUser request) {
		Ack response = userService.consultUser(request); 
		return response;
	}

}
