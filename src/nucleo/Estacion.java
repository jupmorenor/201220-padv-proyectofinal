* Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Estacion.java
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
 * Clase que representa una instalacion en general de la empresa
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public abstract class Estacion {

    /**
     * Direccion de ubicacion de la estacion
     */
    private String direccion;

    /**
     * Nombre de la estacion
     */
    private String nombreEstacion;

    /**
     * Codigo de la estacion
     */
    private String codigoEstacion;

    /**
     * Ciudad donde se ubica la estacion
     */
    private Ciudad mCiudad;

    /**
     * Crea una nueva estacion
     */
    public Estacion () {
    }

    /**
     * Devuelve el codigo de la estacion
     * @return codigoEstacion
     */
    public String getCodigoEstacion () {
        return codigoEstacion;
    }

    /**
     * Establece el codigo de la estacion
     * @param cod codigo de la estacion
     */
    public void setCodigoEstacion (String cod) {
        this.codigoEstacion = cod;
    }

    /**
     * Devuelve la direccion donde se ubica la estacion
     * @return direccion
     */
    public String getDireccion () {
        return direccion;
    }

    /**
     * establece la direccion donde se ubica la estacion
     * @param dir direccion
     */
    public void setDireccion (String dir) {
        this.direccion = dir;
    }

    /**
     * Devuelve el nombre de la estacion
     * @return nombreEstacion
     */
    public String getNombre () {
        return nombreEstacion;
    }

    /**
     * Establece el nombre de la estacion
     * @param nom nombre de la estacion
     */
    public void setNombre (String nom) {
        this.nombreEstacion = nom;
    }

    /**
     * Devuelve la ciudad donde se ubica la estacion
     * @return mCiudad
     */
	public Ciudad getCiudad() {
		return mCiudad;
	}

	/**
	 * Establece la ciudad donde se ubica la estacion
	 * @param mCiudad ciudad de ubicacion
	 */
	public void setCiudad(Ciudad mCiudad) {
		this.mCiudad = mCiudad;
	}
}