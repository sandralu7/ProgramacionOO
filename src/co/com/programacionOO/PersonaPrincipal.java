package co.com.programacionOO;

public class PersonaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona();
		persona.setAnioNacimiento(1987);
		persona.setIdentificacion(76569234);
		persona.setNombre("Juan");
		persona.setApellido("Perez");

		
		System.out.println("Nombre de la persona " + persona.getNombre() + " " + persona.getApellido());
		System.out.println("La edad de la persona " + persona.calcularEdad());
		System.out.println("La persona es " + persona.mayorEdad());
		
		

	}

}
