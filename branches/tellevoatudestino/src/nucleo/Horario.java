/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Horario.java
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
 * Representa el horario en que funciona una ruta
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Horario {

    /**
     * Dia en que opera la ruta
     */
    private int dia;

    /**
     * Crea un nuevo horario para una ruta 
     */
    public Horario () {
    }

    /**
     * Devuelve el dia
     * @return dia
     */
    public int getDia () {
        return dia;
    }

    /**
     * Establece el dia
     * @param val
     */
    public void setDia (int dia) {
        this.dia = dia;
    }

}

