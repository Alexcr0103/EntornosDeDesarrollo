package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio07Test {

	@Test
	public void comprobacion() {
		assertTrue(Ejercicio07.numIguales(5, 5));
		assertFalse(Ejercicio07.numIguales(3, 4));
	}


}
