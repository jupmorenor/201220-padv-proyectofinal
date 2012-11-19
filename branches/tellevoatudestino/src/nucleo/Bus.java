/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Bus.java
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
 * Clase que representa un bus de la empresa
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Bus extends Transporte implements AccesoaDatos{

    /**
     * Construye un nuevo bus
     */
    public Bus () {
    }
    
    /**
     * Devuelve el comando de mySql que inserta un registro en la base de datos
     * @return cadena
     */
    public String guardarRegistro() {
    	String cadena = "insert into transporte values(" + this.getCapacidad() + 
    			",'" + this.getPlaca() + "'," + this.getCodigoInterno() + "," + this.getConsumoCombustible() + ")"; 	
    	return cadena;
    }

    /**
     * Devuelve el comando de mySql que elimina un registro de la base de datos
     * @return cadena
     */
    public String eliminarRegistro() {
    	String cadena = "delete from transporte where(placa='" + this.getPlaca() + "')";
    	return cadena;
    }

    /**
     * Devuelve el comando de mySql que actualiza un registro de la base de datos
     * @return cadena
     */
    public String actualizarRegistro() {
    	String cadena = "update transporte set codigoBus=" + this.getCodigoInterno() 
    					+ " where(placa= '" + this.getPlaca() + "')";	
    	return cadena;
    }
    
    /**
     * Devuelve el comando de mySql que busca un registro en la base de datos
     * @return cadena
     */
    public String buscarRegistro() {
    	String cadena = "select * from transporte where(placa='" + this.getPlaca() + "')";    	
    	return cadena;
    }
    
}
