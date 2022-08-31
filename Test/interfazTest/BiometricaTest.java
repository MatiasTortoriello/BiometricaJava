package interfazTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class BiometricaTest {
	
	Scanner teclado = new Scanner(System.in);
	
	@Test
	void testCreacionMaquina() {
		String nombreDelDispositivo;
		
		
	}
	
	@Test
	void testMenu() {
		Integer opcion;
		opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1: testIngresarUsuario();
			break;
		case 2: 
			break;
		case 3: 
			break;
		case 4: 
			break;
		}
		
	}
	@Test
	private void testIngresarUsuario() {
		
		
	}

}
