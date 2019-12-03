package src.com.tecgurus.dto;

public abstract class Persona {
	protected String nombre;
	protected int edad;
	public String apellido_materno = "leon";
	private String apellido_paterno = "morales";

	public Persona() {
		this.nombre = "Pepito";
//		this.saludar(this.nombre, 0);
//		System.out.println("Hola me estoy construyendo, soy una persona");
	}

	public Persona(String nombre) {
		this.nombre = nombre;
//		System.out.println("Hola me estoy construyendo, soy una persona" + nombre);
	}

	public Persona(String nombre, String apellido_paterno) {
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
//		System.out.println("Hola me estoy construyendo, soy una persona " + nombre + " " + this.apellido_paterno);
	}
	
	public Persona(String nombre, int edad, String apellido_materno, String apellido_paterno) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.apellido_materno = apellido_materno;
		this.apellido_paterno = apellido_paterno;
	}

	private void saludar(String nombre, int edad) {
		String nombreCompleto = nombre + " " + apellido_materno + " " + apellido_paterno;
		System.out.println("Hola me llamo " + nombreCompleto + " y mi edad es " + edad);
	}

	public int saludar(int edad) {
		return edad;
	}

	public String getNomnbre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getApellido_paterno() {
		this.saludar(78);
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	
	protected abstract void comer();

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", apellido_materno=" + apellido_materno
				+ ", apellido_paterno=" + apellido_paterno + "]";
	}
	
	
}
