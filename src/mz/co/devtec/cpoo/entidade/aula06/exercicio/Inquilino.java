package mz.co.devtec.cpoo.entidade.aula06.exercicio;

public class Inquilino {
	
	private String nome;
	private int celular;
	
	public Inquilino(String nome, int celular) {
		this.nome = nome;
		this.celular = celular;
	}

	@Override
	public String toString() {
		return nome + ", " + celular + ".";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
	

	

}
