package com.itq.saleService.business;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.itq.saleService.dto.Ack;
import com.itq.saleService.dto.Sale;

@Component
public class SaleService {

    String msg;
	
	public boolean isValid(Sale sale) {

        // Validar el ID del proveedor
        if (sale.getProviderID().equals("")) {
            msg = "ERROR: El ID del proveedor no puede estar vacío";
            return false;
        }

        // Validar el ID del producto
        if (sale.getProductID().equals("")) {
            msg = "ERROR: El ID del producto no puede estar vacío";
            return false;
        }

        // Validar la cantidad del producto
        if (sale.getProductQuantity() < 0) {
            msg = "ERROR: La cantidad del producto debe ser mayor a 0";
            return false;
        }

        // Validar el precio del producto
        if (sale.getProductPrice().compareTo(BigDecimal.ZERO) < 0) {
            msg = "ERROR: El precio del producto debe ser mayor a 0";
            return false;
        }

        // Validacion del total de la venta
        if (sale.getTotal().compareTo(BigDecimal.ZERO) < 0) {
            msg = "ERROR: El total de la venta debe ser mayor a 0";
            return false;
        }   

        // Validar la fecha
        if (!sale.getSaleDate().matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {
            msg = "ERROR: La fecha no tiene el formato correcto (dd-mm-yyyy)";
            return false;
        }

        // Validar el estado (vendida, libre, en proceso, cancelada)
        if (!sale.getStatus().equals("vendida") && !sale.getStatus().equals("libre") && !sale.getStatus().equals("en_proceso") && !sale.getStatus().equals("cancelada")) {
            msg = "ERROR: El estado no tiene un valor valido (vendida, libre, en_proceso, cancelada)";
            return false;
        }
        
        return true;

    }
	
	public Ack insertSale(Sale sale) {
		Ack ack = new Ack();

		System.out.println("Completing sale...");
	
		if (isValid(sale)) {
			ack.setDescription("Venta realizada ");
			ack.setCode(1);
		} else {
			ack.setDescription(msg);
			ack.setCode(0);
		}
		return ack;
	}

}
