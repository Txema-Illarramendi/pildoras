package WorkingWithWindows;

import javax.swing.JFrame;

public class WndwSmall extends JFrame{
	

	//Propiedades de clase
	private int ancho=400;
	private int alto=170;
	private int cerrar=3;
	private boolean ver=true;

	//Constructor
	public WndwSmall(String titulo) {
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setTitle(titulo);
		setDefaultCloseOperation(cerrar);
		setVisible(ver);
	}
	
}
