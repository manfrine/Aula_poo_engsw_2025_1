package aula3;

public class Moto extends Veiculo {

	Integer cilindradas;
	
	void calcIpva() { // polimorfismo de sobreposição
		if(cilindradas <=160)
			ipva = valor*2/100;
		else if(cilindradas<=300)
			ipva = valor*3/100;
		else
			ipva = valor*5/100;
	}
}
