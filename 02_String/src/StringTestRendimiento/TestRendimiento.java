package StringTestRendimiento;

import java.util.Iterator;

public class TestRendimiento {

	public static void main(String[] args) {

		String a  = "a";
		String b  = "b";
		String c  = a;
		
		//CREAMOS UNA PRUEBA PARA VER CUANTO TARDAN LAS DIFERENTES MANERAS DE CONCATENAR
		//STRINGBUILDER ES OTRA FORMA DE CONCATENAR STRING MUCHO MAS EFICIENTE
		StringBuilder sb = new StringBuilder(a);

		//CREAMOS UN INICIO QUE CUENTE EN MILISEGUNDOS
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			
			//c = c.concat(a).concat(b).concat("\n"); //500 = 2 MS
			//c+= a + b+ "\n"; // 500 = 2 MS
			sb.append(a).append(b).append("\n"); //500 = ENTRE 0 Y 1 MS
		}
		
		//CREAMOS UN FINAL
		long fin = System.currentTimeMillis();
		//POR CONSOLA IMPRIMIMOS EL FIN - INICIO PARA SABER CUANTO HA TARDADO
		System.out.println(fin-inicio);
		System.out.println("c = " + c);
		
		//IMPRIMIMOS EL STRINGBUILDER
		System.out.println("sb = " + sb.toString());
		
		
		
		
	}

}
