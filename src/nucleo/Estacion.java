/* 
 * ------------------------------------------
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
public abstract class Estacion implements AccesoaDatos{

    /**
     * Codigo de la estacion
     */
    private String codigoEstacion;
    
    /**
     * Nombre de la estacion
     */
    private String nombreEstacion;
    
    /**
     * Direccion de ubicacion de la estacion
     */
    private String direccionEstacion;

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
        return direccionEstacion;
    }

    /**
     * establece la direccion donde se ubica la estacion
     * @param dir direccion
     */
    public void setDireccion (String dir) {
        this.direccionEstacion = dir;
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
    
    @Override
    public abstract String guardarRegistro();
    
    @Override
    public String eliminarRegistro() {
        String cadena = "delete from estacion where(nombreEstacion='" + this.getNombre()
              + "');";
        return cadena;
    }
    
    @Override
    public String actualizarRegistro() {
        String cadena = "update estacion set nombreEstacion='" + this.getNombre()
              + "', direccionEstacion='" + this.getDireccion() + "' where(codigoEstacion='"
              + this.getCodigoEstacion() + "');";
        return cadena;
    }
    
    @Override
    public String buscarRegistro() {
        String cadena = "select * from estacion where(nombreEstacion='" + this.getNombre() + "');";
        return cadena;
    }

}