package aula3;

public class Veiculo {

	String modelo;
	Marca marca;
	String cor;
	Double valor;
	Double ipva;
	
	void calcIpva() {
		if(valor<=40000.0)
			ipva = valor*2/100;
		else if(valor<70000.0)
			ipva = valor*3/100;
		else 
			ipva = valor*5/100;
	}
}
