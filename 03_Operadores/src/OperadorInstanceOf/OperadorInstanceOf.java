package OperadorInstanceOf;

public class OperadorInstanceOf {

	public static void main(String[] args) {
		
		String texto = "Crenado un objeto de la clase String ... que tal";
		Integer num = 7;
		
		// EL OPERADOR INSTANCEOF SIRVE PARA COMPARAR Y VER EL DE UNA VARIABLE.
		// EN ESTE EJEMPLO COMPARAMOS QUE LA VARIABLE TEXTO SEA DEL MISMO TIPO QUE UN STRING.
		// INSTACEOF VIENE DE "INSTANCIA DE" QUE ES IGUAL A "CLASE/OBJETO DE". ASI QUE LO QUE COMPARAMOS ES QUE UN OBJETO PERTENEZCA A UNA CLASE EN CONCRETO.
		boolean b1 = texto instanceof String;
		System.out.println(b1);
		
		boolean b2 = num instanceof Integer;
		System.out.println(b2);
		
		// ASI CON TODOS LOS VALORES.
		
		
		
		

	}

}
