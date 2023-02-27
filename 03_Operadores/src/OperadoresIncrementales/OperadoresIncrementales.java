package OperadoresIncrementales;

public class OperadoresIncrementales {

	public static void main(String[] args) {
		int i = 1;
		
		//OPERADOR DE PRE INCREMENTO. ESTO QUEIRE DECIR QUE PRIMERO SE INCREMENTA Y LUEGO ASIGNA EL VALOR A LA VARIABLE
		int j = ++i;
		System.out.println("Valor de i " + i); // ES LO MISMO QUE DECIR I = I +1;
		System.out.println("Valor de j " + j);
		
		
		//POST INCREMENTO.EN ESTE EJEMPLO J ES IGUAL I Y DESPUES SURGE UN INCREMENTO DE I. PRIMERO SE ASIGNA, DESPUES SE INCREMENTA.
		i = 2;
		j = i++;
		
		System.out.println("Valor de i " + i);
		System.out.println("Valor de j " + j);
	
		//PREDECREMENTO. FUNCIONA DE LA MISMA MANERA QUE LO ANTERIOR PERO RESTANDO.
		i = 3;
		j = --i;
		System.out.println("Valor de i = " + i);
		System.out.println("Valor de j = " + j);
		
		//POSDECREMENTO.
		i = 4;
		j = i--;
		System.out.println("Valor de i = " + i);
		System.out.println("Valor de j = " + j);
	}
	
}
