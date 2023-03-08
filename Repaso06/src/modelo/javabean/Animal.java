package modelo.javabean;

public class Animal {

	protected int numeroPatas;
	protected boolean tienesVertebras;
	protected String nombre;
	
	public Animal() {
		super();
	}
	
	public Animal(int numeroPatas, boolean tienesVertebras, String nombre) {
		super();
		this.numeroPatas = numeroPatas;
		this.tienesVertebras = tienesVertebras;
		this.nombre = nombre;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public boolean isTienesVertebras() {
		return tienesVertebras;
	}
	public void setTienesVertebras(boolean tienesVertebras) {
		this.tienesVertebras = tienesVertebras;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	@Override
	public String toString() {
		return "Animal [numeroPatas=" + numeroPatas + ", tienesVertebras=" + tienesVertebras + ", nombre=" + nombre
				+ "]";
	}

	// METODOS PROPIOS
	public void saludar() {
		System.out.println("Soy un animal y me llamo : " + nombre);
	}
	
	public void sonido() {
		System.out.println(" y soy generico");
	}
	
	public void medioLocomocion() {
		System.out.println("tengo muchos, elige uno.");
	}
	
}
