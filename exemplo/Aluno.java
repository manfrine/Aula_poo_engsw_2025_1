package exemplo;

public class Aluno {

	String nome;
	String status;
	Double n1;
	Double n2;
	Double n3;
	Double media;
	
	void calcMedia() {
		media=(n1+n2+n3)/3;
		if(media >=6)
			status = "Aprovado";
		else if(media>=4 && media <6)
			status = "Em exame";
		else
			status = "Reprovado";
	}
}
