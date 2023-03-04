package Arrays;

public class IntroduccionArrays {

	public static void main(String[] args) {
		// RECUEDA LOS TIPOS DE DATOS SON: TIPOS BASICOS, TIPO CLASE Y ARRAYS. 
		// TAMBIEN ESTÁN LAS CLASES WRAPPERS QUE ESTA ULTIMA SE VEN AL FINAL.(CLASES ENVOLVENTES).
		// ARRAYS: UNA VARIABLE QUE CONTIENE UN CONJUNTO DE ELEMENTOS DE UN TIPO PRIMITIVO.
		// LLAMAMOS INDICE A LA POSICION QUE OCUPA.
		
		// COMO SE DEFINE UN ARRAY. AQUI DEFINIMOS EL ARRAY Y DIRECTAMENTE LE DAMOS VALORES CON LAS LLAVES.
		// ESTO HACIENDOLO DE FORMA DINAMICA
		int[] nombreArray = {2,4,6,8};
		
		// LO MISMO CON STRING:
		String[] nombreArraySt = {"andres", "sebastian", "eva"};
		
		// CUANTO DEFINIMOS UN ARRAY ES IMPORTANTE DECLARAR CUANTOS ELEMENTOS VA A TENER.
		int[] impares = new int [10];
		impares[1] = 4;
		System.out.println(impares[1]);
		
		// CREAMOS UN ARRAY DE MESES: 
		String [] meses = {"enero", "febrero", "diciembre"};
		
		// RECORREMOS UN ARRAY
		for(int i = 0; i < meses.length; i++) {
			System.out.println("En la posicion " + i + " está el mes : " + meses[i]);
		}
		
		// OTRA FORMA DE RECORAR UN ARRAY ES:
		// LA VARIABLE LOCAL "ELE:" INDICA CADA ELEMENTO DEL ARRAY Y RECORRE EN ESTE CASO EL ARRAYS "MESES".
		for(String ele: meses) {
			System.out.println("Meses son : " + ele);
		}
		
		// ARRAYS CON STRING
		String nombre = "tomas escudero delgado";
		
		// EL METODO SPLIT DESGLOSA CADA PALABRA Y GENERA UN STRING ASIGNANDOLE UNA POSICION A CADA UNA.
		// USAMOS UNA POSICION BLANCA PARA INDICAR CUANDO CORTA LA PALABRA
		for(String palabra: nombre.split(" ")) {
			System.out.println(palabra);
		}
		
		
	}

}
