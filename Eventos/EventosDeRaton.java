package Eventos;

import java.awt.Image;
import java.awt.Toolkit;
//import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class EventosDeRaton {

	public static void main(String[] args) {

		mrcoVentn ventanita=new mrcoVentn();

	}

}

class mrcoVentn extends JFrame{
	public mrcoVentn() {
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


/*Tambien puedo heredar de MouseAdapter en ved de implementar MouseListener y asi reescribir solo los metodos que necesite*/
class EventoRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}