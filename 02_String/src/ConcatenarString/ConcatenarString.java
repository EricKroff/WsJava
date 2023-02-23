package ConcatenarString;

public class ConcatenarString {

	public static void main(String[] args) {
		
		//PODEMOS CONCATENAR DIFERENTES STRING DE LA SIGUIENTE FORMA
		String curso = "Programación Java";
		String profesor = "Andres";
		String detalle = curso + " con el instructor " + profesor;
		
		System.out.println(detalle);
		
		int numeroA = 10;
		int numeroB = 5;
		
		//EJEMPLO INTERESANTE: SI LO PRIMERO QUE ENCUENTRA EN EL SYSO ES STRING, AUNTIMÁTICAMENTE INTERPRETA QUE LO QUE LE SIGUE TAMBIÉN ES UN STRING. AUN SI PONEMOS NUMEROS INTEROS.
		//POR ESO EL RESULTADO ES 105 Y NO 15. A NO SER QUE PONGAMOS "()"
		System.out.println(detalle + numeroA+ numeroB);
		
		//EN EL SIGUIENTE EJEMPLO PASA LO CONTRARIO PERO CON INT
		System.out.println(numeroA + numeroB + detalle);
		
		//EN ESTE EJEMPLO USAMOS EL METODO CONCAT PARA CONCATENAR PASANDOLE PARAMETROS
		//RECUERDA QUE CUALQUIER CABIO EN UN STRING GENERA OTRO STRING YA QUE SON INMUTABLES.
		String detalle2 = curso.concat(" ".concat(profesor) + " ".concat(curso));
		System.out.println(detalle2);
		
		//TAMBIEN PODEMOS CONCATENAR CON LA CLASE STRINGBUILDER PERO ESTO LO VEMOS EN UN EJEMPLO DIFERENTE EN ESTE PAQUETE.
}
}