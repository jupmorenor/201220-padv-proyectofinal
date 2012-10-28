/* 
 * ------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas 
 * 
 * FuncionesBasicas.java
 * 
 * Proyecto final de Programacion Avanzada
 * Presentado por:
 * Juan Pablo Moreno Rico - 20111020059
 * 
 * 
 * ------------------------------------------
 */
package nucleo;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * Clase con metodos estaticos para uso general del nucleo de la aplicacion
 * @author Juan Pablo Moreno Rico - 20111020059
 * @version 0.1
 */
public final class FuncionesBasicas {
	
	/**
	 * Devuelve un objeto de Imagen a partir del directotio de ubicacion.
	 * @param ubicacion de la imagen a cargar
	 * @return
	 */
	public Image cargarImagen(String ubicacion) {
		Image imagen = null;
		try {
			imagen = ImageIO.read(getClass().getClassLoader().getResource(ubicacion));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen");
		}
		return imagen;
	}
	
	/**
	 * Devuelve el angulo de inclinacion de un vector dados su punto inicial y su punto final.
	 * @param x1 coordenada inicial en x.
	 * @param y1 coordenada inicial en y.
	 * @param x2 coordenada final en x.
	 * @param y2 cordenada final en y.
	 * @return direccion del vector generado por los puntos dados.
	 */
	public static double direccionAlPunto(double x1, double y1, double x2, double y2) {
		double distanciaX = x2 - x1;
		double distanciaY = y2 - y1;
		double direccion = -1 * Math.toDegrees(Math.atan2(distanciaY, distanciaX));
		return direccion;
	}
		
	/**
	 * Devuelve el valor del componente en X de un vector dados su magnitud y angulo de inclinacion.
	 * @param magnitud del vector
	 * @param angulo de inclinacion respecto al eje X
	 * @return componenteX del vector con angulo indicado.
	 */
	public static double vectorComponenteX(double magnitud, double angulo) {
		double componenteX = Math.cos(Math.toRadians(angulo));
		return componenteX;
	}
	
	/**
	 * Devuelve el valor del componente en X de un vector dados su magnitud y angulo de inclinacion.
	 * @param magnitud del vector.
	 * @param angulo de inclinacion respecto al eje X
	 * @return componenteY del vector con angulo indicado.
	 */
	public static double vectorComponenteY(double magnitud, double angulo) {
		double componenteY = Math.sin(Math.toRadians(angulo)) * -magnitud;
		return componenteY;
	}

}