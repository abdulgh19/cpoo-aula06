package mz.co.devtec.cpoo.entidade.aula06.exercicio;

public class Caderneta {
	
	private String disciplina, nomeDoAluno;
	private double nota;
		
	public Caderneta(String disciplina, double nota, String nomeDeEStudante) {
		this.disciplina = disciplina;
		this.nota = nota;
		nomeDoAluno = nomeDeEStudante;
	}

	@Override
	public String toString() {
		return "Caderneta [disciplina=" + disciplina + ", nota=" + nota + ", nome=" + nomeDoAluno + "]";
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	

}
