/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * UsuarioNuevo.java
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
 * Clase que registra un nuevo usuario en la base de datos
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class UsuarioNuevo extends Usuario {

	@Override
	public String consultarUsuario() {
		String cadena = "select * from usuarios where(usuario='" + this.getNombre()
				+ "');";
		return cadena;
	}
	
	/**
	 * Comando de MySQL que ingresa un nuevo registro a la base de datos de usuarios
	 * @return cadena
	 */
	@Override
	public String modificarRegistro() {
		String cadena = "insert into usuarios values('"+ this.getNombre() + "','"
				+ this.getPassword() + "','" + this.getTipoUsuario() + "');";
		return cadena;
	}

}