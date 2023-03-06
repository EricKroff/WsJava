package testing;

import modelo.javabeans.Familia;
import modelo.javabeans.Producto;

public class TestAsociacion {

	public static void main(String[] args) {
		// AQUI CREAMOS UNA FAMILIA (QUE SE SERIA LA CLASE PRINCIPAL Y DESPUES UN PRODUCTO AÑADIDO A ESTA CLASE)
		Familia fam1 = new Familia(1, "Pantalones");
		Producto prod1 = new Producto(1, "Pantalon verde hombre t48", 125, fam1);
		
		//AQUI CREAMOS UN PRODUCTO A LA VEZ QUE CREAMOS UNA FAMILIA
		Producto prod2 = new Producto(2, "Falda vaquera de mujer txs", 70, new Familia(2, "Faldas"));
		
		// IMPRIMIMOS POR CONSOLA LOS VALORES DEL OBJETO FAM1
		System.out.println(fam1);
		
		// IMPRIMIMOS POR CONSOLA LA DESCRIPCION DEL OBJETO PROD1 QUE SE ENCUENTRA DENTRO DE FAM1
		System.out.println(prod1.getDescripcion());
		
		// AQUI SACAMOS LA DESCRIPCION DE LA FAMILIA DEL PRODUCTO
		System.out.println(prod1.getFamilia().getDescripcion()); 
		
		//IMPRIMIMOS ID DE PRODUCTO2
		System.out.println(prod2.getIdProducto());;
	}

}
