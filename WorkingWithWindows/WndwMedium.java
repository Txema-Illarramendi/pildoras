package WorkingWithWindows;

import javax.swing.JFrame;

public class WndwMedium extends JFrame{
	

	//Propiedades de clase
	private int ancho=650;
	private int alto=300;
	private int cerrar=3;
	private boolean ver=true;

	//Constructor
	public WndwMedium(String titulo) {
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setTitle(titulo);
		setDefaultCloseOperation(cerrar);
		setVisible(ver);
	}

}
