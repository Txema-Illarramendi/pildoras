package pildoras.herencia;


public class Comisionista extends Empleado{
	
	//Paramentros
	private int clientes;
	private double comision;
	private double sueldo=950;
	
	//Constructor
	protected Comisionista(String dni, String nombre, String apellidos, int alta, int clientes, double comision) {
		super(dni, nombre, apellidos, alta);
		this.clientes=clientes;
		this.comision=comision;
	}

	//Getters
	protected double getSalario() {
		if(clientes*comision>=950) {
			sueldo=+(clientes*comision);
		}
		return sueldo;
	}
	
	protected void imprimir() {
		super.imprimir();
		System.out.printf("Salario: %.2f\n\n", getSalario());		
	}

}
