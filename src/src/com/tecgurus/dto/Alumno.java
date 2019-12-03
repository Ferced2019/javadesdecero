package src.com.tecgurus.dto;

/**
 * @author killm
 *
 */
public class Alumno extends Persona {

	private String grado;
	private String grupo;
	private String numeroMatricula;
	
	public Alumno() {
		super();
	}

	public Alumno(String grado, String grupo, String numeroMatricula,String nombre, int edad, String apellido_materno, String apellido_paterno) {
		super(nombre,edad, apellido_materno,apellido_paterno);
		super.apellido_materno = "julieta";
		this.grado = grado;
		this.grupo = grupo;
		this.numeroMatricula = numeroMatricula;
	}

	public Alumno(String nombre, String apellido_paterno) {
		super(nombre, apellido_paterno);
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public void estudia() {
		System.out.println("Estoy estudiando historia");
	}

	@Override
	protected void comer() {
		System.out.println("Como puras tortas");
	}

	@Override
	public String toString() {
		return "Alumno [ nombre="+nombre + " grado=" + grado + ", grupo=" + grupo + ", numeroMatricula=" + numeroMatricula + "]";
	}
	
	
}
