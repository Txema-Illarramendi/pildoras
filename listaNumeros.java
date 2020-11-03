import java.util.*;

public class listaNumeros {

	public static void main(String[] args) {
		
	int positivos=0;
	int negativos=0;
	int ceros=0;
	int vuelta=0;
	
	System.out.println("Introduce 10 números.");
	Scanner entrada=new Scanner(System.in);
	
	int numeros[]=new int[10];
	
	for(int i=0;i<10;i++) {
		numeros[i]=entrada.nextInt();
		if(i==9) {
			System.out.println("De acuerdo, estos son los números que has introducido...");
		}
	}
	
	entrada.close();

	for(int lista:numeros) {
		vuelta++;
		System.out.print("En la posición " + vuelta + " el número: " + lista);
		if(lista<0) {
			negativos++;
			System.out.println(" (negativo)");
		}else if(lista>0){
			positivos++;
			System.out.println(" (positivo)");
		}else{
			ceros++;
			System.out.println(" (Cero)");
		}
	}
	System.out.println("positivos: " + positivos);
	System.out.println("negativos: " + negativos);
	System.out.println("ceros: " + ceros);
	}

}
