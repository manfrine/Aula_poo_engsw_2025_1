package aula2_sala;

public class Veiculo {

	String modelo;
	String placa;
	String cor;
	Integer ano;
	Double valor;
	Double ipva;
	Marca marca;
	
	void calcIpva() {
		if(valor <= 50000.0)
			ipva = valor*0.02;
		else if(valor <= 70000.0)
			ipva = valor*0.03;
		else
			ipva = valor*0.04;
	}
}
