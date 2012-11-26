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
public class Bus extends Transporte {

    /**
     * Construye un nuevo bus
     */
    public Bus () {
    }
    
    
    public String guardarRegistro() {
    	String cadena = "insert into transporte values(" + this.getCapacidad() + 
    			",'" + this.getPlaca() + "','" + this.getCodigoInterno() + "'," + this.getConsumoCombustible() 
    			+ ",'1');"; 
    	return cadena;
    }

}
