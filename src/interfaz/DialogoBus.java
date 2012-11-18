package interfaz;

import javax.swing.JDialog;
import javax.swing.JFrame;

import nucleo.Bus;
import nucleo.Conectar;

public class DialogoBus extends JFrame { //JDialog
	
	
	
	private PanelBus panelBus;
	
	public DialogoBus() {
		setTitle("Agregar Bus");
		
		panelBus = new PanelBus(this);
		add(panelBus);
		pack();
		setLocationRelativeTo(null);
		
	}
	
	public void aceptar() {
		try {
			Conectar conn = new Conectar("localhost", "tellevoatudestino_jak", "usuario", "password");
			Bus bus = new Bus();
			bus.setPlaca(panelBus.getPlaca());
			bus.setCapacidad(panelBus.getCupo());
			bus.setCodigoInterno(panelBus.getCodigo());
			conn.SetCadena(bus.guardarRegistro());
			String respuesta = conn.EjecutarSql();
			panelBus.confirmarRegistro(respuesta);
			
		} catch (Exception ex) {
			ex.getMessage();
		}
		setVisible(false);
		dispose();
	}
	
	public void cancelar() {
		setVisible(false);
		dispose();
	}
	
	public static void main(String[] args) {
		DialogoBus dg = new DialogoBus();
		dg.setVisible(true);
	}
}
