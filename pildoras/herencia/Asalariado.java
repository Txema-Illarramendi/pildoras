package pildoras.herencia;

import java.util.Calendar;

public class Asalariado extends Empleado{
	
	//Propiedades de clase
	private double sueldo_base;
	private double salario;
	
	//Constructor
	protected Asalariado(String dni, String nombre, String apellidos, int alta, double sueldo_base) {
		super(dni, nombre, apellidos, alta);
		this.sueldo_base=sueldo_base;
	}

	protected double getSalario() {
		Calendar ahora=Calendar.getInstance();
		int agnoActual=ahora.get(Calendar.YEAR);
		int antiguedad=agnoActual-getAlta();
		
		if(antiguedad<2) {
			salario=sueldo_base;
		}else if(antiguedad>=2 && antiguedad<=3) {
			salario=sueldo_base*1.07;
		}else if(antiguedad>=4 && antiguedad<=8) {
			salario=sueldo_base*1.11;
		}else if(antiguedad>=9 && antiguedad<=15) {
			salario=sueldo_base*1.17;
		}else{
			salario=sueldo_base*1.22;
		}
		return salario;
	}
	
	protected void imprimir() {
		super.imprimir();
		System.out.printf("Salario: %.2f\n\n", getSalario());		
	}
	
}
