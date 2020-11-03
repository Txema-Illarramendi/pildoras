package pildoras.poo;

public class GestionCuentas {

	public static void main(String[] args) {

	AbreCuentas cuenta1=new AbreCuentas("Alvaro", 1000);
	AbreCuentas cuenta2=new AbreCuentas("Marco", 1000);
	
	transferencia(cuenta1, 200, cuenta2);
	transferencia(cuenta2, 500, cuenta1);
	
	}
	

	public static void transferencia(AbreCuentas ccOrigen, int importe, AbreCuentas ccDestino) {
		ccOrigen.setSaldo(ccOrigen.getSaldo()-importe);
		ccDestino.setSaldo(ccDestino.getSaldo()+importe);
		System.out.println("DETALLE DE LA TRANSFERENCIA");
		System.out.println("Importe: " + importe + "€");
		System.out.println("Emisor:");
		System.out.println(ccOrigen.getInfoCuenta());
		System.out.println("...................................");
		System.out.println("Receptor:");
		System.out.println(ccDestino.getInfoCuenta());
		System.out.println("...................................");
	}

}
