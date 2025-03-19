package aula1;

public class Carro {

	String modelo;
	String marca;
	Double valor;
	Double ipva;
	Integer ano;
	
	void calcValor() {
		if(valor <= 40000.0)
			ipva = valor*2/100;
		else if(valor <= 60000.0)
			ipva = valor*3/100;
		else if(valor <=80000.0)
			ipva = valor*0.05;
		else
			ipva = valor*0.07;
	}
}
