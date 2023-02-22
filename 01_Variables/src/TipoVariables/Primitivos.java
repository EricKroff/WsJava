package TipoVariables;


public class Primitivos {
	public static void main(String[] args) {

		//ENTEROS
		
		//BYTE: ES EL ENTERO MAS PEQUEÑO QUE HAY EN JAVA. 1 BYTE REPRESENTAN 8 BITS.
		//EL MAXIMO VALOR QUE TIENE ES 127
		byte numeroByte = 100;
		System.out.println("numeroByte = " + numeroByte);
		//LA CONSTANTE BYTES NOS DICE CUANTOS BYTES CORRESPONDEN A UN BYTE
		System.out.println("que contiene una cantidad de bytes de = " + Byte.BYTES);
		//LA CONSTANTE SIZE NOS DICECUANTOS BITES CONTIENE UN BYTE
		System.out.println("que contiene una cantidad de BITES de = " + Byte.SIZE);
		//LA CONSTANTE MAX_VALUE NOS DICE EL VALOR MAXIMO DE UN BYTE
		System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
		//LA CONSTANTE MIN_VALUE NOS DICE EL VALOR MINIMO DE UN BYTE
		System.out.println("valor máximo de un byte: " + Byte.MIN_VALUE);
		
		//SHORT: EL SIGUIENTE EN TAMAÑO
		short numeroShort = 30000;
		System.out.println("numeroShort = " + numeroShort);
		//VALORES DE UN SHORT
		System.out.println("tipo short corresponde en byte a = " + Short.BYTES);
		System.out.println("tipo short corresponde en bites a = " + Short.SIZE);
		System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
		System.out.println("valor máximo de un short: " + Short.MIN_VALUE);
		
		//INTEGER MUCHA MAS GRANDE QUE LOS ANTERIORES
		int numeroInt = 38000;
		//VALORES DE UN INT
		System.out.println("tipo int corresponde en byte a = " + Integer.BYTES);
		System.out.println("tipo int corresponde en bites a = " + Integer.SIZE);
		System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
		System.out.println("valor máximo de un int: " + Integer.MIN_VALUE);
		
		//LONG: ES UN SUPER INT
		//EL LITERAL POR DEFECTO ES ENTERO ASI QUE HAY QUE PONERLE UNA L PARA CONVERTIRLO
		long numeroLong = 9223372036854775807L;
		System.out.println("numeroLong = " + numeroLong);
		//VALORES DE UN INT
		System.out.println("tipo long corresponde en byte a = " + Long.BYTES);
		System.out.println("tipo long corresponde en bites a = " + Long.SIZE);
		System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
		System.out.println("valor máximo de un long: " + Long.MIN_VALUE);
		
		//REALES
		
		//PUNTO FLOTANTE: ENTERO CON DECIMALES QUE ALCANZAN NUMERO MÁS ALTO
		//SI QUEREMOS ESPECIFICAR EL PUNTO DEBEMOS PONER UNA F PARA YA QUE POR DEFECTO LO ASIGNA A DOUBLE
		float realFloat = 210F;
		System.out.println("realFloat = " + realFloat);
		//VALORES DE UN FLOAT
		System.out.println("tipo float corresponde en byte a = " + Float.BYTES);
		System.out.println("tipo float corresponde en bites a = " + Float.SIZE);
		System.out.println("valor máximo de un float: " + Float.MAX_VALUE);
		System.out.println("valor máximo de un float: " + Float.MIN_VALUE);
		
		
		//DOUBLE: COMO FLOAT PERO MAS GRANDE
		double realDouble = 3.402823;
		//VALORES DE UN FLOAT
		System.out.println("tipo double corresponde en byte a = " + Double.BYTES);
		System.out.println("tipo double corresponde en bites a = " + Double.SIZE);
		System.out.println("valor máximo de un double: " + Double.MAX_VALUE);
		System.out.println("valor máximo de un double: " + Double.MIN_VALUE);
		
		
		//CARACTER
		char caracter = 'A';
		System.out.println("caracter = " + caracter);
		//VALORES DE UN FLOAT
		System.out.println("tipo char corresponde en byte a = " + Character.BYTES);
		System.out.println("tipo char corresponde en bites a = " + Character.SIZE);
		System.out.println("valor máximo de un char: " + Character.MAX_VALUE);
		System.out.println("valor máximo de un char: " + Character.MIN_VALUE);
		
		
		// BOOLEAN: VARIABLES QUE DEVUELVEN COMO RESULTADO TRUE O FALSE
		
		boolean datoLogico = true;
		System.out.println("datoLogico =  " + datoLogico);
	}
	
	
}
