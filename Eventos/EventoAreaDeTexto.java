package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EventoAreaDeTexto {
	public static void main(String[] args) {
		new MarcoAreaTexto();
	}
}

//---Fin EventoAreaDeTexto-----------------------------------------------------------

class MarcoAreaTexto extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private int ancho=800;
	private int alto=500;
	private boolean rigid=false;
	private String titulo="Areas de texto PildotrasFormativas - Txema";
	
	//Constructor
	public MarcoAreaTexto() {
		setSize(ancho,alto);
		setLocationRelativeTo(null);
		setResizable(rigid);
		setTitle(titulo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LaminaAreaTexto());
		setVisible(true);
	}
}

//---Fin MarcoAreaTexto--------------------------------------------------------------

class LaminaAreaTexto extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private JTextArea areatext=new JTextArea(7,25);
	private JScrollPane contnScroll=new JScrollPane(areatext);
	private JButton test=new JButton("Enviar");
	
	//constructor
	public LaminaAreaTexto() {
		areatext.setLineWrap(true);
		test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(areatext.getText());
			}
		});
		add(contnScroll);
		add(test);
	}
}

//---Fin LaminaAreaTexto------------------------------------------------------------
/*
class EscuchaBoton implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		System.out.println(areatext.getText());
	}
}
}
*/

