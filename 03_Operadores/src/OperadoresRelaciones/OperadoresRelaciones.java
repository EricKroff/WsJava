package OperadoresRelaciones;

public class OperadoresRelaciones {

	public static void main(String[] args) {
		
		int i = 3;
		byte j = 7;
		float k = 1127e-7f;
		double l = 2.1413e3;
		boolean m = false;
		
		// ESTE OPERADOR (==) SOLO FUNCIONA CON VALORES PRIMITIVOS Y LITERALES. SI QUEREMOS COMPARAR VALORES DE OBJETOS TENEMOS QUE USAR EQUALS
		// RECUERDA QUE TAMBIEN TENEMOS LOS OPERADORES RELACIONES DE: <, >, =>, <=
		boolean b1 = i == j;
		System.out.println(b1);
		
		// USAMOS ! PARA INVERTIR EL VALOR Y CONVERTIMOS EN UN "DISTINTO". TAMBIEN PUEDE IR EN EL IGUAL.
		boolean b2 = !b1;
		System.out.println(b2);
		
		// TAMBIEN PODEMOS COMPARAR VALORES BOOLEANOS
		
	}

}
