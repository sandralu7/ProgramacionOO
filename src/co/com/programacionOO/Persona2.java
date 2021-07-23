package co.com.programacionOO;

public class Persona2 {
	
	private DocumentoIdentificacion identificacion;
	
	private String nombre;
	
	private String apellidos;
	
	private int anioNacimiento;

	public DocumentoIdentificacion getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(DocumentoIdentificacion identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	public Persona2 (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellidos = apellido;
	}
	
	public Persona2 (DocumentoIdentificacion identificacion) {
		this.identificacion = identificacion;
	}
	
	public Persona2 () {
		this.identificacion = new DocumentoIdentificacion(0, "CC");
		this.nombre = "";
		this.apellidos = "";
	}
	

}
