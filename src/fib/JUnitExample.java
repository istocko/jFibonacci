package fib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitExample {

	@Test
	void testFIB() {
		assertEquals(0, fib.getnthfibonaccirecursive(0));
		assertEquals(1, fib.getnthfibonaccirecursive(1));
		assertEquals(8, fib.getnthfibonaccirecursive(6));
		assertEquals(21, fib.getnthfibonaccirecursive(8));
	}
	
	@Test
	void testFIBnegativeinput() {
		assertEquals(0, fib.getnthfibonaccirecursive(-1));
	}
	
	@Test
	void testFIBmaxinputby5deconds() {
		assertEquals(1134903170, fib.getnthfibonaccirecursive(45));
	}

}
