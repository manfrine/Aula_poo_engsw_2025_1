package aula5;

public class HomeTheather extends ProdutoEletronico 
	implements Player{

	private int volumeSom;
	
	@Override
	public void ligar() {
		System.out.println("Clicar no controle remoto");
	}

	@Override
	public void desligar() {
		System.out.println("Comando desligar por voz");
	}

	@Override
	public void play() {
		System.out.println("Tocando uma múusica no home");
		
	}

	@Override
	public void stop() {
		System.out.println("Desligando a múusica no home");
	}

	@Override
	public void pause() {
		System.out.println("Parando a múusica no home");
		
	}

	
}
