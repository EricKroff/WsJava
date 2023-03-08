package modelo.javabeans;

import java.util.ArrayList;
import java.util.Objects;

import modelo.dao.BancoDao;

// A LAS CLASES CON LISTA DE IMPLEMENTACION SE LES LLAMA NOMBREDAOIMPLIST
// IMPORTANTE IMPOTAR EL ARRAYSLIST DEL JAVAUTIL
// --- IMPLEMENTAMOS LOS METODOS DEL INTERFACE (LOS METODOS ABSTRACTOS ESTAN EN EL INTERFACE BANCO DAO)---
public class BancoDaoImplList implements BancoDao{

	// ATRIBUTOS
	private String nombre;
	private ArrayList<Oficina> listaOficinas;
	
	// CONSTRUCTOR
	public BancoDaoImplList(String nombre) {
		this.nombre = nombre;
		
		// INICIALIZAMOS EL ARRAY
		listaOficinas = new ArrayList<>();
		cargarDatos();
	}
	
	// METODO PARA CARGAR DATOS Y SIMULAR OPERACIONES
	private void cargarDatos() {
		listaOficinas.add(new Oficina(9001, "madrid 1", "madrid", "981981981"));
		listaOficinas.add(new Oficina(9002, "madrid 2", "madrid", "981981981"));
		listaOficinas.add(new Oficina(9003, "guada 1", "guadalajara", "949654654"));
		listaOficinas.add(new Oficina(9004, "guada 2", "guadalajara", "949321321"));
	}
	
	
	
	
	// GETTER ANS SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	//METODOS DE INTERFACE
	@Override
	public boolean altaOficina(Oficina oficina) {
		if (listaOficinas.contains(oficina))
			return false;
		else 
			return listaOficinas.add(oficina);
	}

	// METOOD REMOVE TE HACE TODO EL TRABAJO PARA ESTE METODO.
	@Override
	public boolean eliminarOficina(Oficina oficina) {
		return listaOficinas.remove(oficina);
	}

	@Override
	public Oficina eliminarOficina(int posRelativa) {
		if (posRelativa >= listaOficinas.size())
			return null;
		return listaOficinas.remove(posRelativa);
	}

	@Override
	public Oficina modificarOficina(Oficina oficina) {
		int posicion = listaOficinas.indexOf(oficina);
		if(posicion == -1)
		return null;
	
		return listaOficinas.set(posicion, oficina);
	}

	@Override
	public Oficina buscarUna(int idOficina) {
		Oficina of = new Oficina();
		of.setIdOficina(idOficina);
		int posicion = listaOficinas.indexOf(of);
		
		if(posicion == -1)
			return null;
		
		return listaOficinas.get(posicion);
	}

	@Override
	public ArrayList<Oficina> buscarTodos() {
		return listaOficinas;
	}

	@Override
	public ArrayList<Oficina> buscarPorPrefijo(String prefijo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> buscarClientesOficina(int idOficina) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaOficinas, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BancoDaoImplList other = (BancoDaoImplList) obj;
		return Objects.equals(listaOficinas, other.listaOficinas) && Objects.equals(nombre, other.nombre);
	}
	
	
	
	
}
