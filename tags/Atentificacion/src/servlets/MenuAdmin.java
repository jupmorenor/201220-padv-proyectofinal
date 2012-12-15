/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * MenuAdmin.java
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
import javax.swing.JOptionPane;

import autenticador.Administrador;
import autenticador.Usuario;
import autenticador.UsuarioNuevo;
import baseDatos.Conectar;

/**
 * Servlet que controla el acceso a las opciones que tiene el administrador
 * 
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
@WebServlet("/MenuAdmin")
public class MenuAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MenuAdmin() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
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
	@Override
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
	 * Verifica la seleccion realizada por el administrador y lo direcciona
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		out = response.getWriter();

		try {
			String comando = request.getParameter("BotonMenu");

			if (comando.equals("Administrar")) {

				try {

					// Conectar conn = new Conectar("10.20.161.220",
					// "autenticacionUsuarios_kja", "estudiantes",
					// "estudiantes");
					Conectar conn = new Conectar("localhost",
							"autenticacionUsuarios_kja", "root", "");

					ResultSet tabla = null;
					Usuario un = new Administrador();
					conn.SetCadena(un.consultarUsuario());
					tabla = conn.Consultar();
					request.getSession().setAttribute("usuarios", tabla);

					response.sendRedirect("tablaUsuarios.jsp");
				} catch (Exception e) {
					this.errorRegistro("No se pudo conectar con la base de datos");
				}

			} else if (comando.equals("Abrir Sistema")) {
				this.errorRegistro("Aqui se abre el sistema al que se quiere acceder");
			} else {

				try {
					// Conectar conn = new Conectar("10.20.161.220",
					// "autenticacionUsuarios_kja", "estudiantes",
					// "estudiantes");
					Conectar conn = new Conectar("localhost",
							"autenticacionUsuarios_kja", "root", "");

					Usuario un = new Administrador();
					un.setNombre(comando);
					conn.SetCadena(un.modificarRegistro());
					String rta = conn.EjecutarSql();

				} catch (Exception e) {
					this.errorRegistro("No se pudo conectar con la base de datos");
				}

				response.sendRedirect("MenuAdmin.jsp");
				System.out.println(comando);
			}

		} catch (Exception ex) {
			this.errorRegistro("Hubo un error inesperado");
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
