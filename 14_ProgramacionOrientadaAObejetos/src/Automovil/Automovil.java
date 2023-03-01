package Automovil;

import java.util.Objects;

// CREAMOS UNA CLASE CON SUS ATRIBUTOS.
// UNA CLASE ES COMO UN MOLDE QUE PUEDE CONTENER INFINIDAD DE OBJETOS.
// SI QUIERO CREAR UN OBJETO LO HAGO EN EL MAIN
// LOS ATRIBUTOS POR NORMA GENERAL SON PRIVADOS. ESTO SE HACE PARA OCULTAR LOS DETELLADES Y EL COMPORTAMIENTO DE LA CLASE. PARA LLEGAR A ELLOS TENEMOS LOS GETTERS AND SETTERS. ESTO ES EL ENCAPSULAMIENTO
// CONSTRUCTORES: NO SE LES PUEDE LLAMAR, UNICAMENTE APARECEN CUANDO SE CREA UN OBJETO Y ESTABLECER UNOS PARAMETROS. LA SOBRECARGA DE LOS CONSTRUCTORES NOS DAN NUEVAS "PLANTILLAS" PARA CREAR NUESTROS OBJETOS.
//METODOS ESTATICOS: METODOS QUE NO LE PERTENECEN SOLO AL OBJETO SINO QUE A TODA LA CLASE. SE PODRIA DECIR QUE ES UN ATRIBUTO GENERICO Y COMPARTIDO PARA TODOS LOS OBJETOS. PARA LLAMAR A ESTOS ATRUBUTOS NO USAMOS THIS

public class Automovil {

	private int id;
	private String fabricante;
	private String modelo;
	private String color;
	private double cilindrada;
	private static String colorPatente = "Naranja";
	private static int ultimoId;
	
	
	//GENERAMOS UN CONSTRUCTOR SIN PARAMETROS
	public Automovil() {
		super();
		this.id = ++ultimoId;
	}
	//GENERAMOS CONSTRUCTOR CON PARAMETROS
	public Automovil(String fabricante, String modelo, String color, double cilindrada) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.cilindrada = cilindrada;
	}
	//SOBRECARGA DE CONSTRUCTORES
	//RECUERDA QUE CON THIS PUEDES REUTILIZAR OTROS CONSTRUCTORES PARA QUE EL CODIGO SEA MAS EFICIENTE.
	public Automovil(String modelo, String color) {
		super();
		this.modelo = modelo;
		this.color = color;
	}

	//GETTERS AND SETTERS
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public static String getColorPatente() {
		return colorPatente;
	}
	public static void setColorPatente(String colorPatente) {
		Automovil.colorPatente = colorPatente;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cilindrada, color, fabricante, modelo);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//AQUI SOBRESCRIBIMOS EQUALS PARA PODER USARLO Y COMPARAR LOS OBJETOS DE NUESTRAS CLASES.
	//TAMBIEN ESTAMOS ESTRUCTURANDO QUE NOS DEVUELVA TRUE O FALSE PARA NO TENER FALLOS "NULL POINTER EXCEPTION"
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovil other = (Automovil) obj;
		return Double.doubleToLongBits(cilindrada) == Double.doubleToLongBits(other.cilindrada)
				&& Objects.equals(color, other.color) && Objects.equals(fabricante, other.fabricante)
				&& Objects.equals(modelo, other.modelo);
	}

	//EL METODO TOSTRING NOS IMPRIME EL METODO COMO TEXTO. ASI QUE SOBRESCRIBIRLO NOS SIRVE PARA IMPRIMIR TODOS LOS VALORES DE NUESTROS OBJETOS EN STRING SIN SU HASCODE. 
	//ESTE SE PUEDE MODIFICAR PARA QUE A LA HORA DE IMPRIMIR SOLO PONGA LOS VALORES QUE NOSOTROS QUEREMOS. 
	
	@Override
	public String toString() {
		return "Automovil [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color
				+ ", cilindrada=" + cilindrada + "]";
	}
	
	//METODOS
	public String detalle() {
		return
				this.getFabricante() + this.getModelo() + this.getColor() + this.getCilindrada() + colorPatente;
	}
}



