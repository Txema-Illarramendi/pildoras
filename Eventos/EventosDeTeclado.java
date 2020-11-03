package Eventos;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosDeTeclado {

	public static void main(String[] args) {

		marcoVentn vntan=new marcoVentn();
		vntan.addKeyListener(new EventoTeclado());

	}

}

class marcoVentn extends JFrame{
	public marcoVentn() {
		setSize(800, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Txema Software");
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image icono=sistema.getImage("images/uno.png");
		setIconImage(icono);
		setDefaultCloseOperation(3);
		setVisible(true);
	}
}

class EventoTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has pulsado una tecla");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Has mantenido una tecla");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Has soltado una tecla");
	}
	
}