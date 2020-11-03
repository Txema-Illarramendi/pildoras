package pildoras.entornografico;

import java.awt.*;

import javax.swing.JFrame;

public class Ventanas {

	public static void main(String[] args) {

	//La primera la coloco en la esquina superior izqierda mediante las cordenadas xy 0,0
	misVentanas ventana1=new misVentanas(0, 0, 700, 300, "Ventana 1", true);
	//La segunda va al centro mediante la llamada a otro constructor que por defecto la pone ahí
	misVentanas ventana2=new misVentanas(700, 300, "Ventana 2", true);
	//La tercera en la esquina inferior derecha restando a la resolución de mi monitor el tamaño de la ventana
	misVentanas ventana3=new misVentanas(1220, 780, 700, 300, "Ventana 3", true);
	
	}

}

class misVentanas extends JFrame{

	Toolkit miSistema=Toolkit.getDefaultToolkit();
	Image miIcono=miSistema.getImage("uno.png");
	
	public misVentanas(int vertical, int horizontal, int ancho, int alto, String titulo, boolean visible) {
		this.setBounds(vertical, horizontal, ancho, alto);
		this.setDefaultCloseOperation(3);
		this.setTitle(titulo);
		setIconImage(miIcono);
		this.setVisible(visible);
	}
	
	public misVentanas(int alto, int ancho, String titulo, boolean visible) {
		this.setLocationRelativeTo(null);
		this.setTitle(titulo);
		this.setSize(alto, ancho);
		this.setDefaultCloseOperation(3);
		setIconImage(miIcono);
		this.setVisible(visible);
	}
	
}