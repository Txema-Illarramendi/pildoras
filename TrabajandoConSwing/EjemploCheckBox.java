package TrabajandoConSwing;

import javax.swing.JFrame;

public class EjemploCheckBox {

	public static void main(String[] args) {
		
	}
}

//---EjemploCheckBox---------------------------------------------------------------

class MarcoCheckBox extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private int ancho = 800;
	private int alto = 500;
	private String titulo = "Pildoras Formativas - Txema";
	private int cerrar = 3;
	private boolean rigid = false;
	
	//Constructor
	public MarcoCheckBox() {
		setSize(ancho, alto);
		setTitle(titulo);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}