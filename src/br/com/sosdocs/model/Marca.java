package br.com.sosdocs.model;

public class Marca {
	private String nome;
	private int marcaId;
	
	
	//Contrutor vazio para a persistencia
	public Marca() {
	}

	public Marca(String nome, int marcaId) {
		this.nome = nome;
		this.marcaId = marcaId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(int marcaId) {
		this.marcaId = marcaId;
	}
	
	
	

}
