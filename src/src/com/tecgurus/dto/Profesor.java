package src.com.tecgurus.dto;

public class Profesor extends Persona implements Director,Subdirector{

	@Override
	protected void comer() {
		// TODO Auto-generated method stub
		System.out.println("Como como gente normal");
	}

	@Override
	public void darInforme() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contrataProfesores() {
		// TODO Auto-generated method stub
		
	}

	
}
