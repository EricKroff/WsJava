package ValidarString;

public class EjemploValidarString {

	public static void main(String[] args) {
		
		//LLAMAMOS VALIDAR A CONFIRMAR QUE UN OBJETO NO ES NULLO
		String curso = null;
		boolean esNulo = curso == null;
		
		System.out.println("esNulo = " + esNulo);

		
		//CREAMOS UNA ESTRUCTURA FOR PARA VALIDAR SI ES NULL LA VARIABLE
		if (esNulo == false) {
			System.out.println(curso.toUpperCase());
			
		}
		
		//EN ESTE EJEMPLO PODEMOS VER QUE CURSO ES NULL POR LO QUE DEJA DE TRABAJA EL PROGRAMA
		//CON ESTO PODEMOS VER QUE EL METODO CONCAT SOLO LO USAMOS CUANDO SABEMOS QUE EL OBJETO NUNCA DEVUELVE NULL (COMENTAR ESTA PARTE PARA PROBAR EL EJEMPLO
		System.out.println(curso.concat("Bienvenido al curso ".concat(curso)));
		
		//AQUI VEMOS QUE NO DA ERROR USANDO +
		System.out.println("Bienvenido al curso "+ curso);
		
		
		//TENEMOS QUE TENER EN CUENTA QUE NULL NO ES LO MISMO QUE "" (OBJETO VACIO)
		//SI QUISIERAMOS VALIDAR QUE EL OBJETO ESTÁ VACIO LO HACEMOS DE LA SIGUIENTE FORMA:
		boolean esVacio = curso.length() == 0;
		
		if (esVacio = false) {
			System.out.println(curso.toUpperCase());
			System.out.println("Bienvenido al curso " .concat(curso));
		}
		//TAMBIEN PODEMOS USAR EL METODO ISEMPTY DE STRING. HACE LO MISMO DE FORMA MAS RAPIDA.
		//PODEMOS USAR EL METODO ISBLANK PARA SABER SI EL OBJETO NO ES NULL PERO VIENE VACIO
		
	
	
	
	}

}

