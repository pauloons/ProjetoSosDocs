package br.com.sosdocs.model;

public class Patrimonio {
	private String nome;
	private int marcaId;
	private String desc;
	private int nTombo;
	
	//Contrutor vazio para a persistencia
	public Patrimonio() {
	}
	public Patrimonio(String nome, int marcaId, String desc, int nTombo) {
		this.nome = nome;
		this.marcaId = marcaId;
		this.desc = desc;
		this.nTombo = nTombo;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getnTombo() {
		return nTombo;
	}

	public void setnTombo(int nTombo) {
		this.nTombo = nTombo;
	}
	
	
	
}
