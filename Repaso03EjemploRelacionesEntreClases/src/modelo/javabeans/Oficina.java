package modelo.javabeans;

import java.util.Objects;

public class Oficina {
	
	// ATRIBUTOS
	private int idOficina;
	private String nombre, direccion, telefono;
	
	// CONSTRUCTORES
	public Oficina() {
		super();
	}
	public Oficina(int idOficina, String nombre, String direccion, String telefono) {
		super();
		this.idOficina = idOficina;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//GETTERS AND SETTERS
	public int getIdOficina() {
		return idOficina;
	}
	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//REDIFINIR METODOS DE OBJECT
	@Override
	public String toString() {
		return "Oficina [idOficina=" + idOficina + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}
	
	// EQUALS E HASH CODE
	@Override
	public int hashCode() {
		return Objects.hash(direccion, idOficina, nombre, telefono);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oficina other = (Oficina) obj;
		return Objects.equals(direccion, other.direccion) && idOficina == other.idOficina
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}
	
	// METODOS PROPIOS:
	
	
	
}
