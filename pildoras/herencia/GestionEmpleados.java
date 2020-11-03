package pildoras.herencia;

public class GestionEmpleados {

	public static void main(String[] args) {
	
	Empleado listCurritos[]=new Empleado[4];
	
	Asalariado asala1=new Asalariado("25498678X", "Juan", "López", 2001, 2100.15);
	Asalariado asala2=new Asalariado("41798206W", "Egoitz", "García", 2015, 2050.50);
	Comisionista comis1=new Comisionista("36987541L", "Aintzane", "Teietxea", 2011, 135, 20.75);	
	Comisionista comis2=new Comisionista("47852136A", "Ramón", "Lertxundi", 2018, 150, 15.20);
	
	listCurritos[0]=asala1;
	listCurritos[1]=asala2;
	listCurritos[2]=comis1;
	listCurritos[3]=comis2;
	
	mayorSueldo(listCurritos);
	listarPlantilla(listCurritos);

	}
	
	protected static void mayorSueldo(Empleado listCurritos[]) {
		int menda=0;
		double masPasta=0;
		for(int i=0; i<listCurritos.length; i++) {
			if(listCurritos[i].getSalario()>masPasta) {
				menda=i;
				masPasta=listCurritos[i].getSalario();
				
			}
		}
		System.out.println("El empleado con el mayor salario es: " + listCurritos[menda].getNombre() + "\ncon un sueldo de: " + masPasta);
		System.out.println("\n       * * *\n");
	}
	
	protected static void listarPlantilla(Empleado listCurritos[]) {
		for(Empleado i: listCurritos) {
			i.imprimir();
		}
	}
	
}
