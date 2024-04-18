package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class Tests {


@Test
void fibonacci1() {
	 int esperado=1;
	 int obtenido=Algoritmos.fibonacci(1);
	 assertEquals(esperado,obtenido);
	 
	 
}
	
@Test
void fibonacci2() {
	 int esperado=2;
	 int obtenido=Algoritmos.fibonacci(3);
	 assertEquals(esperado,obtenido);
	 
	 
}
@Test
void fibonacci3() {
	 int esperado=3;
	 int obtenido=Algoritmos.fibonacci(4);
	 assertEquals(esperado,obtenido);
	 
	 
}

@Test 
void factorial1() {
	int esperado=120;
	int obtenido=Algoritmos.factorial(5);
	assertEquals(esperado,obtenido);
}

@Test 
void factorial2() {
	int esperado=5040;
	int obtenido=Algoritmos.factorial(7);
	assertEquals(esperado,obtenido);
}

@Test
void esPrimo1() {
	 boolean esperado=true;
	 boolean obtenido=Algoritmos.esPrimo(11);
	 assertEquals(esperado,obtenido);
}

@Test
void esPrimo2() {
	 boolean esperado=false;
	 boolean obtenido=Algoritmos.esPrimo(8);
	 assertEquals(esperado,obtenido);
}


}
