/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Parada.java
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
 * Clase que representa un lugar donde un bus realiza una parada dentro de una ruta
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Parada extends Estacion{

    /**
     * Crea una nueva parada para una ruta
     */
    public Parada () {
    }

    @Override
    public String guardarRegistro() {
        String cadena = "insert into estacion values('" + this.getCodigoEstacion()
              + "','" + this.getNombre() + "','" + this.getDireccion() + "','2'," 
              + this.getCiudad().getCodigoCiudad() + "');";
        return cadena;
    }

}