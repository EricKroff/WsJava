package testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


// NO ADMITE REPETIDOS. A LA HORA DE IMPRIMIR SOLO SACA UN "TOMAS"
public class TestSet {

	public static void main(String[] args) {
		Set<String> lista1, lista2, lista3;
		
		lista1 = new HashSet<>();

		lista1.add("Tomas");
		lista1.add("Eva");
		lista1.add("Sara");
		lista1.add("Carmen");
		lista1.add("Tomas");
		
		for(String nombre: lista1) {
			System.out.println(nombre);
		}
	

	}

}
