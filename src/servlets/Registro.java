/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Registro.java
 * 
 * Proyecto de primer corte de Programacion Avanzada
 * Presentado por:
 * Juan Pablo Moreno Rico - 20111020059
 * Anderson Orlando Ramirez Lamprea - 20111020072
 * Karen Vanessa Angulo Sogamoso - 20112020055
 * ------------------------------------------
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import autenticador.Usuario;
import autenticador.UsuarioNuevo;
import baseDatos.Conectar;

/**
 * Servlet que realiza el registro de nuevos usuarios a la base de datos
 * 
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registro() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			this.processRequest(request, response);
		} catch (Exception ex) {
			// La excepcion se toma dentro del llamado a processRequest en
			// doGet();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			this.processRequest(request, response);
		} catch (Exception ex) {
			// La excepcion se toma dentro del llamado a processRequest en
			// doPost();
		}
	}

	/**
	 * Valida los datos y realiza el registro en la BD
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		out = response.getWriter();

		try {
			String nombre = request.getParameter("Nombre");
			String clave1 = request.getParameter("Clave1");
			String clave2 = request.getParameter("Clave2");
			String tipo = request.getParameter("TipoUsuario");

			if (clave1.equals(clave2)) {

				// Conectar conn = new Conectar("10.20.161.220",
				// "autenticacionUsuarios_kja", "estudiantes", "estudiantes");
				Conectar conn = new Conectar("localhost",
						"autenticacionUsuarios_kja", "root", "");

				ResultSet tabla = null;
				Usuario us = new UsuarioNuevo();
				us.setNombre(nombre);
				us.setPassword(clave1);
				us.setTipoUsuario(tipo);
				conn.SetCadena(us.consultarUsuario());
				tabla = conn.Consultar();

				if (tabla.next() == false) {
					conn.SetCadena(us.modificarRegistro());
					String rta = conn.EjecutarSql();
					response.sendRedirect("index.jsp");
				} else {
					errorRegistro("El usuario " + nombre + " ya existe");
				}
			} else {
				errorRegistro("La contraseña de validacion no coincide");
			}
		} catch (Exception ex) {
			errorRegistro("No se pudo registrar el usuario");
		} finally {
			out.close();
		}

	}

	/**
	 * Imprime un mensaje de error en la ventana
	 */
	protected void errorRegistro(String mensaje) {

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Autenticacion de usuarios</title>");
		out.println("</head>");
		out.println("<body><div align=\"center\">");
		out.println("<h1 align=\"center\">Autenticacion de usuarios</h1>");
		out.println("<h2 align=\"center\"><img src=\"recursos/login_icon.png\">");
		out.println("</div>");
		out.println("<div align=\"center\">");
		out.println("<h2 align=\"center\">");
		out.println(mensaje);
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");

	}

}
