package aula4desafio;

public class Veiculo {

	private String modelo;
	private Integer ano;
	private Double valor;
	private Double ipva;
	private Marca marca;
	
	public void calcIpva() {
		if(valor <= 40000.0)
			ipva = valor*2/100;
		else
			ipva = valor*3/100;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getIpva() {
		return ipva;
	}
	public void setIpva(Double ipva) {
		this.ipva = ipva;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
}
