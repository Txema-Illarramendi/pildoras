package WorkingWithWindows;

import javax.swing.JFrame;

public class WndwLarge extends JFrame{
	


	//Propiedades de clase
	private int ancho=800;
	private int alto=450;
	private int cerrar=3;
	private boolean ver=true;

	//Constructor
	public WndwLarge(String titulo) {
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setTitle(titulo);
		setDefaultCloseOperation(cerrar);
		setVisible(ver);
	}

}
