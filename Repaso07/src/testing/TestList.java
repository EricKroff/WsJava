package testing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
	
		//CREAMOS UNA LISTA QUE CONTENGA ARRAY
		List<String> lista1, lista2, lista3;
		lista1 = new ArrayList<>();

		lista1.add("Tomas");
		lista1.add("Eva");
		lista1.add("Sara");
		lista1.add("Carmen");
		lista1.add("Tomas");
		
		for(String nombre: lista1) {
			System.out.println(nombre);
		}
	
		//CREAMOS UNA LISTA TIPO LINKED QUE PERO LE DAMOS EL MISMO VALOR QUE LA LISTA 1
		lista2 = new LinkedList<>();
		lista2 = lista1;
			
			for(String ele: lista2)
				System.out.println(ele);
	}
}
