package Arreglos;

public class Ejemplo01 {

	public static void main(String[] args) {
		
	
		//CREAMOS LA INSTANCIA DEL ARREGLO. DECLARAMOS EL TIPO DE DATO QUE CONTIENE E INDICAMOS QUE ES UN ARRAY CON LOS [] Y LE DAMOS UN NOMBRE CON LA CANTIDAD DE ELEMENTOS QUE VA A TENER.
		int[] numeros = new int [4];
	
		
		
		//ASIGNAMOS VALORES A LAS VARIABLES.
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
				
		//INICIALIZAMOS LAS VARIABLES QUE VAN A ESTAR EN EL ARRAY. INDICAMOS TIPO, QUE VAN A ESTAR EN EL ARRAY "NUMEROS" Y LA POSICION QUE VAN A OCUPAR.
		int i = numeros [0];
		int j = numeros [1];
		int k = numeros [2];
		int l = numeros [3];
	
		//IMPRIMIMOS PARA VER VALORES
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("l = " + l);
	}
}
