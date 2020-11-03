package pildoras.entornografico;

import java.awt.*;
import javax.swing.*;

public class VentanaCentrada {

	public static void main(String[] args) {
		
		Dimension peke = new Dimension();
		peke.setSize(400, 170);
		int peke_w = (int)peke.getWidth();
		int peke_h = (int)peke.getHeight();

		Dimension mediana = new Dimension();
		mediana.setSize(650, 300);
		int med_w = (int)mediana.getWidth();
		int med_h = (int)mediana.getHeight();
		
		
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int h = (int)screenSize.getHeight();
		int w = (int)screenSize.getWidth();
		
		JFrame wdws = new JFrame();
		wdws.setSize(mediana);
		wdws.setLocation( ((w/2)-(med_w/2)), ((h/2)-(med_h/2)) );
		wdws.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wdws.setVisible(true);

	}

}
