package pildoras.poo;

public class AbreCuentas {

	//Propiedades de la clase
	private int saldo;
	private String nombre;
	private long numCuenta;
	
	
	//constructor/es
	public AbreCuentas(String nombre, int saldo) {
		this.nombre=nombre;
		this.numCuenta=(int)(Math.random()*54321);
		this.saldo=saldo;
	}
	
	
	//Getters
	public int getSaldo() {
		return saldo;
	}
	
	public long getNumCuenta() {
		return numCuenta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getInfoCuenta() {
		return "Nombre del titular: " + nombre + "\n" + "Número de cuenta: " + numCuenta + "\n" + "Saldo: " + saldo + "€";
	}
	
	
	//Setters
	public void setSaldo(int saldo) {
		this.saldo=saldo;
	}
	
	public void setIngreso(int ingreso) {
		saldo=saldo+ingreso;
	}
	
	public void setReintegro(int reintegro) {
		saldo=saldo-reintegro;
	}

}
