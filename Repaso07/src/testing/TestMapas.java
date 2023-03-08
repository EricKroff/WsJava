package testing;

import java.util.HashMap;
import java.util.Map;

public class TestMapas {
	public static void main(String[] args) {
		
		// SOBRESCRIBE LAS EL CONTENIDO QUE TENGAN LA MISMA CLASE
		Map<Integer, String> nombres;
		nombres = new HashMap<>();
		
		nombres.put(1, "Tomas");
		nombres.put(2, "Esteban");
		nombres.put(3, "Andrea");
		nombres.put(3, "Carmen");
		
		for(String ele: nombres.values())
			System.out.println(ele);
		
	}
}
