package MetodosImportantesString;

public class MetodosImportantes {

	public static void main(String[] args) {
		
		String nombre = "eric";
		
		//PARA VER LA LONGITUD DE UN STRING
		System.out.println("nombre.length() = " + nombre.length());
		//CONVERTIR A MAYUSCULAS
		System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
		//CONVERTIR A MINUSCULAS
		System.out.println("nombre.toLoweCase() = " + nombre.toLowerCase());
		//COMPARAR VALORES
		System.out.println("nombre.equals(pasamos parametros) = " + nombre.equals("pepe") );
		//COMPARAR VALORES IGNORANDO MAYUSCULAS Y MINUSCULAS
		System.out.println("nombre.equalsIgnoreCase(pasando parametros) = " + nombre.equalsIgnoreCase("ErIc"));
		//CONVIERTE EL STRING EN CARACTERES PARA TRABAJAR CON ELLOS.
		//DE ESTA FORMA DEVOLVEMOS LA POSICION 0 DE "ERIC"
		System.out.println("nombre.charAt(param) = " + nombre.charAt(0));
		//DEVOLVER LA ULTIMA LETRA SIN SABER CUANTOS HAY. AQUI PASAMOS EL PARAMETRO DE LENGTH -1 YA QUE LENGTH MANDA EL TOTAL DE LETRAS (4) Y MENOS -1 PORQUE CHARTAT CUANTA APARTIR DE CERO.
		System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
		//OBTENER PARTE DE UN STRING: EN ESTE CASO "APARTIR DE (POSICION). ESTE METODO TAMBIEN PUEDE RECIBIR DOS ARGUNMENTOS (DESDE, HASTA) - SEGUNDO EJEMPLO. OJO! LA ULTIMA POSICION NO SE INCLUYE (ES HASTA NO INCLUSIVE).
		//EN EL ULTIMO EJEMPLO DE SUBSTRING PODEMOS OBJTENER LOS ULTIMAS DOS LETRAS SIN SABER CUANTAS HAY CON LENGTH.
		System.out.println("nombre.substring(1) = " + nombre.substring(1));
		System.out.println("nombre.substring(DESDE, HASTA) = " + nombre.substring(1, 3));
		System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
		
		//EXISTE UN METODO QUE SE LLAMA COMPARETO QUE ORDENA DE FORMA LEXICOGRÁFICA. PERO EL MAS UTILIZADO ES EL METODO EQUALS
	}

}
