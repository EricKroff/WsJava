package testing;

import modelo.javabeans.Cliente;
import modelo.javabeans.Cuenta;
import modelo.javabeans.Oficina;

public class Test {

	public static void main(String[] args) {
		
		Oficina of1 = new Oficina(9282, "Madrid2", "Calle del pez, 3", "984167899");
		Cliente cli1 = new Cliente("726465b", "Angel", "Uria Benites", "Madrid", "sdjflskdj@gmai.com", of1);
		Cuenta cuenta1 = new Cuenta(1000, "Ahorro", 2000, cli1);
		Cuenta cuenta2 = new Cuenta(2000, "Corriente", 4000, new Cliente("987987987A","Sara", "Perez Alvarez", "Sevilla", "sara@gmail.com", of1));
		
		
		// DESDE CUENTA SACAMOS NOMBRE DEL TITULAR, APELLIDO, TELEFONO DE LA OFICINA DEL CLUENTE.
		
		System.out.println("----CUENTA1---");
		System.out.println(cuenta1.getIdCuenta());
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta1.getCliente().getNombre());
		System.out.println(cuenta1.getCliente().getApellidos());
		System.out.println(cuenta1.getCliente().getOficina().getTelefono());
		
		// TAMBIEN PUEDO OBTENERLO DIRECTAMENTE POR EL OBJETO OF1 PERO ES PARA ENTENDER LAS RELACIONES ENTRE CLASES. 
		System.out.println("----CUENTA2---");
		System.out.println(cuenta2.getIdCuenta());
		System.out.println(cuenta2.getSaldo());
		System.out.println(cuenta2.getCliente().getNombre());
		System.out.println(cuenta2.getCliente().getApellidos());
		System.out.println(cuenta2.getCliente().getOficina().getTelefono());
		
		
		// GRACIAS A LA ASOCIACION ENTRE CLASES OBTENEMOS ACCESO A LOS DATOS Y METODOS DE LAS CLASES RELACIONADAS.
		
	}

}
