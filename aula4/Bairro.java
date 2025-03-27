package aula4;

public class Bairro {

	private Integer id;
	private String nome;
	
	// salvar ou alterar
	public void setId(Integer id) {
		this.id = id;
	}
	// pegar - mostrar - exibir
	public Integer getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
