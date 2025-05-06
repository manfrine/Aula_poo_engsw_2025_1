package aula5;

public class Teste {

	public static void main(String[] args) {

	//	ProdutoEletronico pe = new ProdutoEletronico();
		
		Alexa al = new Alexa();
		HomeTheather ht = new HomeTheather();
		
		al.ligar();
		al.play();
		al.pause();
		al.stop();
		al.desligar();
		
		ht.ligar();
		ht.play();
		ht.stop();
		ht.desligar();
	}

}
