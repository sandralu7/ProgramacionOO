package co.com.programacionOO;

public class PersonaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona();
		persona.setAnioNacimiento(1987);
		persona.setIdentificacion(76569234);
		persona.setNombre("Juan");
		persona.setApellido("Perez");

	
		Persona persona2 = new Persona (6523972, "María", "Sanchez", 1990);
		
		
		Persona persona3 = new Persona ("Pedro", "Hernandez");
		Persona persona4 = new Persona ();
		
		
		Persona [] personas = {persona, persona2, persona3, persona4};
		for (int i=0; i<personas.length; i++) {
			System.out.println("Nombre de la persona "+ i +" "+ personas[i].getNombre() + " " + personas[i].getApellido());
			System.out.println("La edad de la persona "+ i +" "+ personas[i].calcularEdad());
			System.out.println("La persona es "+ i +" " + personas[i].mayorEdad());
			System.out.println("La identificación de persona "+i +" " + personas[i].getIdentificacion());
			
		}
		
		

	}

}
