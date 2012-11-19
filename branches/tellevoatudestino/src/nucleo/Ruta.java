/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Ruta.java
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
 * Clase que representa una ruta que realiza la empresa
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Ruta implements AccesoaDatos{

    /**
     * Codigo interno de la ruta
     */
    private String codigoRuta;

    /**
     * Nombre de la ruta
     */
    private String nombreRuta;

    /**
     * Valor a pagar para usar la ruta
     */
    private int tarifaRuta;

    /**
     * Crea una nueva ruta
     */
    public Ruta () {
    }

    /**
     * Devuelve el codigo de la ruta 
     * @return codigoRuta
     */
    public String getCodigoRuta () {
        return codigoRuta;
    }

    /**
     * Establece el codigo de la ruta 
     * @param cod codigo de la ruta
     */
    public void setCodigoRuta (String cod) {
        this.codigoRuta = cod;
    }

    /**
     * Devuelve el nombre de la ruta 
     * @return nombreRuta
     */
    public String getNombreRuta () {
        return nombreRuta;
    }

    /**
     * Establece el nombre de la ruta
     * @param nom nombre de la ruta
     */
    public void setNombreRuta (String nom) {
        this.nombreRuta = nom;
    }

    /**
     * Devuelve el valor de la tarifa de la ruta 
     * @return tarifaRuta
     */ 
    public int getTarifaRuta () {
        return tarifaRuta;
    }

    /**
     * Establece el valor de la tarifa de la ruta
     * @param tar valor de la tarifa
     */
    public void setTarifaRuta (int tar) {
        this.tarifaRuta = tar;
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

