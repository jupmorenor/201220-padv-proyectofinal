/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Transporte.java
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
 * Clase que representa un vehiculo de transporte
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public abstract class Transporte {

    /**
     * Cantidad de pasajeros que puede transportar 
     */
    private int capacidad;

    /**
     * Numero de matricula del vehiculo
     */
    private String placa;

    /**
     * Codigo del vehiculo dentro de la empresa
     */
    private int codigoInterno;

    /**
     * Cantidad de combustible que consume el vehiculo por kilometro
     */
    private float consumoCombustible;

    /**
     * Registro del estado de mantenimiento
     */
    private Mantenimiento mMantenimiento;

    /**
     * Crea un nuevo vehiculo de transporte
     */
    public Transporte () {
    }

    /**
     * Devuelve la cantidad de pasajeros que puede transportar
     * @return capacidad
     */
    public int getCapacidad () {
        return capacidad;
    }

    /**
     * Establece la cantidad de pasajeros que puede transportar
     * @param cap cantidad de pasajeros
     */
    public void setCapacidad (int cap) {
        this.capacidad = cap;
    }
    
    /**
     * Devuelve el numero de matricula del vehiculo
     * @return placa
     */
    public String getPlaca () {
        return placa;
    }

    /**
     * Establece el numero de matricula del vehiculo
     * @param pl numero de matricula
     */
    public void setPlaca (String pl) {
        this.placa = pl;
    }

    /**
     * Devuelve el codigo del vehiculo dentro de la empresa
     * @return codigoInterno
     */
    public int getCodigoInterno () {
        return codigoInterno;
    }

    /**
     * Establece el codigo del vehiculo dentro de la empresa
     * @param cod codigo del vehiculo
     */
    public void setCodigoInterno (int cod) {
        this.codigoInterno = cod;
    }

    /**
     * Devuelve la cantidad de combustible que consume el vehiculo por kilometro
     * @return consumoCombustible
     */
    public float getConsumoCombustible () {
        return consumoCombustible;
    }

    /**
     * Establece la cantidad de combustible que consume el vehiculo por kilometro
     * @param con combustible que consume
     */
    public void setConsumoCombustible (float con) {
        this.consumoCombustible = con;
    }

    /**
     * Devuelve el estado de mantenimiento del vehiculo
     * @return mMantenimiento
     */
    public Mantenimiento getMantenimiento () {
        return mMantenimiento;
    }

    /**
     * Establece el estado de mantenimiento del vehiculo
     * @param man estado de mantenimiento
     */
    public void setMantenimiento (Mantenimiento man) {
        this.mMantenimiento = man;
    }
}