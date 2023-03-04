package ArraysConClasePersona;

public class TestPersonaArrays {

	public static void main(String[] args) {
	
		// EN ESTE EJEMPLO VEMOS QUE SE PUEDE CREAR UN ARRAY CON PERSONAS(OBJETOS)
		Persona[] personas = 
			{new Persona ("eva", "gomez", "677677677"),
			 new Persona ("sara", "garcia", "688688688"),
			 new Persona ("pepe", "fraguas", "600600600"),		
			};

		// AQUI PODEMOS IMPRIMIR EL NOMBRE PASANDO LA POSICION Y OBTENIENDO CON EL GETTER.
		System.out.println(personas[1].getNombre());
		
		// AQUI RECORREMOS EL ARRAY DE TIPO CLASE "PERSONA" USANDO EL GETNOMBRE.
		// ES IMPORTANTE ACORDARSE DE INDICAR SIEMPRE EL TIPO DE DATO DEL ARRAY.
		for (Persona ele: personas) {
			System.out.println(ele.getNombre());
		}
		
	}
	
}
