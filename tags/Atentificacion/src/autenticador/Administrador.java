/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Administrador.java
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
 * Clase que representa al administrador de las cuentas de usuario del sistema
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Administrador extends Usuario{

	@Override
	public String consultarUsuario() {
		String cadena = "Select * from usuarios";
		return cadena;
	}

	@Override
	public String modificarRegistro() {
		String cadena = "Delete from usuarios where(usuario='" + this.getNombre() +"');";
		return cadena;
	}
	
}
