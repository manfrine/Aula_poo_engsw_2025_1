package aula3;

public class Caminhao extends Veiculo{

	Double capCarga;
	
	void calcIpva() { // polimorfismo de sobreposição
		
		if(capCarga <= 20000.0)
			ipva = valor*1/100;
		else if(capCarga <= 30000.0)
			ipva = valor*2/100;
		else
			ipva = valor*3/100;
	}
}
