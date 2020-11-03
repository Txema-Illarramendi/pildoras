package pildoras.entornografico;

import java.awt.*;
import javax.swing.*;

public class DrawInIframe {

	public static void main(String[] args) {

	NuevaVentana win1=new NuevaVentana(300,300,800,450, "Txema Gestión");
	
	}

}

class NuevaVentana extends JFrame{
	
	Toolkit param=Toolkit.getDefaultToolkit();
	Image icono1=param.getImage("uno.png");
	
	public NuevaVentana(int x, int y, int ancho, int alto, String titulo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x,y,ancho,alto);
		setTitle(titulo);
		setIconImage(icono1);
		laminaDraw miLamina=new laminaDraw();
		add(miLamina);
		setVisible(true);
	}
}

class laminaDraw extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(20, 20, 125, 75);
	}
	
}