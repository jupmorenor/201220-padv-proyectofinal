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
 * Clase que representa a un usuario en general
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public abstract class Usuario {
	
	/**
	 * Nombre ingresado por el usuario
	 */
	protected String nombre;
	
	/**
	 * Contraseña del usuario
	 */
	protected String password;
	
	/**
	 * Indica el tipo de usuario
	 */
	protected String tipoUsuario;
	
	/**
	 * Devuelve el nombre del usuario
	 * @return nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del usuario
	 * @param usuario nombre del usuario
	 */
	public void setNombre(String usuario) {
		this.nombre = usuario;
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
	
	/**
	 * Devuelve el tipo de usuario
	 * @return tipo de usuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * Establece el tipo de usuario
	 * @param tipoUsuario tipo de usuario
	 */
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * Comando de MySQL que verifica que el usuario se encuentre registrado en la BD
	 * @return cadena de texto
	 */
	public abstract String consultarUsuario();
	
	/**
	 * Comando de MySQL que modifica un registro en la base de datos
	 * @return cadena de texto
	 */
	public abstract String modificarRegistro();
	
}
