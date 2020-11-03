package Layouts;

import java.awt.*;
import javax.swing.*;

public class UsoLayouts {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MaroConLayout miMarco=new MaroConLayout();
	}
}

//--------------------------------------------------------------------

class MaroConLayout extends JFrame{
	private static final long serialVersionUID = 1L;

	public MaroConLayout(){
		setTitle("Disposiciones");
		setBounds(600,350,600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new PanelconLayout(),BorderLayout.NORTH);
		add(new PanelLayout2(), BorderLayout.SOUTH);
		setVisible(true);
	}
}

//--------------------------------------------------------------------

class PanelconLayout extends JPanel{
	private static final long serialVersionUID = 1L;

	public PanelconLayout(){
		setLayout(new BorderLayout(20,20));
		add(new JButton("Rojo"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Naranja"), BorderLayout.CENTER);	
	}
}

//--------------------------------------------------------------------

class PanelLayout2 extends JPanel{
	private static final long serialVersionUID = 1L;

	public PanelLayout2() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(new JButton("Guardar"));
		add(new JButton("Cerrar"));
	}
}
