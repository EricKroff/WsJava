package Automovil;

public class EjemploAutomovil {
	public static void main(String[] args) {
		
		//AQUI CREAMOS EL OBJETO AUTOMOVIL
		Automovil auto1= new Automovil();
		//LE DAMOS VALORES A LOS ATRIBUTOS
		auto1.setFabricante("Subaru");
		auto1.setModelo("Impresa");
		auto1.setCilindrada(2.0);
		auto1.setColor("blanco");
		
		//CREAMOS OTRO OBJETO
		Automovil auto2 = new Automovil();
		auto2.setFabricante("mazda");
		auto2.setModelo("BET-LK");
		auto2.setColor("Rojo");
		auto2.setCilindrada(3.0);
		
		System.out.println(auto1.getColor());
		System.out.println(auto1.getModelo());
		System.out.println(auto2);
}
}
