/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * AccesoaDatos.java
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
 * Interfaz con metodos para generar los comandos de acceso a la base de datos
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public interface AccesoaDatos {
	
	/**
     * Devuelve el comando de mySql que inserta un registro en la base de datos
     * @return String
     */
	public String guardarRegistro();
	
	/**
     * Devuelve el comando de mySql que elimina un registro de la base de datos
     * @return String
     */
	public String eliminarRegistro();
	
	/**
     * Devuelve el comando de mySql que actualiza un registro de la base de datos
     * @return String
     */
	public String actualizarRegistro();
	
	/**
     * Devuelve el comando de mySql que busca un registro en la base de datos
     * @return String
     */
	public String buscarRegistro();

}
