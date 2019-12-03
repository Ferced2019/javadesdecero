package src.com.tecgurus.holamundo;

import src.com.tecgurus.dto.Alumno;
import src.com.tecgurus.servicio.ServicioAlumno;

public class MainServicios {

	public static void main(String[] args) {
//		Alumno alumno = new Alumno();
//		alumno.setApellido_materno("lopez");
//		alumno.setApellido_paterno("gomez");
//		alumno.setEdad(25);
//		alumno.setGrado("3");
//		alumno.setGrupo("A");
//		alumno.setNombre("Armando");
//		alumno.setNumeroMatricula("20193456");
//		Alumno alumno2 = (Alumno) new ServicioAlumno().crear(alumno);
//		System.out.println(alumno2.getNomnbre());
		System.out.println(ServicioAlumno.inicializaAlumno());
		
		System.out.println(new ServicioAlumno().obtenerPorId("201930456").toString());
	}
}
