package Automovil;

public class EjemploAutomovilStatic {

	public static void main(String[] args) {
		
		Automovil auto1= new Automovil();
		auto1.setFabricante("Subaru");
		auto1.setModelo("Impresa");
		auto1.setCilindrada(2.0);
		auto1.setColor("blanco");
					
		
		Automovil auto2 = new Automovil();
		auto2.setFabricante("mazda");
		auto2.setModelo("BET-LK");
		auto2.setColor("Rojo");
		auto2.setCilindrada(3.0);
					
		System.out.println(auto1.getColor());
		System.out.println(auto1.getModelo());
		System.out.println(auto2);
		System.out.println(auto2.detalle());
	
		
		System.out.println(auto2.getId());
		
		Automovil auto3 = new Automovil();
		
		System.out.println(auto3.getId());
	}

}
