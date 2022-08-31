package interfazTest;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import biometricaDominio.BiometricaClass;

class BiometricaTest {
	
	Scanner teclado = new Scanner(System.in);
	
	@Test
	void testCreacionMaquina() {
		String nombreDelDispositivo;
		Integer cantidadDeUsuarios;
		nombreDelDispositivo = teclado.next();
		cantidadDeUsuarios = teclado.nextInt();
		BiometricaClass biometrica = new BiometricaClass(nombreDelDispositivo, cantidadDeUsuarios);
		
	}
	
	@Test
	void testMenu() {
		Integer opcion;
		System.out.println("Ingrese una opción: ");
		opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1: testIngresarUsuario();
			break;
		case 2: testObtenerUsuario();
			break;
		case 3: testUsuarioMayorSueldo();
			break;
		case 4: testRegistrarIngresoDeUsuario();
			break;
		}
		
	}
	
	@Test
	private void testIngresarUsuario() {
			
	}
	

	@Test
	private void testUsuarioMayorSueldo() {
		
	}

	@Test
	private void testObtenerUsuario() {
		
	}


	
	@Test
	private void testRegistrarIngresoDeUsuario(){
		
	}

}
