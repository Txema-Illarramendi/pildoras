package pildoras.poo;

public class CuentaCorriente {
	
	//Propiedades de clase
	private final String titular;
	private double saldo;
	private long num_cuenta;
	private static long sigNumCuenta=1000000000;
	private String cod_pais;
	private int entidad;
	private byte control1;
	private int oficina;
	private byte control2;
	
	//Constructor
	public CuentaCorriente(String titular, double saldo, int oficina) {
		this.titular=titular;
		this.saldo=saldo;
		cod_pais="ES";
		entidad=1036;
		control1=(byte)(Math.random()*99);
		control2=(byte)(Math.random()*99);
		this.oficina=oficina;
		num_cuenta=sigNumCuenta;
		sigNumCuenta++;
	}
	
	//Getters
	public String getIban() {
		return "IBAN " + cod_pais  + control1 + " " + entidad + " " + oficina + " " + control2 + num_cuenta;
	}
	
	public String getNombre() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getDatosCuenta() {
		return "**************************\n" + "Nombre del/la titular: " + titular + "\n" + getIban() + "\nSaldo actual: " + saldo + "\n**************************";
	}
	
	//Setters
	public void setIngreso(double importe) {
		saldo=saldo+importe;
	}
	
	public void setReintegro(double importe) {
		saldo=saldo-importe;
	}
	
	public static void setTransfer(CuentaCorriente origen, double importe, CuentaCorriente destino) {
		origen.setReintegro(importe);
		destino.setIngreso(importe);
		System.out.println(origen.getDatosCuenta());
		System.out.println(destino.getDatosCuenta());
	}

	
	//Metodo main
	public static void main(String[] args) {
	
	CuentaCorriente cuenta1=new CuentaCorriente("Paco Perez", 2516.35, 2637);
	CuentaCorriente cuenta2=new CuentaCorriente("Ana Martínez", 2623.52, 1369);
	
	System.out.println(cuenta1.getDatosCuenta());
	System.out.println(cuenta2.getDatosCuenta());
	
	setTransfer(cuenta1, 300, cuenta2);
	
	}

}
