package com.itq.auctionService.business;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.itq.auctionService.dto.Ack;
import com.itq.auctionService.dto.Auction;
import com.itq.auctionService.dto.ConsultAuction;
import com.itq.auctionService.dto.CreateAuction;
import com.itq.auctionService.dto.DeleteAuction;
import com.itq.auctionService.dto.UpdateAuction;

@Component
public class AuctionService {

	String msg;

	// Metodo bool para validar que los datos de la subasta sean validos
	public boolean validateAuction(CreateAuction auction) {

		// Validar el ID del proveedor
		if (auction.getProviderID().equals("") || auction.getProviderID().equals("?")) {
			msg = "ERROR: El ID del proveedor no puede estar vacío";
			return false;
		}

		if (!auction.getProviderID().matches("[0-9]+")) {
			msg = "ERROR: El ID del proveedor solo puede contener numeros";
			return false;
		}

		// Validar el precio inicial

		if (auction.getInitialPrice() == null) {
			msg = "ERROR: El precio inicial solo puede contener numeros";
			return false;
		}

		if (auction.getInitialPrice().compareTo(BigDecimal.ZERO) < 0) {
			msg = "ERROR: El precio inicial no puede ser negativo";
			return false;
		}
		
		// Validar el precio final
		
		if (auction.getFinalPrice() == null) {
			msg = "ERROR: El precio inicial solo puede contener numeros";
			return false;
		}

		if (auction.getFinalPrice().compareTo(BigDecimal.ZERO) < 0) {
			msg = "ERROR: El precio final no puede ser negativo";
			return false;
		}

		// Validar el ID del producto
		if (auction.getProductID().equals("") || auction.getProviderID().equals("?")) {
			msg = "ERROR: El ID del producto no puede estar vacío";
			return false;
		}

		if (!auction.getProductID().matches("[0-9]+")) {
			msg = "ERROR: El ID del producto solo puede contener numeros";
			return false;
		}

		// Validar la fecha
		if (!auction.getAuctionDate().matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {
			msg = "ERROR: La fecha no tiene el formato correcto (dd-mm-yyyy)";
			return false;
		}

		// Validar el estado
		
		if (!auction.getStatus().equals("Activa") && !auction.getStatus().equals("Inactiva")) {
			msg = "ERROR: Ingrese un estado valido (Activa/Inactiva)";
			return false;
		}
		

		return true;
	}

	// Metodo para saber si una subasta existe
	public boolean auctionExists(String auctionID) {
		// Aqui va la lógica para saber si una subasta existe
		return true;
	}

	// Metodo para buscar una subasta en la base de datos
	public Auction searchAuction(String auctionID) {
		// Aqui va la lógica para buscar una subasta
		Auction auction = new Auction();

		// Prueba
		auction.setAuctionID(auctionID);
		auction.setAuctionDate("01-01-2019");
		auction.setProductID("1");
		auction.setProviderID("1");
		auction.setStatus("Activa");
		auction.setFinalPrice(BigDecimal.valueOf(1000.1));

		return auction;
	}
	
	// Crear subasta
	public Ack insertAuction(CreateAuction auction) {
		Ack ack = new Ack();

		if (validateAuction(auction)) {
			// Aqui va la logica para agregar la subasta a la BD
			ack.setCode(1);
			ack.setDescription("Subasta creada exitosamente");
			System.out.println("Subasta creada exitosamente...");
		} else {
			ack.setCode(0);
			ack.setDescription(msg);
			System.out.println("Error al crear la subasta");
		}
		return ack;
	}

	// Borrar subasta
	public Ack deleteAuction(DeleteAuction auction) {
		Ack ack = new Ack();

		if (auctionExists(auction.getAuctionID())) {
			// Aqui va la logica para borrar la subasta de la BD
			ack.setCode(1);
			ack.setDescription("Subasta borrada exitosamente");
			System.out.println("Subasta borrada exitosamente...");
		} else {
			ack.setCode(0);
			ack.setDescription("Error al borrar la subasta... (La subasta no existe)");
			System.out.println("Error al borrar la subasta... (La subasta no existe)");
		}
		return ack;
	}

	// Modificar subasta

	public Ack updateAuction(UpdateAuction auction) {
		Ack ack = new Ack();

		if (auctionExists(auction.getAuctionID())) {
			// Aqui va la logica para modificar la subasta en la BD

			// Objeto temporal para simular la actualización
			CreateAuction auction2 = new CreateAuction();
			auction2.setAuctionDate(auction.getNewAuctionDate());
			auction2.setStatus(auction.getNewStatus());
			auction2.setFinalPrice(auction.getNewFinalPrice());
			auction2.setInitialPrice(auction.getNewInitialPrice());

			if (validateAuction(auction2)) {
				ack.setCode(1);
				ack.setDescription("Subasta modificada exitosamente...");
				System.out.println("Subasta modificada exitosamente...");
			} else {
				ack.setCode(0);
				ack.setDescription(msg);
				System.out.println("Error al modificar la subasta...");
			}

		} else {
			ack.setCode(0);
			ack.setDescription("Error al modificar la subasta... (La subasta no existe)");
			System.out.println("Error al modificar la subasta... (La subasta no existe)");
		}
		return ack;
	}

	// Obtener subasta

	public Ack consultAuction(ConsultAuction auction) {
		Ack ack = new Ack();

		if (auctionExists(auction.getAuctionID())) {
			// Aqui va la logica para buscar la subasta en la BD
			Auction auction2 = searchAuction(auction.getAuctionID());
			String auctionData = "ID: " + auction2.getAuctionID() + " , Fecha: " + auction2.getAuctionDate() + " , ID del producto: "
					+ auction2.getProductID() + " , ID del proveedor: " + auction2.getProviderID() + " , Estado: " + auction2.getStatus()
					+ " , Precio final: " + auction2.getFinalPrice();

			ack.setCode(1);
			ack.setDescription("Subasta encontrada exitosamente: " + auctionData);
			System.out.println("Subasta encontrada exitosamente...");
		} else {
			ack.setCode(0);
			ack.setDescription("Error al buscar la subasta... (La subasta no existe)");
			System.out.println("Error al buscar la subasta... (La subasta no existe)");
		}
		return ack;
	}
}
