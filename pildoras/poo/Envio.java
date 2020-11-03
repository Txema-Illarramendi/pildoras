package pildoras.poo;

public class Envio {
	
	//Parametros
	private int envio;
	private static int num_envio=1;
	private String origen;
	private String destino;
	private int precio;
	private int prioridad;
	private float pesoPak;
	private int idPak;
	
	//Constructor
	public Envio(String origen, String destino, int prioridad, Paquete box) {
		this.envio=num_envio;
		num_envio++;
		this.origen=origen;
		this.destino=destino;
		this.prioridad=prioridad;
		pesoPak=box.getPeso();
		idPak=box.getId_box();
		precio=10;
		if(box.getPeso()>1) {
			precio=precio+15;
		}
		if(prioridad==1) {
			precio=precio+10;
		}
		if(prioridad==2) {
			precio=precio+20;
		}
	}
	
	
	//Getters
	public int getEnvio() {
		return envio;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	
	public String getInfo() {
		return "****INFORMACIÓN DEL ENVIO****\n" + "Nº de envio: " + envio + "\nIdentificador del paquete: "
	+ idPak + "\nPeso del paquete: " + pesoPak + "\nLocalidad de origen: " + origen + "\nLocalidad de destino: " + destino
	+ "\nImporte del envio: " + precio +"€";
	}
}
