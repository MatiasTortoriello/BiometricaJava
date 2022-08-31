package biometricaDominio;

public class BiometricaClass {
	
	private String nombreMaquina;
	private Integer numeroMaquina;
	private RegistroClass[] registros;
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

	public RegistroClass[] getRegistros() {
		return registros;
	}

	public void setRegistros(RegistroClass[] registros) {
		this.registros = registros;
	}
	
}
