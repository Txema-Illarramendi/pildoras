package pildoras.herencia;


public abstract class Empleado {
	
	//Paramentros
	private String dni;
	private String nombre;
	private String apellidos;
	private int alta;
	
	//Constructor
	protected Empleado(String dni, String nombre, String apellidos, int alta) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.alta=alta;
	}
	//Getters
	protected abstract double getSalario();
	
	protected String getDni() {
		return dni;
	}
	
	protected String getNombre() {
		return nombre;
	}
	
	protected String getApellidos() {
		return apellidos;
	}
	
	protected int getAlta() {
		return alta;
	}
	
	//Setters
	protected void imprimir() {
		System.out.println("***FICHA DE DATOS DEL EMPLEADO***\n" + "DNI: " + dni + "\nNómbre: " + nombre + "\nApellidos: "
		+ apellidos + "\nFecha de alta: " + alta);	
	}
	
	protected void setDni(String dni) {
		this.dni=dni;
	}
	
	protected void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	protected void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	protected void setAlta(int alta) {
		this.alta=alta;
	}
	
	
}
