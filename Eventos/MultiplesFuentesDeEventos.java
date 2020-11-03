package Eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class MultiplesFuentesDeEventos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		vntnInicial vntn = new vntnInicial();
	}
}

//-----------------------------------------------------------

class vntnInicial extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private lmn1 lmna=new lmn1();
	private int ancho=800;
	private int alto=500;
	private boolean unresiz=(false);
	
	//Constructor
	public vntnInicial() {
		setSize(ancho,alto);
		setLocationRelativeTo(null);
		setResizable(unresiz);
		add(lmna);
		setDefaultCloseOperation(3);
		setVisible(true);
	}
}

//-----------------------------------------------------------

class lmn1 extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//Parametros de clase
	private objetoEvento objEventCntntColorAzul=new objetoEvento("Azul", Color.BLUE);
	private objetoEvento objEventCntntColorRojo=new objetoEvento("Rojo", Color.RED);
	private objetoEvento objEventCntntColorVerde=new objetoEvento("Verde", Color.GREEN);
	private InputMap entrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	private ActionMap mapaAccion=getActionMap();
	
	//Constructor
	public lmn1() {
		add(new JButton(objEventCntntColorAzul));
		add(new JButton(objEventCntntColorRojo));
		add(new JButton(objEventCntntColorVerde));
		entrada.put(KeyStroke.getKeyStroke("ctrl Y"), "Fondo azul");
		entrada.put(KeyStroke.getKeyStroke("ctrl K"), "Fondo rojo");
		entrada.put(KeyStroke.getKeyStroke("ctrl O"), "Fondo verde");
		mapaAccion.put("Fondo azul", objEventCntntColorAzul);
		mapaAccion.put("Fondo rojo", objEventCntntColorRojo);
		mapaAccion.put("Fondo verde", objEventCntntColorVerde);
	}
//}

//-----------------------------------------------------------

private class objetoEvento extends AbstractAction{
	private static final long serialVersionUID = 1L;

	//Constructor
	public objetoEvento(String nombre, Color color) {
		putValue(Action.NAME, nombre);
		putValue("steBtnStblecElColor", color);
		putValue(Action.SHORT_DESCRIPTION, "Establece el color " + nombre.toLowerCase() + " como color de fondo");
	}
	
	public void actionPerformed(ActionEvent e) {
		Color c=(Color)getValue("steBtnStblecElColor");
		setBackground(c);
		System.out.println("Nombre: " + getValue(Action.NAME));
		String d = (String) getValue(Action.SHORT_DESCRIPTION);
		System.out.println(d);
	}
}
}