package Herencia;

public class EjemploHerencia {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.setNombre("Eric");
		alumno.setApellido("Kroff");
		
		Profesor profesor = new Profesor();
		profesor.setNombre("Pepe");
		profesor.setApellido("Fraguas");
		profesor.setAsignatura("Matemáticas");
		
		System.out.println(alumno.getNombre() + " " + alumno.getApellido());
		System.out.println(profesor.getNombre() + " " + profesor.getApellido() + " " + profesor.getAsignatura());
		
	}
}
