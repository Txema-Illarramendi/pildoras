package Eventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventoCuadroDeTexto {

	public static void main(String[] args) {
		new MarcoCuadroEvento();
	}
}

//---EventoCuadroDeTexto-----------------------------------------------------------

class MarcoCuadroEvento extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private int ancho=800;
	private int alto=500;
	private boolean rigid=false;
	private boolean visible=true;
	private String titulo="TextFiels PildorasFormativas - Txema";
	
	//Constructor
	public MarcoCuadroEvento() {
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setResizable(rigid);
		setTitle(titulo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LaminaCuadroEvento());
		setVisible(visible);
	}
}

//---MarcoCuadroEvento------------------------------------------------------------

class LaminaCuadroEvento extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	JTextField cdrText1 = new JTextField(20);
	public LaminaCuadroEvento() {
		Document docu=cdrText1.getDocument();
		docu.addDocumentListener(new escuchaDocumento());
		add(cdrText1);
	}
//}

//---LaminaCuadroEvento-----------------------------------------------------------

private class escuchaDocumento implements DocumentListener{

	public void insertUpdate(DocumentEvent e) {
		System.out.println("Has introducido texto");
	}

	public void removeUpdate(DocumentEvent e) {
		System.out.println("Has borrado texto");
	}

	public void changedUpdate(DocumentEvent e) {
		System.out.println("¿cuando se lanza este evento?");
	}
}
}
