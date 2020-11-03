package WorkingWithWindows;

import java.awt.*;
import javax.swing.*;

public class DibujandoVentana {

	public static void main(String[] args) {

		vntnBase ventana1=new vntnBase(700,400,3,"Txema Software");

	}

}

class vntnBase extends JFrame{
	
	//propiedades de clase
	private int ancho=600;
	private int alto=350;
	private int cerrar=3;
	private boolean visible=true;
	private String titulo="";
	
	
	//constructores
	public vntnBase() {
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setVisible(visible);
		setDefaultCloseOperation(cerrar);
	}
	public vntnBase(int ancho, int alto, int cerrar, String titulo) {
		setSize(this.ancho=ancho, this.alto=alto);
		setLocationRelativeTo(null);
		setVisible(visible);
		setTitle(this.titulo=titulo);
		setDefaultCloseOperation(this.cerrar=cerrar);
	}
}

class lamina1 extends JPanel{
	public void paintComponent(Graphics g) {
		
	}
}





