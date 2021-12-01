package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio05Test {

	@Test
	public void comprobacion() {
		int resultado = Ejercicio05.suma(5, 6);
		int esperado = 11;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion2() {
		int resultado = Ejercicio05.resta(5, 3);
		int esperado = 2;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion3() {
		int resultado = Ejercicio05.multiplicacion(5, 6);
		int esperado = 30;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion4() {
		float resultado = Ejercicio05.division(10, 2);
		float esperado = 5;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion5() {
		float resultado = Ejercicio05.mitadSiPar(10);
		float esperado = 5;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion6() {
		boolean resultado = Ejercicio05.esPar(10);
		boolean esperado = true;
		assertEquals(resultado, esperado);
	}
	//Otra manera de comprobar con un boolean
	public void comprobacion7() {
		assertTrue(Ejercicio05.esPar(10));
		assertFalse(Ejercicio05.esPar(9));
	}

}
