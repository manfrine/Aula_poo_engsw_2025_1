package aula3_polimorfismo;

public class Aluno {

	String nome;
	String status;
	Double n1;
	Double n2;
	Double media;
	
	void calcMedia() {
		media = (n1+n2)/2;
		if(media >=5 ) {
			status = "Aprovado";
		}else
			status = "Reprovado";
	}
}
