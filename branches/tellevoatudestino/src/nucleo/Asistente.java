/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Asistente.java
 * 
 * Proyecto de primer corte de Programacion Avanzada
 * Presentado por:
 * Juan Pablo Moreno Rico - 20111020059
 * Anderson Orlando Ramirez Lamprea - 20111020072
 * Karen Vanessa Angulo Sogamoso - 20112020055
 * ------------------------------------------
 */
package nucleo;

/**
 * Clase que representa al asistente del conductor del bus
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Asistente extends Persona implements AccesoaDatos{

    /**
     * Crea un nuevo asistente 
     */
    public Asistente () {
    }

	@Override
	public String guardarRegistro() {
		String cadena = "insert into persona values('" + this.getIdentificacion() 
				+ "','" + this.getNombre() + "','" + this.getTelefono() + "','" 
				+ this.getDireccion() + "'," + this.getFechaNacimiento() + ",'2');";
		return cadena;
	}

	@Override
	public String eliminarRegistro() {
		String cadena = "delete from persona where(identificacionPersona='" 
				+ this.getIdentificacion() + "');";
		return cadena;
	}

	@Override
	public String actualizarRegistro() {
		String cadena = "update persona set telefono='" + this.getTelefono() 
				+ "', direccion='" + this.getDireccion() + "' where(identificacionPersona='"
				+ this.getIdentificacion() + "');";
		return cadena;
	}

	@Override
	public String buscarRegistro() {
		String cadena = "select * from persona where(identificacionPersona='"  
				+ this.getIdentificacion() + "');";
		return cadena;
	}

}