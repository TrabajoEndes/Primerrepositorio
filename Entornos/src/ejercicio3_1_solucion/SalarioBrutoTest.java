package ejercicio3_1_solucion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalarioBrutoTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/

	@Test
	void testBruto() {
		assertEquals(2, salarioEmpleado.calculaSalarioBruto("vendedor", 2000, 2));
	}
	
	@Test
	void testNeto() {
		assertEquals(2, actual);
	}
}
