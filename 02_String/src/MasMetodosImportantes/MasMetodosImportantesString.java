package MasMetodosImportantes;

public class MasMetodosImportantesString {

	public static void main(String[] args) {
		 //REEMPLAZAMOS UN CARACTER POR OTRO
		String trabalenguas = "trabalenguas";
		System.out.println("trabalenguas.replace (a,.) = " + trabalenguas.replace("a", "."));
		
		//PARA SABER SI UN STRING CONTIENE UN PARACTER O PALABRA
		//TAMBIEN PODMOS USAR EL METODO INDEXOF Y ESTE ADMITE CARACTER Y STRING
		System.out.println("trabalenguas.contains(t) = " + trabalenguas.contains("t"));
		
		//PARA VER SI COMIENZA CON
		System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));

		//PARA VER SI ACABA CON
		System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));
		
	}

}
