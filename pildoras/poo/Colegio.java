package pildoras.poo;

public class Colegio {
	
	//Parametros
	private String nombre;
	private Alumno arrayAlumnos[];
	private int posicionArray=0;
	
	//Constructor
	public Colegio(String nombre, int numAlumnos) {
		this.nombre=nombre;
		arrayAlumnos=new Alumno[numAlumnos];
	}

	//Getters
	public String getNombreCole() {
		return nombre;
	}
	
	private Alumno getAlumno(int nAlumno) {
		return arrayAlumnos[nAlumno];
	}
	
	public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
		Alumno nuevoAlumno=new Alumno(this, nombreAlumno, notaAlumno);
		arrayAlumnos[posicionArray]=nuevoAlumno;
		posicionArray++;
	}
	
}
