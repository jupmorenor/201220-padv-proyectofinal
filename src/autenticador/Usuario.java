/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Usuario.java
 * 
 * Proyecto de primer corte de Programacion Avanzada
 * Presentado por:
 * Juan Pablo Moreno Rico - 20111020059
 * Anderson Orlando Ramirez Lamprea - 20111020072
 * Karen Vanessa Angulo Sogamoso - 20112020055
 * ------------------------------------------
 */
package autenticador;

/**
 * Clase que representa a un usuario que ingresa al sistema
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Usuario {
	
	/**
	 * Nombre ingresado por el usuario
	 */
	private String usuario;
	
	/**
	 * Contraseña del usuario
	 */
	private String password;
	
	/**
	 * Comando de MySQL que verifica que el usuario se encuentre registrado en la BD
	 * @return cadena de texto
	 */
	public String verificarUsuario() {
		String cadena = "select * from usuarios where(usuario='" 
				+ this.getUsuario() + "' and password='" + this.getPassword() + "');";
		return cadena;
	}

	/**
	 * Devuelve el nombre del usuario
	 * @return nombre del usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Establece el nombre del usuario
	 * @param usuario nombre del usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Devuelve la contraseña del usuario
	 * @return contraseña del usuario
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Establece la contraseña del usuario
	 * @param password contraseña del usuario
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}