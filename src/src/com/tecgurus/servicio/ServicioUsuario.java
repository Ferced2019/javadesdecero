package src.com.tecgurus.servicio;

public class ServicioUsuario {

	/**
	 *  > mayor que
	 *  < menor que
	 *  && y and
	 *  || o or
	 *  ! negativo
	 *  == igual a
	 *  >= mayor o igual que
	 *  <= menor o igual que
	 *  
	 * **/
	public void validaEdad(int edad) {
		if(edad >= 18 && edad < 50) {
			System.out.println("Es mayor de edad");
		}else if(edad < 18) {
			System.out.println("Es menor de edad");
		}else if( edad < 0) {
			System.out.println("Error, no existen edade menores a cero");
		}
	}
	
	public void esEstudiante(int edad) {
		if(edad >= 6) {
			System.out.println("puede entrar a la primaria");
		}else {
			System.out.println("Aun no puede entrar a la primaria");
		}
	}
	
	public void asignarGrupo(int promedio) {
		switch (promedio) {
		case 10:
			System.out.println("Es ingresado al grupo D");
			break;
		case 9:
			System.out.println("Es ingresado al grupo c");
			break;
		case 8:
			System.out.println("Es ingresado al grupo b");
			break;
		case 7:
			System.out.println("Es ingresado al grupo a");
			break;
		default:
			System.out.println("No puede ser ingresado a ningun gurpo porque tiene un pronedio bajo");
			break;
		}
	}
	
	public void cuentaAlumnosWhile(int alumnos) {
		int totalAlumnos = alumnos;
		int valorTotal = 0;
		while (totalAlumnos > 0) {
			valorTotal++;
			totalAlumnos--;
		}
		System.out.println("Valor total while es"+ valorTotal);
	}
	
	public void cuentaAlumnosDoWhile(int alumnos) {
		int totalAlumnos = alumnos;
		int valorTotal = 0;
		do {
			valorTotal++;
			totalAlumnos--;
		} while (totalAlumnos > 0);
		System.out.println("Valor total do while es" + valorTotal);
	}
	
	public void multiplica(int numeroVeces) {
		for(int i = 0;i < numeroVeces;i++) {
			System.out.println("El valor de i es "+ i);
		}
	}
	
}
