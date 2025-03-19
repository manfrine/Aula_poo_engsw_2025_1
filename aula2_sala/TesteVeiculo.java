package aula2_sala;

public class TesteVeiculo {

	public static void main(String[] args) {
		//instância
		Veiculo vei = new Veiculo();
		Moto m = new Moto();
		
		Marca m1 = new Marca();
		Marca m2 = new Marca();
		
		m1.nome = "Honda";
		m2.nome = "Volkswagen";
		
		vei.modelo = "Gol";
		vei.placa = "fam-1234";
		vei.cor = "Azul";
		vei.ano = 2023;
		vei.valor = 60000.0;
		vei.marca = m1;
		vei.calcIpva();
		
		m.modelo = "CB";
		m.marca = m1;
		m.placa = "abc-1234";
		m.cor = "Preta";
		m.ano = 2001;
		m.valor = 10000.0;
		m.cilindradas = 300;
		m.calcIpva();
		
		System.out.println("O carro: "+vei.modelo);
		System.out.println("A marca: "+vei.marca.nome);
		System.out.println("O valor do carro: R$ "+vei.valor);
		System.out.println("O valor do IPVA do carro: R$ "+vei.ipva);
		
		System.out.println("\nA moto: "+m.modelo);
		System.out.println("A marca: "+m.marca.nome);
		System.out.println("As cilindradas: "+m.cilindradas);
		System.out.println("O valor da moto: R$ "+m.valor);
		System.out.println("O valor do IPVA da moto: R$ "+m.ipva);
	}
}
