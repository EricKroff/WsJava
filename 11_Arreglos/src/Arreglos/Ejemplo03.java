package Arreglos;

import java.util.Arrays;

public class Ejemplo03 {
	public static void main(String[] args) {
		
		String[] productos = new String [7];
		
	

		productos[0] = "Memoria USB";
		productos[1] = "Samsung Galaxy";
		productos[2] = "Disco duro SSD";
		productos[3] = "Asus Notebook";
		productos[4] = "Macbook";
		productos[5] = "Cromecast";
		productos[6] = "Bicicleta Oxford";
		 
		//PARA RECORER UN ARRAY SIN SABER CUANTOS HAY DENTRO USAMOS UN FOR.
		//PRIMERO ES IMPORTANTE CREAR UNA VARIABLE EXTERNA QUE SEA EL TOTAL DEL ARRAY Y QUE ESTA SE REUTILICE DENTRO DEL FOR. ESTO LO HACE MAS EFICIENTE:
		int total = productos.length;
		
		//SIEMPRE HAY ORDENAR ANTES DE ITERAR EL FOR. 
		Arrays.sort(productos);
		
		//GENERAMOS EL FOR PARA RECORER EL ARRAY COMPLETO.
		System.out.println("========== USANDO FOR ==========\"");
		for (int i = 0; i < total; i++) {
			System.out.println("para indice " + i + " : " + productos [i]);
		}
		
		System.out.println("========== USANDO FORECH ==========");
		
		//OTRA FORMA DE RECORER UN ARRAYS TAMBIEN ES USANDO UN FOREACH:
		for(String prod : productos) {
			System.out.println("Producto = " + prod);
		}
		
		//RECORRERMOS UN ARRAYS USANDO WHILE
		System.out.println("========== USANDO WHILE ==========\"");
		int i = 0;
		while (i < total) {
			System.out.println("para indice " + i + " : " + productos [i]);
			i++;
		}
		
		//RECORRERMOS UN ARRAYS USANDO DOWHILE
		System.out.println("========== USANDO DOWHILE ==========\"");
		int j = 0;
		do {
			System.out.println("para indice " + j + " : " + productos [j]);
			j++;
			} while (j < total);
		
		
		//EJEMPLOS CON NUMEROS
		int[]numeros = new int [10];
		
		int totalNumeros = numeros.length;
		//PARA PARA ASIGNAR VALORES DE FORMA DINAMICA EN UN FOR:
		for (int k = 0; k < totalNumeros; k++) {
			numeros[k] = k*3;
		}
		
		
		//RECORREMOS CON UN FOR
		for (int k = 0; k < totalNumeros; k++) {
			System.out.println(" k = " + numeros [k]);
		}
		
		
		
		
		}
	}
