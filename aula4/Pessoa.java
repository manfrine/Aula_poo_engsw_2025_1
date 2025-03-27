package aula4;

public class Pessoa {

	private String nome;
	private Integer idade;
	private Double renda;
	private Bairro bairro;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	public Double getRenda() {
		return renda;
	}
	
	public Bairro getBairro() {
		return bairro;
	}
	
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
}
