package Arreglos;

public class Ejemplo04 {
	public static void main(String[] args) {
		
		//PODEMOS SIMPLIFICAR LA DECLARACION DE UN ARRAY:
		//ESTO SOLO SE UTILIZA CUANDO SABEMOS EXACTAMENTE LA CANTIDAD DE ELEMENETOS DE UN ARRAY. DE LA OTRA FORMA PODEMOS TENER MAS CONTROLADO ELEMENTOS. 
		String[] productos = {"Memoria USB","Samsung Galaxy","Disco duro SSD","Asus Notebook","Macbook","Cromecast","Bicicleta Oxford"};
		int total = productos.length;
	
		//PARA RECORRER UN FOR A LA INVERSA:
		System.out.println("======== USANDO FOR INVERSO ========");
		for(int i = 0; i < total; i++) {
			System.out.println("para indice = " + (total -1 -i) + " : " + productos [total -1 -i]);
		}
		
		System.out.println("======== USANDO FOR INVERSO 2 ========");
		for (int i = total -1; i >= 0; i--) {
			System.out.println("para indice i = " + i + " con valor " + productos[i]);
		}
		
		
		
		
		
		}
	}
