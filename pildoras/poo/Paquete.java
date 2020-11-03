package pildoras.poo;

public class Paquete {
	
	//Propiedades de clase
	private float peso;
	private int id_box;
	private static int id=350;
	
	//Constructor
	public Paquete(float peso) {
		this.peso=peso;
		this.id_box=id;
		id++;
	}
	
	//Setters
	public void setPeso(float peso) {
		this.peso=peso;
	}
	
	//Getters
	public float getPeso() {
		return peso;
	}
	
	public int getId_box() {
		return id_box;
	}
}
