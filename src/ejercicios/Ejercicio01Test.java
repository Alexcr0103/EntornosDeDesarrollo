package ejercicios;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ejercicio01Test {

	@Test
	public void testMayor1() {
		int resultado =Ejercicio01.Mayor(3, 6);
		int esperado = 6;
		
		assertEquals(resultado, esperado);
	}
	@Test
	public void testMayor2() {
		int resultado =Ejercicio01.Mayor(4, 2);
		int esperado = 4;
		
		assertEquals(resultado, esperado);
	}

}
