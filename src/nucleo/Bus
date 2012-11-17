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
 * Anderson Ramirez - 20111020---
 * ------ - 20112020---
 * ------------------------------------------
 */

package nucleo;

/**
 * Clase que representa un bus de la empresa
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Ramirez - 20111020---
 * @author ------ - 20112020---
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
    	String cadena = "insert into bus values('" + this.getPlaca() + "'," 
    		+ this.getCapacidad() + ",'" + this.getCodigoInterno() + "')"; 	
    	return cadena;
    }

    /**
     * Devuelve el comando de mySql que elimina un registro de la base de datos
     * @return cadena
     */
    public String eliminarRegistro() {
    	String cadena = "delete from bus where(placa='" + this.getPlaca() + "')";
    	return cadena;
    }

    /**
     * Devuelve el comando de mySql que actualiza un registro de la base de datos
     * @return cadena
     */
    public String actualizarRegistro() {
    	String cadena = "update bus set codigoBus='" + this.getCodigoInterno() 
    					+ "' where(placa= '" + this.getPlaca() + "')";	
    	return cadena;
    }
    
    /**
     * Devuelve el comando de mySql que busca un registro en la base de datos
     * @return cadena
     */
    public String buscarRegistro() {
    	String cadena = "select * from bus where(placa='" + this.getPlaca() + "')";    	
    	return cadena;
    }
    
}
