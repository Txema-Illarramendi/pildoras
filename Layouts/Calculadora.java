package Layouts;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class Calculadora {
	public static void main(String[] args) {
		new CuerpoVntnCalc();
	}
}

//---Claculadora------------------------------------------------------

class CuerpoVntnCalc extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private int ancho = 350;
	private int alto = 500;
	private int cerrar = 3;
	private boolean rigid = false;
	private boolean visible =true;
	private String titulo = "Calculadora";
	
	//Constructor
	public CuerpoVntnCalc() {
		setSize(ancho,alto);
		setResizable(rigid);
		setTitle(titulo);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(cerrar);
		add(new LmnCalc1());
		setVisible(visible);
	}
}

//---CuerpoVntnCalc---------------------------------------------------

class LmnCalc1 extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//Propiedades de clase
	private String simbMat;
	private double operador;
	private double resultado;
	private JPanel numeracion=new JPanel();
	private JLabel pantalla=new JLabel(" 0");
	private TipoOperacion operacion=new TipoOperacion();
	private TeclaIgual igual=new TeclaIgual();
	private TeclaComa coma=new TeclaComa();
	private boolean inicio;
	private int multicont=0;
	private int divicont=0;
	private int resticont=0;
	private int porcentcont=0;
	private Dimension pa=new Dimension(350, 100);
	private String[] simbls={"C", "CE", "%", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ",", "="};
	private Color gris=new Color(220, 220, 220);
	private Font verdana=new Font("Verdana", Font.BOLD, 30);
	private Font tahoma=new Font("Tahoma", Font.PLAIN, 20);
	
	
	//Constructor
	public LmnCalc1() {
		inicio=true;
		pantalla.setFont(verdana);
		setLayout(new BorderLayout());
		pantalla.setPreferredSize(pa);
		add(pantalla, BorderLayout.NORTH);
		numeracion.setLayout(new GridLayout(5,4,5,5));
		InsrtNumer in = new InsrtNumer();
		for(String i: simbls) {
			if(i==simbls[0] || i==simbls[1] || i==simbls[2] || i==simbls[3] || i==simbls[7] || i==simbls[11] || i==simbls[15] || i==simbls[16]) {
				asignaSimbolos(i,operacion);
			}else if(i==simbls[19]){
				creaTeclaIgual(i, igual);
			}else if(i==simbls[18]){
				creaTeclaComa(i, coma);
			}else {
				creaBotones(i,in);
			}
		}
		add(numeracion, BorderLayout.CENTER);
	}
	
	//Setters
	private void creaBotones(String tx, InsrtNumer n) {
		
		JButton boton = new JButton(tx);
		boton.addActionListener(n);
		boton.setFont(verdana);
		numeracion.add(boton);
	}
	
	private void asignaSimbolos (String tt, TipoOperacion s) {
		
		JButton boton = new JButton(tt);
		boton.addActionListener(s);
		boton.setFont(tahoma);
		boton.setBackground(gris);
		numeracion.add(boton);
	}
	
	private void creaTeclaIgual (String tl, TeclaIgual i) {
		
		JButton boton = new JButton(tl);
		boton.addActionListener(i);
		boton.setFont(tahoma);
		boton.setBackground(gris);
		numeracion.add(boton);
	}
	
	private void creaTeclaComa (String tc, TeclaComa c) {
		
		JButton boton = new JButton(tc);
		boton.addActionListener(c);
		boton.setFont(tahoma);
		boton.setBackground(gris);
		numeracion.add(boton);
	}
	
	//Getters
	private String sinCeros(double d) {
		DecimalFormat df=new DecimalFormat("#,##0.#;(-#,##0.#)");
		return(df.format(d));
	}
//}

//---LmnCalc1-----------------------------------------------

private class InsrtNumer implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		String entrada=e.getActionCommand();
		if(inicio) {
			if(entrada.equals("0")) {
				pantalla.setText(" " + entrada);
			}else {
				pantalla.setText(" " + entrada);
				inicio=false;
			}
		}else {
			pantalla.setText(pantalla.getText() + entrada);
		}
		operador=Double.parseDouble(pantalla.getText());
	}
}

//---InsrtNumer-----------------------------------------------

private class TipoOperacion implements ActionListener{

	public void actionPerformed(ActionEvent s) {
		String ope=s.getActionCommand();
		if(ope.equals("C")) {
			operador=0;
			resultado=0;
			simbMat="";
			inicio=true;
			multicont=0;
			divicont=0;
			resticont=0;
			porcentcont=0;
		}else if(ope.equals("+")) {
			simbMat="+";
			resultado+=operador;
		}else if(ope.equals("-")) {
			simbMat="-";
			double valor=Double.parseDouble(pantalla.getText());
			if(resticont==0) {
				resultado=valor;
				resticont++;
			}else {
				resultado-=operador;
			}				
		}else if(ope.equals("x")) {
			simbMat="x";
			double valor=Double.parseDouble(pantalla.getText());
			if(multicont==0) {
				resultado=valor;
				multicont++;
			}else {
				resultado*=operador;
			}
		}else if(ope.equals("/")) {
			simbMat="/";
			double valor=Double.parseDouble(pantalla.getText());
			if(divicont==0) {
				resultado=valor;
				divicont++;
			}else {
				resultado/=operador;
			}
		}else if(ope.equals("%")) {
			simbMat="%";
			double valor=Double.parseDouble(pantalla.getText());
			if(porcentcont==0) {
				resultado=valor;
				porcentcont++;
			}else {
				resultado*=operador/100;
			}
		}
		pantalla.setText(" " + sinCeros(resultado));
		inicio=true;
	}
}

//---TipoOperacion------------------------------------------

private class TeclaIgual implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		if(simbMat.equals("+")) {resultado+=operador;}
		if(simbMat.equals("-")) {resultado-=operador;}
		if(simbMat.equals("x")) {resultado*=operador;}
		if(simbMat.equals("/")) {resultado/=operador;}
		if(simbMat.equals("%")) {resultado*=operador/100;}
		pantalla.setText(" " + sinCeros(resultado));
		simbMat="";
		operador=0;
		multicont=0;
		divicont=0;
		resticont=0;
		porcentcont=0;
		inicio=true;
	}
}

//---

private class TeclaComa implements ActionListener{

	public void actionPerformed(ActionEvent c) {
		double valor=Double.parseDouble(pantalla.getText());
		resultado=valor;
		pantalla.setText(" " + sinCeros(resultado) + ".");
	}
}
}