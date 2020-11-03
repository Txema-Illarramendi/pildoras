package WorkingWithWindows;

import java.awt.*;
import javax.swing.*;


public class IconoVentana {

	public static void main(String[] args) {

		marcoVntn ventana=new marcoVntn();

	}

}

class marcoVntn extends JFrame{
	
	public marcoVntn() {
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image icono=sistema.getImage("images/uno.png");
		setIconImage(icono);
		setSize(800, 500);
		setLocationRelativeTo(null);
		setTitle("Txema Software");
		setDefaultCloseOperation(marcoVntn.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

