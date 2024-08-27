package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("2 + 2 = 4")
	void testSum() {
		Calculadora calc = new Calculadora();
		double valor1 = 2D;
		double valor2 = 2D;
		double esperado1 = 4D;
		
		double resultado1 = calc.sum(valor1, valor2);
		
		assertEquals(esperado1, resultado1, "deu erro");
	}
	@Test
	@DisplayName("2 - 2 = 0")
	void testMenos() {
		Calculadora calc2 = new Calculadora();
		double valor1 = 2D;
		double valor2 = 2D;
		double esperado2 = 0D;
		
		double resultado2 = calc2.menos(valor1, valor2);
		
		assertEquals(esperado2, resultado2, "deu erro");
	}
	@Test
	@DisplayName("2 * 2 = 4")
	void testMultiplicacao() {
		Calculadora calc3 = new Calculadora();
		double valor1 = 2D;
		double valor2 = 2D;
		double esperado3 = 4D;
		
		double resultado3 = calc3.multiplicacao(valor1, valor2);
		
		assertEquals(esperado3, resultado3, "deu erro");
	}
	@Test
	@DisplayName("2 / 2 = 1")
	void testDiv() {
		Calculadora calc4 = new Calculadora();
		double valor1 = 2D;
		double valor2 = 2D;
		double esperado4 = 1D;
		
		double resultado4 = calc4.div(valor1, valor2);
		
		assertEquals(esperado4, resultado4, "deu erro");
	}

}
