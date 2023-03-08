package modelo.dao;

import java.util.ArrayList;
import modelo.javabeans.Cliente;
import modelo.javabeans.Oficina;

public interface BancoDao {

	/*CREAMOS METODOS:*/
	
	//PONEMOS TIPO DE DATO QUE DEVUELVE- NOMBRE- Y LO QUE PIDE EL METODO
	boolean altaOficina(Oficina oficina);
	boolean eliminarOficina(Oficina oficina);
	// ESTA DEVUELVE UNA OFICINA PORQUE VA A ENGLOBAR UN ARRAY
	Oficina eliminarOficina(int posRelativa); 
	Oficina modificarOficina(Oficina oficina);
	Oficina buscarUna(int idOficina);
	//ESTE METODO ME VA A DEVOLVER UN ARRAY CON LA LISTA DE LAS OFICINAS
	ArrayList<Oficina> buscarTodos();
	ArrayList<Oficina> buscarPorPrefijo(String prefijo);
	ArrayList<Cliente> buscarClientesOficina(int idOficina);
	ArrayList<Oficina> buscarPorCiudad(String ciudad);
	
}
