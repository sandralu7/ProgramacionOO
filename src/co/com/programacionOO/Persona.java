package co.com.programacionOO;

public class Persona {
	
	private long identificacion;
	private String nombre;
	private String apellido;
	private int anioNacimiento;
	
	public long getIdentificacion () {
		return identificacion;
	}
	
	public void setIdentificacion (long identificacion) {
		this.identificacion = identificacion;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public int calcularEdad() {
		return 2021 - anioNacimiento;
	}
	
	public String mayorEdad () {
		String resultado = "";
		if(calcularEdad()>=18) {
			resultado = "Es mayor de Edad";
			
		}
		else {
			resultado =  "Es menor de Edad";
		}
		return resultado;
	}
	
	public Persona(long identificacion, String nombre, String apellido, int anioNacimiento) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioNacimiento = anioNacimiento;
	}

	public Persona() {
		
	}

}
