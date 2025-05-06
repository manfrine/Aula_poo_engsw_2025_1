package aula5;

public class Alexa extends ProdutoEletronico implements Player {

	private String cor;
	
	
	@Override
	public void ligar() {
		System.out.println("Comando de voz 'Alexa, ligar' !!");
	}

	@Override
	public void desligar() {
		System.out.println("Comando de voz 'Alexa, desligar' !!");
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void play() {
		System.out.println("Comando de voz 'Tocar música' !!");
		
	}

	@Override
	public void stop() {
		System.out.println("Comando de voz 'Alexa, desligar a música' !!");
		
	}

	@Override
	public void pause() {
		System.out.println("Comando de voz 'Alexa, parar a música' !!");
		
	}

}
