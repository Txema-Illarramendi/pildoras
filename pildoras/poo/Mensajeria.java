package pildoras.poo;

import java.util.Scanner;

public class Mensajeria {
	
	static int prioridad;
	static String origen;
	static String destino;

public static void main(String[] args) {
		
	Paquete box1=new Paquete(2.5f);
	
	System.out.println("Introduce la localidad de origen");
	Scanner teclado=new Scanner(System.in);
	origen=teclado.next();
	
	System.out.println("Introduce la localidad de destino");
	destino=teclado.next();

	System.out.println("Introduce la prioridad de entrega");
	prioridad=teclado.nextInt();
	

	Envio send1=new Envio(origen, destino, prioridad, box1);
	
	System.out.println(send1.getInfo());
	
	
	teclado.close();
	
}


}
