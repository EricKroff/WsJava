package modelo.javabean;

public class Gato extends Animal {
	// HEREDAMOS DE ANIMAL CON EXTENDS
	private int vidas;

	// GENERAMOS CONSTRUCTOR NADA CON NADA
	public Gato() {
		super();
	}
	
	// GENERAMOS CONSTRUCTOR TODO CON TODO. 
	public Gato(int numeroPatas, boolean tienesVertebras, String nombre, int vidas) {
		super(numeroPatas, tienesVertebras, nombre);
		this.vidas = vidas;
	}
	
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	// SOBRESCRIBIMOS EL TOSTRING
	@Override
	public String toString() {
		return "Gato [numeroPatas=" + numeroPatas + ", tienesVertebras=" + tienesVertebras + ", vidas=" + vidas + "]";
	}

	// SOBRESCRIBIMOS LOS METODOS DEL PADRE QUE QUEREMOS HACER PROPIOS
	@Override
	public void saludar() {
		System.out.println("Soy un gato y me llamo : " + nombre);
	}

	@Override
	public void sonido() {
		System.out.println("y hago miauuuu");
	}

	@Override
	public void medioLocomocion() {
		System.out.println("Soy terrestre");
	}


	
	
}
