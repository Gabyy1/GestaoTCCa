package entity;

public class Aluno extends Pessoa{
	
	private String RA;
	private String curso;
	
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

}