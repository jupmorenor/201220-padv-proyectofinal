/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Persona.java
 * 
 * Proyecto de primer corte de Programacion Avanzada
 * Presentado por:
 * Juan Pablo Moreno Rico - 20111020059
 * Anderson Orlando Ramirez Lamprea - 20111020072
 * Karen Vanessa Angulo Sogamoso - 20112020055
 * ------------------------------------------
 */
package nucleo;

import java.util.Date;

/**
 * Clase que representa un empleado de la empresa
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public abstract class Persona implements AccesoaDatos{

    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Numero de cedula de la presona
     */
    private String identificacion;

    /**
     * Numero telefonico de la persona
     */
    private String telefono;

    /**
     * Direccion de domicilio de la persona
     */
    private String direccion;

    /**
     * Fecha de nacimiento de la persona
     */
    private Date fechaNacimiento;

    /**
     * Crea un nuevo empleado de la empresa
     */
    public Persona () {
    }

    /**
     * Devuelve la direccion de domicilio de la persona
     * @return direccion
     */
    public String getDireccion () {
        return direccion;
    }

    /**
     * Establece la direccion de domicilio de la persona
     * @param dir direccion de domicilio
     */
    public void setDireccion (String dir) {
        this.direccion = dir;
    }

    /**
     * Devuelve la fecha de nacimiento de la persona
     * @return fechaNacimiento
     */
    public Date getFechaNacimiento () {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona
     * @param fecha fecha de nacimiento
     */
    public void setFechaNacimiento (Date fecha) {
        this.fechaNacimiento = fecha;
    }

    /**
     * Devuelve el numero de cedula de la presona
     * @return identificacion
     */
    public String getIdentificacion () {
        return identificacion;
    }

    /**
     * Establece el numero de cedula de la presona
     * @param id numero de cedula
     */
    public void setIdentificacion (String id) {
        this.identificacion = id;
    }

    /**
     * Devuelve el nombre de la persona
     * @return nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * Establece el nombre de la persona
     * @param nom nombre de la persona
     */
    public void setNombre (String nom) {
        this.nombre = nom;
    }

    /**
     * Devuleve el numero telefonico de la persona
     * @return telefono
     */
    public String getTelefono () {
        return telefono;
    }

    /**
     * Establece el numero telefonico de la persona
     * @param tel numero telefonico
     */
    public void setTelefono (String tel) {
        this.telefono = tel;
    }
    
    @Override
    public abstract String guardarRegistro();
    
	  @Override
	  public String eliminarRegistro() {
		    String cadena = "delete from persona where(identificacionPersona='" 
				    + this.getIdentificacion() + "');";
		    return cadena;
	  }

	  @Override
	  public String actualizarRegistro() {
		    String cadena = "update persona set telefono='" + this.getTelefono() 
				    + "', direccion='" + this.getDireccion() + "' where(identificacionPersona='"
				    + this.getIdentificacion() + "');";
		    return cadena;
	  }

	  @Override
	  public String buscarRegistro() {
		    String cadena = "select * from persona where(identificacionPersona='"  
				    + this.getIdentificacion() + "');";
		    return cadena;
	  }

}