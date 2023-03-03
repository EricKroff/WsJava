package modeloDao;

public class Producto {

	private int codigo;
	private String nmbre;
	private float Precio;
	private static int ultimoCodigo;
	
	
	public Producto() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getNmbre() {
		return nmbre;
	}
	public void setNmbre(String nmbre) {
		this.nmbre = nmbre;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	
	
	
	
	
	
	
	
	
}
