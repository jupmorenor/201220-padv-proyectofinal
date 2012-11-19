/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Ciudad.java
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
 * Clase que representa una ciudad donde hay sucursales o paradas de la empresa
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
public class Ciudad implements AccesoaDatos{

    /**
     * Codigo de la ciudad
     */
    private String codigoCiudad;

    /**
     * Nombre d ela ciudad
     */
    private String nombreCiudad;

    /**
     * Crea una nueva ciudad
     */
    public Ciudad () {
    }

    /**
     * Devuelve el codigo de la ciudad 
     * @return codigoCiudad
     */
    public String getCodigoCiudad () {
        return codigoCiudad;
    }

    /**
     * Establece el codigo de la ciudad
     * @param cod codigo de la ciudad
     */
    public void setCodigoCiudad (String cod) {
        this.codigoCiudad = cod;
    }

    /**
     * Devuelve el nombre de la ciudad
     * @return nombreCiudad
     */
    public String getNombreCiudad () {
        return nombreCiudad;
    }

    /**
     * establece el nombre de la ciudad
     * @param nom
     */
    public void setNombreCiudad (String nom) {
        this.nombreCiudad = nom;
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