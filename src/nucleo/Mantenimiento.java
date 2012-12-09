/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Mantenimiento.java
 * 
 * Proyecto de primer corte de Programacion Avanzada
 * Presentado por:
 * Juan Pablo Moreno Rico - 20111020059
 * Anderson Orlando Ramirez Lamprea - 20111020072
 * Karen Vanessa Angulo Sogamoso - 20112020055
 * ------------------------------------------
 */
package nucleo;

import java.util.Date;

/**
 * Clase que representa el estado del mantenimiento de un vehiculo de transporte
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Mantenimiento implements AccesoaDatos{

	/**
	 * Identificador del estado de mantenimiento
	 */
	private String idMantenimiento;
	
	/**
	 * Fecha de vencimiento de la revision tecnicomecanica
	 */
	private Date revision;
	
	/**
	 * Fecha de vencimiento del seguro obligatorio
	 */
	private Date seguro;
	
	/**
	 * Codigo interno del vehiculo de transporte al que corresponde el estado de mantenimiento
	 */
	private int idTransporte;

	/**
	 * Crea un nuevo estado de mantenimiento
	 */
	public Mantenimiento () {
	}

	/**
	 * Devuelve el identificador del estado de mantenimiento
	 * @return estado de mantenimiento
	 */
	public String getIdMantenimiento() {
		return idMantenimiento;
	}

	/**
	 * Establece el identificador del estado de mantenimiento
	 * @param idMantenimiento estado de mantenimiento
	 */
	public void setIdMantenimiento(String idMantenimiento) {
		this.idMantenimiento = idMantenimiento;
	}

	/**
	 * Devuelve la fecha de vencimiento de la revision tecnicomecanica
	 * @return revision tecnicomecanica
	 */
	public Date getRevision() {
		return revision;
	}

	/**
	 * Establece la fecha de vencimiento de la revision tecnicomecanica
	 * @param revision fecha de vencimiento
	 */
	public void setRevision(Date revision) {
		this.revision = revision;
	}

	/**
	 * Devuelve la fecha de vencimiento del seguro obligatorio
	 * @return seguro obligatorio
	 */
	public Date getSeguro() {
		return seguro;
	}

	/**
	 * Establece la fecha de vencimiento del seguro obligatorio
	 * @param seguro fecha de vencimiento
	 */
	public void setSeguro(Date seguro) {
		this.seguro = seguro;
	}

	/**
	 * Devuelve el codigo interno del vehiculo al que corresponde el estado de mantenimiento
	 * @return codigo interno del vehiculo
	 */
	public int getIdTransporte() {
		return idTransporte;
	}

	/**
	 * Establece el codigo interno del vehiculo al que corresponde el estado de mantenimiento
	 * @param idTransporte codigo interno del vehiculo
	 */
	public void setIdTransporte(int idTransporte) {
		this.idTransporte = idTransporte;
	}

	@Override
	public String guardarRegistro() {
		String cadena = "insert into mantenimiento values('" + this.getIdMantenimiento() +"',"
				+ this.getSeguro() + "," + this.getRevision() +"," + this.getIdTransporte()
				+ ");";
		return cadena;
	}

	@Override
	public String eliminarRegistro() {
		String cadena = "delete from mantenimiento where(idMantenimiento='" + this.getIdMantenimiento()
				+ "');";
		return cadena;
	}

	@Override
	public String actualizarRegistro() {
		String cadena = "update mantenimiento set seguro=" + this.getSeguro() + ", revision="
				+ this.getRevision() +" where(idmantenimiento='" + this.getIdMantenimiento()
				+ "');";
		return cadena;
	}

	@Override
	public String buscarRegistro() {
		String cadena = "select * from mantenimiento where(idMantenimiento='"
				+ this.getIdMantenimiento() + "');";
		return cadena;
	}
}