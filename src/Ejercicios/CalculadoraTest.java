package Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void comprobacion() {
		int resultado = Calculadora.suma(5, 6);
		int esperado = 11;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion2() {
		int resultado = Calculadora.resta(5, 3);
		int esperado = 2;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion3() {
		int resultado = Calculadora.multiplicacion(5, 6);
		int esperado = 30;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion4() {
		float resultado = Calculadora.division(10, 2);
		float esperado = 5;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion5() {
		float resultado = Calculadora.mitadSiPar(10);
		float esperado = 5;
		assertEquals(resultado, esperado);
	}
	@Test
	public void comprobacion6() {
		boolean resultado = Calculadora.esPar(10);
		boolean esperado = true;
		assertEquals(resultado, esperado);
	}
	//Otra manera de comprobar con un boolean
	public void comprobacion7() {
		assertTrue(Calculadora.esPar(10));
		assertFalse(Calculadora.esPar(9));
	}

}
