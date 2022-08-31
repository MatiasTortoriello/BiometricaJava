package interfazTest;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import biometricaDominio.BiometricaClass;
import biometricaDominio.TipoDeEmpleado;
import machine.dominion.ProductType;

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
		String nombreUsuario = teclado.next();
		String apellidoUsuario = teclado.next();
		System.out.println("Inserte tipo de empleado: ");
		String tipo = teclado.next();
		TipoDeEmpleado tipoDeEmpleado = TipoDeEmpleado.valueOf(tipo);
		Double sueldo = teclado.nextDouble();
		
		BiometricaUsuarioClass usuario = new BiometricaUsuarioClass(nombreUsuario, apellidoUsuario, tipoDeEmpleado, sueldo);
		
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
