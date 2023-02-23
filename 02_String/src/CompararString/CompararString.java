package CompararString;

public class CompararString {

	public static void main(String[] args) {
		
		//SE PUEDE CREAR ASI
		String curso1 = "Primera variable";
		//OTRA FORMA DE CREARLA
		String curso2 = new String ("PrImera variable");
		
		//USAMOS EQUALS PARA COMPARAR EL CONTENIDO DE LOS OBJETOS
		boolean esIgual = curso1.equals(curso2);
		System.out.println(esIgual);
		
		//TAMBIEN PODEMOS USAR EQUALS.IGNORECASE, PARA COMPARAR IGNORANDO LAS MAYUSCULAS Y MINUSCULAS
		boolean esIgual2 = curso1.equalsIgnoreCase(curso2);
		System.out.println(esIgual2);
	}
}
