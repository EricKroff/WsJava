package testing;

import modelo.javabeans.BancoDaoImplList;
import modelo.javabeans.Oficina;

public class TestBanco {

	public static void main(String[] args) {
		
		// CREAMOS BANCO
		BancoDaoImplList miBanco = new BancoDaoImplList("MI BANCO");
		
		
		// ARRAY
		System.out.println("BUCSAR TODOS");
		for (Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
		
		// PROBAMOS METODO ALTAOFICINA
		System.out.println("--- ALTA OFICINA ---");
		Oficina of1 = new Oficina(9005, "Barcelona 1", "barcelona", "987654321");
		Oficina of2 = new Oficina (9001, "madrid 1", "madrid", "981981981");
		
		// CREAMOS UNA OFICINA QUE NO ESTA CREADA EN LA LISTA Y OTRA QUE SI ESTÁ CREADA EN LA LISTA.
		System.out.println(miBanco.altaOficina(of1));
		System.out.println(miBanco.altaOficina(of2));
		
		System.out.println("BUCSAR TODOS");
		for (Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
		
		// PROBANDO EL METODO ELIMINAR OFICINAS
		System.out.println("--- ELIMINAR 9005---");
		miBanco.eliminarOficina(of1);
		
		for (Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
		
		
		// PROBANDO METODO MODIFICARUNO (ECHARLE UN OJO ESTE PORQUE NO LE VEO MUCHO SENTIDO)
		System.out.println("--- MODICAR OF2 ---");
		miBanco.modificarOficina(of2);
		
		for (Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
		
		// PROBANDO METODO BUSCAR UNO -- // NO ME FUNCIONA Y NO SE POR QUÉ 
		
		System.out.println("--- BUSCAR 9003 ---");
		System.out.println(miBanco.buscarUna(9003));
		for (Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
	}
}

