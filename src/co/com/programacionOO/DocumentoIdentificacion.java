package co.com.programacionOO;

public class DocumentoIdentificacion {
	
	private long numeroIdentificacion;
	
	private String tipoIdentifiacion;

	public long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getTipoIdentifiacion() {
		return tipoIdentifiacion;
	}

	public void setTipoIdentifiacion(String tipoIdentifiacion) {
		this.tipoIdentifiacion = tipoIdentifiacion;
	}
	
	public DocumentoIdentificacion(long numeroIdentificacion, String tipoIdentifiacion){
		this.numeroIdentificacion = numeroIdentificacion;
		this.tipoIdentifiacion = tipoIdentifiacion;
		
	}
	

}
