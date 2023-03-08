package modelo.javabean;

public class Perro extends Animal {

	private String raza;

	public Perro() {
		super();
	}

	public Perro(int numeroPatas, boolean tienesVertebras, String nombre, String raza) {
		super(numeroPatas, tienesVertebras, nombre);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void saludar() {
		System.out.println("Soy un perro de raza y me llamo : " + raza);
	}

	@Override
	public void sonido() {
		System.out.println("GUAY");
	}

	@Override
	public void medioLocomocion() {
		System.out.println("TERRESTRE");
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", numeroPatas=" + numeroPatas + ", tienesVertebras=" + tienesVertebras
				+ ", nombre=" + nombre + "]";
	}
	
	
	
}
