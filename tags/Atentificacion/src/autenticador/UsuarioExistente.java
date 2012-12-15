/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * UsuarioExistente.java
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
public class UsuarioExistente  extends Usuario{
	
	@Override
	public String consultarUsuario() {
		String cadena = "select * from usuarios where(usuario='" 
				+ this.getNombre() + "' and password='" + this.getPassword() + "');";
		return cadena;
	}

	@Override
	public String modificarRegistro() {
		String cadena = "update usuarios set password='" + this.getPassword() 
				+ "' where(nombre='" + this.getNombre() + "');";
		return cadena;
	}
	
}