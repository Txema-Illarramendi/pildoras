package pildoras.poo;

public class Vehiculos {
	
	//Propiedades de clase
	private short ruedas;
	private String color;
	private double peso;
	private double largo;
	private double ancho;
	private double alto;
	private String combustible;
	private boolean climatizador;
	private boolean cuero;
	private boolean gps;
	
	//Constructor
	public Vehiculos() {
		
		ruedas=4;
		color="blanco";
		peso=2.300;
		largo=4.15;
		ancho=2.1;
		alto=1.60;
		combustible="diesel";
		
	}
	
	//Getters
	public short getRuedas() {
		return ruedas;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPeso() {
		return peso;
	}
	
	//Setters
	public void setColor(String t) {
		color=t;
	}
	

}
