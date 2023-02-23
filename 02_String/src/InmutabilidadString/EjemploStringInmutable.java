package InmutabilidadString;

public class EjemploStringInmutable {
	public static void main(String[] args) {
		
		String curso = "Programación Java";
		String profesor = "Andres";
		
		
		//EN ESTE EJEMPLO PODEMOS VER QUE SI NO CREAMOS EL OBJETO, AL IMPRIMIR, SIGUE APARECIENDO SIN EL CAMBIO. ES POR ESO QUE TENEMOS QUE CREAR OTRO OBJETO CON EL CAMBIO.
		String resultado = curso.concat(" " + profesor);
		System.out.println(resultado);
		
		
		
	}
}
