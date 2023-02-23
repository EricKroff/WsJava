package ConversionDeTipos;

public class ConversionDeTipos {
	public static void main(String[] args) {
	//CONVERTIR PRIMITIVOS A STRING Y VICEVERSA
	
	//CREAMOS UNA VARIABLE STRING
	String numeroStr = "50";
	
	//LA CONVERTIRMOS
	int numeroInt = Integer.parseInt(numeroStr);
	System.out.println("numeroInt = " + numeroInt);
	
	//MISMO EJEMPLO CON DOUBLE
	String realStr = "98765.41";
	double realDouble = Double.parseDouble(realStr);
	System.out.println("realDouble = " + realDouble);
	
	//MISMO EJEMPLO CON BOOLEAN
	String logicoStr = "False";
	boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
	System.out.println("logicoBoolean = " + logicoBoolean);
	
	
	//MISMO EJEMPLO PERO DEL REVES
	int otroNumeroInt = 100;
	System.out.println("otroNumero = " + otroNumeroInt);
	String otroNumeroStr = Integer.toString(otroNumeroInt);
	System.out.println("otroNumeroStr = " + otroNumeroStr);
	
	//OTRA FORMA DE HACERLO. LO MISMO PARA EL RESTO DE TIPOS DE VARIABLES.
	otroNumeroStr = String.valueOf(otroNumeroInt);
	System.out.println("otroNumeroStr = " + otroNumeroInt);
	
	//CONVERSION DE PRIMITIVOS A PRIMITIVOS
	
	int numInt = 10000;
	short numShort = (short) numInt;
	System.out.println("numero short = " + numShort);
	
	
	
	
	}
}

