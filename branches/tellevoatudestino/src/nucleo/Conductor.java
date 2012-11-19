/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Conductor.java
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
 * Clase que representa aun conductor de bus de la empresa
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Conductor extends Persona implements AccesoaDatos{

    /**
     * Numero de licencia de conduccion del conductor
     */
    private String licenciaConduccion;

    /**
     * Crea un nuevo conductor
     */
    public Conductor () {
    }

    /**
     * Devuelve el numero de licencia de conduccion del conductor
     * @return licenciaConduccion
     */
    public String getLicenciaConduccion () {
        return licenciaConduccion;
    }

    /**
     * Establece el numero de licencia de conduccion del conductor
     * @param lic licencia de conduccion
     */
    public void setLicenciaConduccion (String lic) {
        this.licenciaConduccion = lic;
    }

	@Override
	public String guardarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String actualizarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buscarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

}