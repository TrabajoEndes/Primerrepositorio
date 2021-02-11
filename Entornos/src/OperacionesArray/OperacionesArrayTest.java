package OperacionesArray;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

class OperacionesArrayTest {
	operacionesArray OperArr= new operacionesArray();
	/*@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	void minTest() {
		assertEquals(0,operacionesArray.min(operacionesArray.v1));
	}
	
	@Test
	void maxTest() {
		assertEquals(9,operacionesArray.max(operacionesArray.v1));
	}

	@Test
	void mediaTest() {
		assertEquals(4.5,operacionesArray.media(operacionesArray.v1));
	}

	/*void inversoTest() {
		assertEquals
	}*/
}
