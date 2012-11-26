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

/**
 * Clase que representa el estado del mantenimiento de un vehiculo de transporte
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Mantenimiento {
	
	/**
	 * Tipo de registro del estado del mantenimiento
	 */
	private String tipoMantenimiento;
	
	/**
     * Crea un nuevo estado de mantenimiento
     */
    public Mantenimiento () {
    }

    /**
     * Devuelte el registro del estado del mantenimiento
	 * @return tipoMantenimiento
	 */
	public String getTipoMantenimiento() {
		return tipoMantenimiento;
	}

	/**
	 * Establece el registro del estado del mantenimiento
	 * @param tipoMantenimiento valor de entrada
	 */
	public void setTipoMantenimiento(String tipoMantenimiento) {
		this.tipoMantenimiento = tipoMantenimiento;
	}

}
