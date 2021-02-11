package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	void testSuma() {
		assertEquals(2, Calculadora.suma(1,1));
	}
	
}
