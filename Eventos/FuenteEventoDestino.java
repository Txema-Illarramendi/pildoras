package Eventos;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FuenteEventoDestino {

	public static void main(String[] args) {
		
		marcoVentana ventana=new marcoVentana();

	}

}

class marcoVentana extends JFrame{
	
	public marcoVentana() {
		setSize(800, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Txema Software");
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image icono=sistema.getImage("images/uno.png");
		setIconImage(icono);
		setDefaultCloseOperation(marcoVentana.EXIT_ON_CLOSE);
		setVisible(true);
		laminaUno lamina_1=new laminaUno();
		add(lamina_1);
	}
	
}

class laminaUno extends JPanel implements ActionListener{

	JButton boton1=new JButton("Azul");
	JButton boton2=new JButton("Rojo");
	JButton boton3=new JButton("Verde");
	
	public laminaUno() {
		add(boton1);
		add(boton2);
		add(boton3);
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==boton1) setBackground(Color.BLUE);
		if(e.getSource()==boton2) setBackground(Color.RED);
		if(e.getSource()==boton3) setBackground(Color.GREEN);
		
	}
}



