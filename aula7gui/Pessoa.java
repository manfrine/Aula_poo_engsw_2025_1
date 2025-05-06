package aula7gui;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Double valor;
	
	Pessoa(){	
	}

	public Pessoa(int idade, String nome, Double valor) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.valor = valor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	

}
