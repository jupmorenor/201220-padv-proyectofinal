/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Conectar.java
 * 
 * Proyecto de primer corte de Programacion Avanzada
 * Presentado por:
 * Juan Pablo Moreno Rico - 20111020059
 * Anderson Orlando Ramirez Lamprea - 20111020072
 * Karen Vanessa Angulo Sogamoso - 20112020055
 * ------------------------------------------
 */
package nucleo;

import java.sql.*;

/**
 * Clase realiza la conexion con la base de datos
 * @author Adriana Maritza Montejo
 */
public class Conectar 
{
	//declaracion de atributos
	private Connection dbConecta;
	private String CadenaSql;
	
	//
	/**
	 * El constructor de la clase crea la conexion con la base de datos
	 * @param pNombreServidor nombre del servidor
	 * @param pNombreBD nombre de la base de datos
	 * @param pLogin nombre del usuario de MySQL 
	 * @param pPassword contraseña de ingreso de MySQL
	 */
	public Conectar(String pNombreServidor, String pNombreBD, String pLongin, String pPassword)
  	{
   		try 
        {           
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }        
        catch(Exception ex) 
        {
            ex.printStackTrace();
        }
        try
        {
            String cone = "jdbc:mysql://"+pNombreServidor+"/"+pNombreBD+"?user="+pLongin+"&password="+pPassword;
            dbConecta = DriverManager.getConnection(cone);
        }      
        catch (SQLException sqlEx) 
        {
        	sqlEx.printStackTrace();
        }
 	}
 	
	/**
	 * cargar consultas sql
	 * @param cadena comando de la consulta
	 */
	public void SetCadena(String cadena)
	{
		CadenaSql=cadena;
	}
	
	/**
	 * ejecutar transacciones (insertar, actualizar, eliminar)
	 * @return rta
	 */
	public String EjecutarSql()
	{
		String rta = "";
		try
		{
   			Statement stmt=dbConecta.createStatement();
   			rta += stmt.executeUpdate(CadenaSql);  			
   			dbConecta.close();
   			
		}
		catch(SQLException ex)
		{
       		ex.printStackTrace();
		} 
		return rta;
	}
	
	/**
	 * Ejecutar consultas
	 * @return tabla
	 */
	public ResultSet Consultar()
	{
		ResultSet tabla=null;
		try
		{
			Statement stmt=dbConecta.createStatement();
			tabla=stmt.executeQuery(CadenaSql);			
		}
		catch(SQLException ex)
      	{
       		ex.printStackTrace();
      	} 
		return tabla;
	}
	
	/**
	 * cerrar la base de datos despues de las consultas
	 */
	public void CerrarBase()
	{
		try
		{
			dbConecta.close();
		}
		catch(SQLException ex)
      	{
       		ex.printStackTrace();
      	} 
	}
	
}