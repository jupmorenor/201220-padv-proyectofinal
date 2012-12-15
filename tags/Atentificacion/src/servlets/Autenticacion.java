/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * Autenticacion.java
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

import baseDatos.Conectar;
import autenticador.Usuario;
import autenticador.UsuarioExistente;


/**
 * Servlet que controla el acceso verificando el usuario y redireccionando segun corresponda
 * @author Juan Pablo Moreno Rico - 20111020059
 * @author Anderson Orlando Ramirez Lamprea - 20111020072
 * @author Karen Vanessa Angulo Sogamoso - 20112020055
 * @version 1.0
 */
@WebServlet("/Autenticacion")
public class Autenticacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autenticacion() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			this.processRequest(request, response);
		} catch (Exception ex) {
			//La excepcion se toma dentro del llamado a processRequest en doGet();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			this.processRequest(request, response);
		} catch (Exception ex) {
			//La excepcion se toma dentro del llamado a processRequest en doPost();
		}
	}
	
	/**
	 * verifica la autenticidad del usuario que trata de ingresar al sistema
	 * @param request
	 * @param response
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response ) 
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		out = response.getWriter();
		
		try {
			String usuario = request.getParameter("Usuario");
			String pass = request.getParameter("Clave");
			String boton = request.getParameter("Boton");
			
			if (boton.equals("registrarse")) {
				response.sendRedirect("registrarNuevo.jsp");
			} else if (boton.equals("ingresar")) {
			
				//Conectar conn = new Conectar("10.20.161.220", "autenticacionUsuarios_kja", "estudiantes", "estudiantes");
				Conectar conn = new Conectar("localhost", "autenticacionUsuarios_kja", "root", "");
				
				ResultSet tabla = null;
				Usuario us = new UsuarioExistente();
				us.setNombre(usuario);
				us.setPassword(pass);
				conn.SetCadena(us.consultarUsuario());
				
				tabla = conn.Consultar();
				if (tabla.next()) {
					String roll = tabla.getString("roll");
					if (roll.equals("administrador")) {
						response.sendRedirect("MenuAdmin.jsp");
					} else if (roll.equals("empleado")){
						response.sendRedirect("MenuEmpleado.jsp");
					} else if (roll.equals("usuario")) {
						response.sendRedirect("MenuUsuario.jsp");
					}
					
				} else {
					this.errorRegistro("Usuario "+ usuario + " no encontrado o contraseña incorrecta");
				}
			}
				
		} catch(Exception ex) {
			this.errorRegistro("No se pudo conectar a la base de datos");
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