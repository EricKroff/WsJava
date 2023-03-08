package testing;

import modelo.javabeans.BancoDaoImplList;
import modelo.javabeans.Oficina;

public class TestBuscarPorOficinas {

	public static void main(String[] args) {
		BancoDaoImplList banco = new BancoDaoImplList("Banco");
		String ciudad = "Madrid";
		String prefijo ="91";
		
		for(Oficina oficina: banco.buscarPorPrefijo(prefijo)) {
			
		}

	}

}
