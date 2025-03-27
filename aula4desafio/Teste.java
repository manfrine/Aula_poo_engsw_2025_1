package aula4desafio;

public class Teste {

	public static void main(String[] args) {
		
		Marca m1 = new Marca("Honda");
		Marca m2 = new Marca("Yamaha");
		Marca m3 = new Marca("BMW");
		
		Veiculo vei = new Veiculo();
		Moto m = new Moto();
		
		m.setModelo("CG");
		m.setAno(2000);
		m.setCilindradas(160);
		m.setValor(10000.0);
		m.setMarca(m2);
		
		m.calcIpva();
		
		System.out.println("O modelo: "+m.getModelo());
		System.out.println("A marca: "+m.getMarca().getNome());
		System.out.println("O valor: R$ "+m.getValor());
		System.out.println("O valor do IPVA: R$ "+m.getIpva());
	}

}
