package src.com.tecgurus.holamundo;

import src.com.tecgurus.dto.Alumno;
import src.com.tecgurus.dto.Egresado;
import src.com.tecgurus.dto.Persona;
import src.com.tecgurus.dto.Profesor;

public class Main extends Alumno {

	public static void main(String[] args) {
//		System.out.println();
//		Persona persona = new Persona("Emmanuel");
//		System.out.println(persona);
//		persona = new Persona("Emmanuel");
//		System.out.println(persona);

		Main main = new Main();
		String n = main.nombre;
		int edad = main.edad;

		Alumno alumno = new Alumno();
		alumno.getApellido_materno();

		Persona personaAlumno = new Profesor();
		if (personaAlumno instanceof Alumno) {
			Alumno alumno1 = (Alumno) personaAlumno;
			System.out.println("Soy un alumno");
		} else if (personaAlumno instanceof Profesor) {
			System.out.println("Soy un profesor");
		}

		Alumno al = new Alumno();
		al.estudia();
		Egresado egresado = new Egresado();
		egresado.estudia();
//		persona.apellido_materno = "gomez"; 
//		persona.setNombre("Leonardo");
//		System.out.println(persona.getNomnbre());
//		persona.saludar("Emmanuel", 29);

//		int edad = persona.saludar(5);
//		System.out.println("Edad " + edad);

//		ServicioUsuario servicioUsuario = new ServicioUsuario();
//		servicioUsuario.validaEdad(9);
	}
}
