package OperadoresAritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		//OJO CON LOS SYSO QUE SI CONCATENAMOS STRING PRIMERO, VA A INTERPRETAR LA VARIABLES INT COMO STRING
		
		//SUMA
		int i = 5, j = 4, suma = i + j;	
		System.out.println("suma = " + suma);
		
		//RESTA
		int resta = i - j;
		System.out.println("resta = " + resta);
		
		//MULTIPLICACION
		int multiplicacion = i * j;
		System.out.println("Multiplicacion = " + multiplicacion);
		
		//DIVISION: AL SER INT REDONDEA. LO RECOMENDABLE EN LAS DIVISIONES ES QUE SEAN VARIABLES DE TIPO FLOTANTE / DOUBLE. (REUERDA QUE PUEDES HACER CASTING PARA ARREGLAR LOS DECIMALES)
		int division = i / j;
		System.out.println("Division = " + division);
		
		//MODULO
		int resto = i % j;
		System.out.println("Modulo = " + resto);
		
		//OPERADOR DE ASIGNACION: ES EL =
		//OPERADORES DE ASIGNACION COMPUESTOS +=: 
		//ESTO ES EXACTAMENTE IGUAL A I = I+2
		i += 2;

		// -=
		i -= 4;
		// *=
		i += 3;
		// /=
		i /= 2;
		
		//ESTOS OPERADORES TAMBIEN FUNCIONAN CON LOS STRING. POR EJEMPLO PARA UNA BUSQUEDA DE SQL EN UNA BASE DE DATOS.
		String sqlString = "select * from clientes as c";
		sqlString += " where c.nombre = 'Andres' ";
		sqlString += " and c.activo = 1 ";
		System.out.println("sqlString = " + sqlString);
		
	}

}
