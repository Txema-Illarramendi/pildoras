package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Multipleslisteners {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MarcoPrincipal marco = new MarcoPrincipal();
	}

}

//-----------------------------------------------------------------------------------

class MarcoPrincipal extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Paramentros de clase
	private int ancho=800;
	private int alto=500;
	private String titulo="Txema Software";
	private boolean reescalable=(false);
	private int cerrar=3;
	
	//Constructor
	public MarcoPrincipal() {
		setSize(ancho,alto);
		setLocationRelativeTo(null);
		setTitle(titulo);
		setResizable(reescalable);
		setDefaultCloseOperation(cerrar);
		Lamina_1 lmnOne=new Lamina_1(); 
		add(lmnOne);
		setVisible(true);
	}
}

//------------------------------------------------------------------------------------

class Lamina_1 extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private JButton btnNuevo=new JButton("Nueva ventana");
	private JButton btnCerrar=new JButton("Cerrar todo");
	
	//constructor
	public Lamina_1() {
		add(btnNuevo);
		add(btnCerrar);
		btnNuevo.addActionListener(new CreaMarco());
	}
	
	private class CreaMarco implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			MarcoNuevo miMarco=new MarcoNuevo(btnCerrar);
			miMarco.setVisible(true);
		}
	}
}

//-------------------------------------------------------------------------------------

class MarcoNuevo extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private static int contador=0;
	private int ancho=350;
	private int alto=200;
	
	//Constructor
	public MarcoNuevo(JButton btn) {
		contador++;
		setTitle("Ventana " + contador);
		setSize(ancho,alto);
		setLocation(200, 220*contador);
		btn.addActionListener(new CierraTodo());
	}
	
	private class CierraTodo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			dispose();
			contador=0;
		}
		
	}
	
}