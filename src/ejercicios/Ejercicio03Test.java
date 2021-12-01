package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio03Test {

	@Test
	public void testletra() {
		int resultado = Ejercicio03.letra ("a",'a');
		int esperado = 5;
		 assertEquals(resultado,esperado);
	}
	
	@Test
	public void testletra2 () {
		int resultado = Ejercicio03.letra("b",'a');
		int esperado = 6;
		
		assertEquals(resultado, esperado);
	}

	@Test
	public void testletra3 () {
		int resultado = Ejercicio03.letra("ab",'a');
		int esperado = 7;
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testletra4 () {
		int resultado = Ejercicio03.letra(" ",'a');
		int esperado = 9;
		
		assertEquals(resultado, esperado);
	}


}