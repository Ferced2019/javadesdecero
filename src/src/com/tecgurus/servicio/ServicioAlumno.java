package src.com.tecgurus.servicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import src.com.tecgurus.dto.Alumno;

public class ServicioAlumno implements ServicioCrud{

	@Override
	public Object crear(Object object) {
		Alumno newAlumno = (Alumno)object;
		System.out.println(newAlumno.getNomnbre());
		System.out.println(newAlumno.toString());
		return newAlumno;
	}

	@Override
	public Object actualizar(Object object) {
		Alumno alumno = (Alumno) this.obtenerPorId(object);
		Alumno newAlumno = (Alumno)object;
		return newAlumno;
	}

	@Override
	public Object obtenerPorId(Object idAlumno) {
		List<Alumno> listaAlumnos = (List<Alumno>) this.obtenerTodos();
		Alumno alumnoObtenido =  new Alumno();
		for(Alumno alumno: listaAlumnos) {
			if(((String)idAlumno).equals (alumno.getNumeroMatricula())) {
				return alumnoObtenido = alumno;
			}
		}
		return alumnoObtenido;
	}
	
//	@Override
//	public Object obtenerPorIdLambda(Object idAlumno) {
//		List<Alumno> listaAlumnos = (List<Alumno>) this.obtenerTodos();
//		Alumno alumnoObtenido =  new Alumno();
//		for(Alumno alumno: listaAlumnos) {
//			if(((String)idAlumno).equals (alumno.getNumeroMatricula())) {
//				return alumnoObtenido = alumno;
//			}
//		}
//		return alumnoObtenido;
//	}

	@Override
	public Object obtenerTodos() {
		// TODO Auto-generated method stub
		return inicializaAlumno();
	}
	
	public static List<Alumno> inicializaAlumno(){
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(new Alumno("D","2","201930456","Jose Emmanuel",16,"Ortiz","Leal"));
		listaAlumnos.add(new Alumno("D","2","201930455","Fernando",16,"Gomez","Urrutia"));
		listaAlumnos.add(new Alumno("D","2","201930454","Josue",16,"Infante","Leal"));
		listaAlumnos.add(new Alumno("C","2","201930457","Daniela",10,"Morales","Rojas"));
		return listaAlumnos;
	}
		
}
