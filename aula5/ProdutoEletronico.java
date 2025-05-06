package aula5;

public abstract class ProdutoEletronico {

	private String modelo;
	private String fabricante;
	
	public abstract void ligar();
	public abstract void desligar();
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
