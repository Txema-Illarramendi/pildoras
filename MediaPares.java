import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
	
	int[] numeros=new int[10];
	int numVal=0;
	int sumVal=0;
	
	System.out.println("Introduce diez números");
	Scanner entry = new Scanner(System.in);
	
	for(int i=0;i<10;i++) {
		numeros[i]=entry.nextInt();
		if(i % 2 == 0 && i != 0) {
			numVal++;
			sumVal=sumVal+numeros[i];
		}	
	}
	
	double media=sumVal/numVal;
	
	System.out.println("la media de los valores de las posiciones pares del array es: " + media);
	entry.close();
	}

}
