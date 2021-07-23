package co.com.programacionOO;

public class Persona2Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona2 persona1 = new Persona2("Maria", "Perez");										
		
		DocumentoIdentificacion identificacionP2 = new DocumentoIdentificacion(12345, "T.I.");
		
		Persona2 persona2 = new Persona2 (identificacionP2);
		
		Persona2 persona3 = new Persona2 ();
		
		//Creando informacion persona 1
		persona1.setAnioNacimiento(1970);
		DocumentoIdentificacion identificacionP1 = new DocumentoIdentificacion(22222, "CC");
		persona1.setIdentificacion(identificacionP1);
		
		//Creando información persona 2
		persona2.setNombre("Juan");
		persona2.setApellidos("Torres");
		persona2.setAnioNacimiento(1990);
		
		//Crear información persona 3
		persona3.setNombre("Monica");
		persona3.setApellidos("Torres");
		persona3.setAnioNacimiento(1985);
		//persona3.setIdentificacion(new DocumentoIdentificacion(112342, "CC"));
		
		
		
		DocumentoIdentificacion identificacionP3 = persona3.getIdentificacion();
		if(identificacionP3 != null) {
			identificacionP3.setNumeroIdentificacion(2222344);
			identificacionP3.setTipoIdentifiacion("CC");
		} else {
			identificacionP3 = new DocumentoIdentificacion (2222344, "P");
		}
		
		//new DocumentoIdentificacion (2222344, "P");
		persona3.setIdentificacion(identificacionP3);
		
		Persona2 [] personas = {persona1, persona2, persona3};
		for (int i = 0; i< personas.length; i++) {
			System.out.println("Nombre persona: " + personas[i].getNombre() + " " + personas [i].getApellidos());
			if(personas[i].getIdentificacion() != null ) {
														
				System.out.println("Identificación " + personas[i].getIdentificacion().getNumeroIdentificacion() + " tipo: " + personas[i].getIdentificacion().getTipoIdentifiacion());
			}
		}
		
		
		
		
		
		
		
	
		
		
		

	}

}
