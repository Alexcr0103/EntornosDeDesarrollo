package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio02Test {

	@Test
	public void Mayor() {
		int resultado = Ejercicio02.Mayor (5,3,4);
		int esperado = 5;
		 assertEquals(resultado,esperado);
	}
	
	@Test
	public void Mayor2 () {
		int resultado = Ejercicio02.Mayor(3, 6, 4);
		int esperado = 6;
		
		assertEquals(resultado, esperado);
	}

	@Test
	public void Mayor3 () {
		int resultado = Ejercicio02.Mayor(3, 5, 7);
		int esperado = 7;
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void Mayor5 () {
		int resultado = Ejercicio02.Mayor(8, 5, 9);
		int esperado = 9;
		
		assertEquals(resultado, esperado);
	}


}
