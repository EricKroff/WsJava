package modelo.javabeans;

import java.util.Objects;

public class Cliente {
	
	// ATRIBUTOS
	private String IdCliente, nombre,apellidos,direccion, email;
	private Oficina oficina;
	
	// CONSTRUCTORES
	public Cliente(String idCliente, String nombre, String apellidos, String direccion, String email, Oficina oficina) {
		super();
		IdCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.email = email;
		this.oficina = oficina;                           
	}                                                     
	public Cliente() {                                    
		super();                                          
	}                                                     
	
	// GETTERS AND SETTERS
	public String getIdCliente() {                        
		return IdCliente;
	}
	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Oficina getOficina() {
		return oficina;
	}
	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "Cliente [IdCliente=" + IdCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion="
				+ direccion + ", email=" + email + ", oficina=" + oficina + "]";
	}
	
	// EQUALS Y HASH CODE
	@Override
	public int hashCode() {
		return Objects.hash(IdCliente, apellidos, direccion, email, nombre, oficina);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(IdCliente, other.IdCliente) && Objects.equals(apellidos, other.apellidos)
				&& Objects.equals(direccion, other.direccion) && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(oficina, other.oficina);
	}
	
	
	
	
}
