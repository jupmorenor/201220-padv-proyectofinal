package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelBus extends JPanel implements ActionListener {

	private DialogoBus ventana;
	
	private JLabel lbPlaca;
	private JLabel lbCupo;
	private JLabel lbCodigo;
	
	private JTextField txtPlaca;
	private JTextField txtCupo;
	private JTextField txtCodigo;
	
	private JButton guardarDatos;
	private JButton limpiarDatos;
	
	public PanelBus(DialogoBus diag) {
		
		ventana = diag;
		
		setLayout(new GridLayout(4,2));
		setBorder(new LineBorder(Color.gray));
		
		lbPlaca = new JLabel("Matricula: ");
		lbCupo = new JLabel("Capacidad: ");
		lbCodigo = new JLabel("Codigo interno: ");
		
		txtPlaca = new JTextField();
		txtCupo = new JTextField();
		txtCodigo = new JTextField();
		
		guardarDatos = new JButton("Aceptar");
		guardarDatos.setActionCommand("ACEPTAR");
		guardarDatos.addActionListener(this);
		
		limpiarDatos = new JButton("Cancelar");
		limpiarDatos.setActionCommand("CANCELAR");
		limpiarDatos.addActionListener(this);
		
		add(lbPlaca); add(txtPlaca);
		add(lbCupo); add(txtCupo);
		add(lbCodigo); add(txtCodigo);
		add(guardarDatos); add(limpiarDatos);
	}
	
	public void confirmarRegistro(String respuesta) {
		JOptionPane.showMessageDialog(this, "Se inserto " + respuesta + "registros", "Registrado", JOptionPane.OK_OPTION);
	}
	
	public void cancelarRegistro() {
		JOptionPane.showMessageDialog(this, "Se ha cancelado el registro", "Cancelado", JOptionPane.CANCEL_OPTION);
	}
	
	public String getPlaca() {
		return txtPlaca.getText();
	}
	
	public int getCupo() {
		return Integer.parseInt(txtCupo.getText());
	}
	
	public int getCodigo() {
		return Integer.parseInt(txtCodigo.getText());
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getActionCommand().equals("ACEPTAR")) {
			ventana.aceptar();
		} else if (evento.getActionCommand().equals("CANCELAR")) {
			ventana.cancelar();
		}
	}
}
