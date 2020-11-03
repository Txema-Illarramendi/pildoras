package Eventos;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class TipografiaWdws {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		BaseVentn vntn = new BaseVentn();

	}
}

class BaseVentn extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private Image img;
	private File[] imagen=new File[10];
	private String[] imagenes=new String[10];
	private JButton[] botones=new JButton[10];
	

	
	public BaseVentn() {
		
		for(int e=0; e<10; e++) {
			if(e==0)botones[e]=new JButton("CPU");
			if(e==1)botones[e]=new JButton("GPU");
			if(e==2)botones[e]=new JButton("PLACA BASE");
			if(e==3)botones[e]=new JButton("RAM");
			if(e==4)botones[e]=new JButton("SISTEMA");
			if(e==5)botones[e]=new JButton("CPU");
			if(e==6)botones[e]=new JButton("CPU");
			if(e==7)botones[e]=new JButton("CPU");
			if(e==8)botones[e]=new JButton("CPU");
			if(e==9)botones[e]=new JButton("CPU");
			botones[e].addActionListener(this);
		}
		
		setSize(800, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Txema Software");
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image icono=sistema.getImage("images/uno.png");
		setIconImage(icono);
		setDefaultCloseOperation(BaseVentn.EXIT_ON_CLOSE);
		
		add(new JPanel() {
			private static final long serialVersionUID = 1L;
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				try {
					for(int i=0; i<5; i++) {
						imagenes[i]="images/" + (i+1) + ".png";
						imagen[i]=(new File(imagenes[i]));
						img=ImageIO.read(imagen[i]);
						g.drawImage(img, 30+(150*i), 80, 120, 120, null);
						botones[i].setBounds(30+(150*i), 210, 120, 30);
						add(botones[i]);
					}
					for(int h=5; h<10; h++) {
						imagenes[h]="images/" + (h+1) + ".png";
						imagen[h]=(new File(imagenes[h]));
						img=ImageIO.read(imagen[h]);
						g.drawImage(img, 30+(150*(h-5)), 270, 120, 120, null);
						botones[h].setBounds(30+(150*(h-5)), 400, 120, 30);
						add(botones[h]);
						}
				
				} catch (IOException e) {
					System.out.println("El programa no es capaz de ubicar la imagen solicitada");
				}
				g.setFont(new Font("Maiandra GD", Font.BOLD, 25));
				g.drawString("Selecciona una opción", 30, 40);
				g.drawRect(10, 60, 765, 390);
			}
		});
	
		setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		Object bot=e.getSource();
		if(bot==botones[0]) {
			System.out.println("Has clicado en CPU");
			this.setVisible(false);
		}
	}
}





	
