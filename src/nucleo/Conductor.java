/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Conductor.java
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
 * Clase que representa aun conductor de bus de la empresa
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Conductor extends Persona implements AccesoaDatos{

    /**
     * Numero de licencia de conduccion del conductor
     */
    private String licenciaConduccion;

    /**
     * Crea un nuevo conductor
     */
    public Conductor () {
    }

    /**
     * Devuelve el numero de licencia de conduccion del conductor
     * @return licenciaConduccion
     */
    public String getLicenciaConduccion () {
        return licenciaConduccion;
    }

    /**
     * Establece el numero de licencia de conduccion del conductor
     * @param lic licencia de conduccion
     */
    public void setLicenciaConduccion (String lic) {
        this.licenciaConduccion = lic;
    }

	@Override
	public String guardarRegistro() {
		String cadena = "insert into persona values('" + this.getIdentificacion() 
				+ "','" + this.getNombre() + "','" + this.getTelefono() + "','" 
				+ this.getDireccion() + "'," + this.getFechaNacimiento() + ",'1');";
		return cadena;
	}

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