package aula3_polimorfismo;

public class AlunoPos extends AlunoFacul{

	Double n4;
	Double artigo = 0.0;
	
	void calcMedia() {
		media = (n1+n2+n3+n4)/4;
		if(media >=6 ) {
			status = "Aprovado";
		}else if(media >=4 && media < 6)
			status = "Em exame";
		else
			status = "Reprovado";
	}
	// polimorfismo de sobrecarga
	void calcMedia(int a) {
		artigo = 10.0;
		status = "Aprovado";
	}
	
}




