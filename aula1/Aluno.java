package aula1;

public class Aluno {
	//atributos
	String nome;
	String status;
	Double n1;
	Double n2;
	Double n3;
	Double media;
	//metodo
	void calcMedia() {
		media = (n1+n2+n3)/3;
		if(media >=6)
			status = "Aprovado";
		else if(media < 4)
			status = "Reprovado";
		else
			status = "Em Exame";
	}
	
}
