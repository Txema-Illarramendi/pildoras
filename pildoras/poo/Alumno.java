package pildoras.poo;

public class Alumno {
	
	//Propiedades de clase
	private Colegio nombreColegio;
	private String nombreAlumno;
	private double nota;
	private static int numeroAlumno=1;
	private int nAlumno;
	
	//Constructor
	public Alumno(Colegio nombreColegio, String nombreAlumno, double nota) {
		this.nombreColegio=nombreColegio;
		this.nombreAlumno=nombreAlumno;
		this.nota=nota;
		nAlumno=numeroAlumno;
		numeroAlumno++;
		
	}
	
	//Setters
	public void setNota(double nota) {
		this.nota=nota;
	}
	
	//Getters
	private String getNombreColegioAlumno() {
		return this.nombreColegio.getNombreCole()	;
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	
	
	
	public String toString() {
		return "Nombre alunmo: " + nombreAlumno +"\nColegio: " +
	this.getNombreColegioAlumno() + "\nNº alumno: " + nAlumno +
	"\nNota media: " + nota;
	}
}
