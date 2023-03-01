package IfElse;

public class IfElse {

	public static void main(String[] args) {
		
		float promedio = 6.0f;
		// EL IF SIEMPRE TIENE QUE LLEVAR PARENTESIS CON UNA CONDICION BOOLEANA
		if(promedio >= 6.5) {
			System.out.println("Felicitaciones, excelente promedio");
		} else if (promedio >= 6.0) {
			System.out.println("Muy buen promedio");
		} else if (promedio >= 5.5) {
			System.out.println("Buen promedio");
		} else if(promedio >= 5.0) {
			System.out.println("Promedio regular");
		} else if (promedio >= 4.0) {
			System.out.println("insuficiente, necesitas estudiar más");
		} else  {
			System.out.println("Reprobado");
		}
		
		
		System.out.println("Tu promedio es : " + promedio);

	}

}
