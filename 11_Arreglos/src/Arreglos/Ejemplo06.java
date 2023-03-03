package Arreglos;

import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {
		
		// BUSCAR EN ARRAYS POR NUMERO
		// TAMBIEN SE PUEDE HACER ESTO CON ELEMENTOS STRING. 
		// DECLARAMOS EL ARRAY
		int[] a = new int[10];
		
		// CREAMOS LA VARIABLE SCANNER PARA LEER
		Scanner s = new Scanner(System.in);
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Ingrese un número: ");
			a[i] = s.nextInt();
		}
	
		System.out.println("\r\nIngrese un número a buscar: ");
	
		int num = s.nextInt();
		int i = 0;
		while(i < a.length && a[i] != num) {
			i++;
		}
		
		if (i == a.length) {
			System.out.println("Número no encontrado");
		} else if (a[i] == num) {
			System.out.println("Encontrado en la posición: " + i);
		}
		
		
		
		
	}
}
