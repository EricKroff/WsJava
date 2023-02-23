package SistemasNuméricos;

import javax.swing.JOptionPane;

public class EntradaDeDatosDesdeVentanaDialogo {

	public static void main(String[] args) {
		
		String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
		
		int numeroDecimal = Integer.parseInt(numeroStr);
		
		System.out.println("numeroDecimal = " + numeroDecimal);
		
		//BINARIO
		System.out.println("numero binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal));
		//SI PONEMOS 0B ANTES DEL NUMERO LO INTERPRETA COMO BINARIO POR LO QUE EL RESULTADO POR CONSOLA ES 500
		int numeroBinario = 0b111110100;
		System.out.println("numeroBinario = " + numeroBinario);
		
		//OCTAL
		System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroBinario));
		//PONEMOS UN CERO DELANTE DEL NUMERO PARA INDICAR QUE ES UN OCTAL
		int numeroOctal = 0764;
		System.out.println("numeroOctal = " + numeroOctal);
		
		//HEXADECIMAL
		System.out.println("numero hexadecimal  de " + numeroDecimal + " = " + Integer.toHexString(numeroBinario));
		//PONEMOS 0X PARA INDICAR QUE EL NUMERO ES HERXADECIMAL
		int numeroHex = 0x1f4;
		System.out.println("numeroHex = " + numeroHex);
			
		String mensaje = "numero binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal);
		mensaje += "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroBinario);
		mensaje += "numero hexadecimal  de " + numeroDecimal + " = " + Integer.toHexString(numeroBinario);
		
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
