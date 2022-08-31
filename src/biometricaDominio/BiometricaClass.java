package biometricaDominio;

public class BiometricaClass {
	
	private String nombreMaquina;
	private Integer numeroMaquina;
	private BiometricaUsuarioClass[] registros;
	public BiometricaClass(String nombreMaquina, Integer cantidadRegistros ) {
		
	}
	
	public String getNombreMaquina() {
		return nombreMaquina;
	}
	public void setNombreMaquina(String nombreMaquina) {
		this.nombreMaquina = nombreMaquina;
	}
	public Integer getNumeroMaquina() {
		return numeroMaquina;
	}
	public void setNumeroMaquina(Integer numeroMaquina) {
		this.numeroMaquina = numeroMaquina;
	}

	public BiometricaUsuarioClass[] getRegistros() {
		return registros;
	}

	public void setRegistros(BiometricaUsuarioClass[] registros) {
		this.registros = registros;
	}


	
}
