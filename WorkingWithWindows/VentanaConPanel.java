package WorkingWithWindows;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class VentanaConPanel {

	public static void main(String[] args) {

		panel_1 ventana = new panel_1(800,500,"Txema Software");

	}

}

class panel_1 extends JFrame{
	
	//propiedades de clase
	private int alto=500;
	private int ancho=800;
	private int cerrar=3;
	private boolean ver=true;
	
	
	//constructores
	public panel_1() {
		setSize(ancho, alto);
		setDefaultCloseOperation(cerrar);
		setVisible(ver);
	}
	
	public panel_1(int ancho, int alto, String title) {
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(cerrar);
		setTitle(title);
		lamina_1 panel1=new lamina_1();
		//Lo siguiente puede ir aqui o en el constructor de la lamina
		panel1.setBackground(new Color(230,240,255));
		add(panel1);
		setVisible(ver);
	}
	
}

class lamina_1 extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		Color azul=Color.BLUE; //<--Esta es una posibilidad si no quieres afinar demasiado el color y te vale uno de los ya definido en las constantes de clase
		Color rojo=new Color(255,000,000);
		g2.setPaint(azul);
		Font verdana=new Font("Verdana", Font.BOLD, 30);
		g.setFont(verdana);
		g.drawString("Trabajando con páneles", 20, 40);
		Rectangle2D rectangulo=new Rectangle2D.Double(10, 60, 765, 390);
		BasicStroke trazo=new BasicStroke(5);
		g2.setStroke(trazo);
		g2.draw(rectangulo);
	}
	
}









