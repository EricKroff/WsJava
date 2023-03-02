package Arreglos;

import java.util.Arrays;

public class Ejemplo02 {
	public static void main(String[] args) {
		
		//CREAMOS EL ARRAY
		String[] productos = new String [7];
		
		//INICIALIZAMOS VALORES
		productos[0] = "Memoria USB";
		productos[1] = "Samsung Galaxy";
		productos[2] = "Disco duro SSD";
		productos[3] = "Asus Notebook";
		productos[4] = "Macbook";
		productos[5] = "Cromecast";
		productos[6] = "Bicicleta Oxford";
		
		//PARA ORDENAR DE FORMA ALFETICA LOS ELEMENTOS DEL ARRAY. USAMOS LA CLASE ARRAYS CON EL METODO SORT. ESTO HACE QUE SE IMPORTE EL PAQUETE JAVA.UTIL.ARRAYS.
		Arrays.sort(productos);
		
		
		//DAMOS NOMBRE A LAS POSICIONES. ESTO SE HACE PARA CONVERTIR CADA ELEMENTO DEL ARRAY EN UNA VARIABLE CON LA QUE PODEMOS TRABAJAR DE FORMA INDIVIDUAL SI QUISIERA. 
		String prod1 = productos[0];
		String prod2 = productos[1];
		String prod3 = productos[2];
		String prod4 = productos[3];
		String prod5 = productos[4];
		String prod6 = productos[5];
		String prod7 = productos[6];
		
		//IMPRIMIMOS PARA VER VALORES
		System.out.println("productos [0] = " + prod1);
		System.out.println("productos [1] = " + prod2);
		System.out.println("productos [2] = " + prod3);
		System.out.println("productos [3] = " + prod4);
		System.out.println("productos [4] = " + prod5);
		System.out.println("productos [5] = " + prod6);
		System.out.println("productos [6] = " + prod7);
		
		
		
	
		
		int[] numeros = new int [4];
		numeros[0] = 10;
		numeros[1] = 7;
		numeros[2] = 35;
		numeros[3] = -1;
		
		//TAMBIEN PODEMOS ORDENAR NUMEROS CON EL MISMO METODO. 
		Arrays.sort(numeros);
		
		
		int i = numeros [0];
		int j = numeros [1];
		int k = numeros [2];
		int l = numeros [3];
	
			
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("l = " + l);
		}
	}

