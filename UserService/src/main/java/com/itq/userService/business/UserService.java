package com.itq.userService.business;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

import com.itq.userService.dto.Ack;
import com.itq.userService.dto.ConsultUser;
import com.itq.userService.dto.CreateUser;
import com.itq.userService.dto.DeleteUser;
import com.itq.userService.dto.UpdateUser;
import com.itq.userService.dto.User;

@Component
public class UserService {

	String msg;
	// Metodo bool para validar que los datos del usuario sean validos
	public boolean isUserValid(CreateUser user) {

		// Restricciones para el campo del nombre y apellido del usuario basadas en el xsd
		if (user.getName().matches(".*\\d.*") || user.getLastname().matches(".*\\d.*")) {
			msg = "ERROR: El nombre y apellido no pueden contener numeros";
			return false;
		}

		if (user.getName().matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*") || user.getLastname().matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*")) {
			msg = "ERROR: El nombre y apellido no pueden contener caracteres especiales";
			return false;
		}

		if (user.getName().equals("") || user.getLastname().equals("")) {
			msg = "ERROR: El nombre y apellido no puede estar vacio";
			return false;
		}

		// Restricciones para el campo de la direccion del usuario basadas en el xsd

		if (user.getAddress().equals("")) {
			msg = "ERROR: La direccion no puede estar vacia";
			return false;
		}

		// Restricciones para el campo del telefono del usuario basadas en el xsd

		if (user.getPhone().toString().length() > 10) {
			msg = "ERROR: El telefono no puede tener mas de 10 caracteres";
			return false;
		}

		if (user.getPhone().toString().matches(".*[a-zA-Z].*")) {
			msg = "ERROR: El telefono no puede contener letras";
			return false;
		}

		if (user.getPhone().toString().equals("")) {
			msg = "ERROR: El telefono no puede estar vacio";
			return false;
		}

		// Restricciones para el campo del email del usuario basadas en el xsd

		if (!user.getMail().matches("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$")) {
			msg = "ERROR: El email no es valido";
			return false;
		}

		if (user.getMail().equals("")) {
			msg = "ERROR: El email no puede estar vacio";
			return false;
		}

		// Restricciones para el campo del rfc del usuario basadas en el xsd

		if (!user.getRfc().matches("^([A-Z,Ñ,&amp;]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[A-Z|\\d]{3})$")) {
			msg = "ERROR: El RFC no es valido";
			return false;
		}

		// Restricciones para el campo de la contraseña del usuario basadas en el xsd

		if (!user.getPassword().matches("^.{8,15}$")) {
			msg = "ERROR: La contraseña no es valida";
			return false;
		}

		if (user.getPassword().equals("")) {
			msg = "ERROR: La contraseña no puede estar vacia";
			return false;
		}

		// Restricciones para el campo del tipo de usuario basadas en el xsd

		if (!user.getType().equals("cliente") && !user.getType().equals("proveedor")) {
			msg = "ERROR: El tipo de usuario no es valido";
			return false;
		}

		return true;
	}

	// Metodo para saber si un usuario existe
	public boolean userExists(String userID) {
		// Aqui se realiza la busqueda del usuario en la base de datos
		return true;
	}

	// Metodo para buscar un usuario en la base de datos
	public User searchUser(String userID) {
		// Aqui se realiza la busqueda del usuario en la base de datos
		User user = new User();

		// Prueba
		user.setUserID(userID);
		user.setName("Juan");
		user.setLastname("Perez");
		user.setAddress("Calle 1");
		user.setPhone(BigInteger.valueOf(1234567890));
		user.setMail("wachi@gmail.com");
		user.setRfc("WACH123456789");

		return user;
	}

	// Crear usuario
	public Ack createUser(CreateUser user) {
		Ack ack = new Ack();
	
		if (isUserValid(user)) {
			// Aqui va la logica para agregar el usuario a la BD
			ack.setDescription("Usuario creado correctamente");
			ack.setCode(1);
			System.out.println("Usuario creado correctamente...");
		} else {
			ack.setDescription(msg);
			ack.setCode(0);
			System.out.println("Error al crear usuario...");
		}
		return ack;
	}

	// Borrar usuario
	public Ack deleteUser(DeleteUser user) {
		Ack ack = new Ack();
	
		if (userExists(user.getUserID())) {
			// Aqui va la logica para borrar el usuario de la BD
			ack.setDescription("Usuario borrado correctamente");
			ack.setCode(1);
			System.out.println("Usuario borrado correctamente...");
		} else {
			ack.setDescription("Error al borrar usuario... (El usuario no existe))");
			ack.setCode(0);
			System.out.println("Error al borrar usuario... (El usuario no existe))");
		}
		return ack;
	}

	// Modificar usuario

	public Ack updateUser(UpdateUser user) {
		Ack ack = new Ack();
	
		if (userExists(user.getUserID())) {

			// Objeto temporal para simular la validacion
			CreateUser user2 = new CreateUser();
			user2.setName(user.getName());
			user2.setLastname(user.getLastname());
			user2.setAddress(user.getAddress());
			user2.setPhone(user.getPhone());
			user2.setMail(user.getMail());
			user2.setRfc(user.getRfc());
			user2.setPassword(user.getPassword());
			user2.setType("cliente");

			if (isUserValid(user2)) {
				ack.setDescription("Usuario modificado correctamente");
				ack.setCode(1);
				System.out.println("Usuario modificado correctamente...");
			} else {
				ack.setDescription(msg);
				ack.setCode(0);
				System.out.println("Error al modificar usuario...");
			}
		} else {
			ack.setDescription("Error al modificar usuario... (El usuario no existe))");
			ack.setCode(0);
			System.out.println("Error al modificar usuario... (El usuario no existe))");
		}
		return ack;
	}

	// Obtener usuario

	public Ack consultUser(ConsultUser user) {
		Ack ack = new Ack();
	
		if (userExists(user.getUserID())) {
			// Obtener usuario
			User user2 = searchUser(user.getUserID());
			String userData = "ID: " + user2.getUserID() + " , Nombre: " + user2.getName() + " " + user2.getLastname() + " , Direccion: "
					+ user2.getAddress() + " , Telefono: " + user2.getPhone() + " , Correo: " + user2.getMail() + " , RFC: " + user2.getRfc()
					+ " , Tipo de usuario: " + user2.getType();
			ack.setDescription("Usuario consultado correctamente: " + userData);
			ack.setCode(1);
			System.out.println("Usuario consultado correctamente...");

		} else {
			ack.setDescription("Error al consultar usuario... (El usuario no existe))");
			ack.setCode(0);
			System.out.println("Error al consultar usuario... (El usuario no existe))");
		}
		return ack;
	}
}
