package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio04Test {

	@Test
	public void testMedia() {
		int resultado = Ejercicio04.media (2,2);
		int esperado = 2;
		 assertEquals(resultado,esperado);
	}

	@Test
	public void testMedia2 () {
		int resultado = Ejercicio04.media(-1,5);
		int esperado = 0;
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testMedia3 () {
		int resultado = Ejercicio04.media(5,-3);
		int esperado = 0;
		
		assertEquals(resultado, esperado);
	}


}
