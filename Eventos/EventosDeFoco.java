package Eventos;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class EventosDeFoco {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MrcVentn ventana=new MrcVentn(true);
	}
}

//----------------------------------------------------------

class MrcVentn extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private Lamina1 lmnUno = new Lamina1();
	private int ancho=800;
	private int alto=500;
	private String titulo="Txema Software";
	private String icnVtn="images/uno.png";
	private Image icono;


	//Constructor
	public MrcVentn(Boolean v) {
		setSize(ancho, alto);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle(titulo);
		Toolkit sistema = Toolkit.getDefaultToolkit();
		icono=sistema.getImage(icnVtn);
		setIconImage(icono);
		setDefaultCloseOperation(MrcVentn.EXIT_ON_CLOSE);
		add(lmnUno);
		setVisible(v);
	}
}

//----------------------------------------------------------

class Lamina1 extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private JTextField inputText1= new JTextField();
	private JTextField inputText2= new JTextField();
	private JLabel textUser = new JLabel("Usuario");
	private JLabel textMail = new JLabel("Email");
	
	//Constructor
	public Lamina1() {
		FocoEvent foco=new FocoEvent();
		inputText1.addFocusListener(foco);
		inputText2.addFocusListener(foco);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		inputText1.setBounds(200, 50, 150, 20);
		inputText2.setBounds(200, 80, 150, 20);
		textUser.setBounds(120, 50, 150, 20);
		textMail.setBounds(120, 80, 150, 20);
		add(textUser);
		add(textMail);
		add(inputText2);
		add(inputText1);
	}
//}

//-----------------------------------------------------------

class FocoEvent implements FocusListener{

	private int letra;
	
	public void focusGained(FocusEvent e) {
	}

	public void focusLost(FocusEvent e) {
		if(e.getSource()==inputText1) {
			JOptionPane.showInputDialog("El campo Nombre no puede quedar vacio");
		}else if(e.getSource()==inputText2) {
			String textUser = inputText2.getText();
			int caracteres=textUser.length();
			for(int i=0; i<caracteres; i++) {
				letra=textUser.indexOf("@");
				System.out.println(letra);
			}
			if(caracteres<3 || letra==(-1)){
				JOptionPane.showInputDialog("Introduce una dirección de correo valida");
			}
		}
	}
}
}

