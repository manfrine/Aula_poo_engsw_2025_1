package aula3_polimorfismo;

public class AlunoFacul extends Aluno{

	Double n3;
	
	void calcMedia() {
		media = (n1+n2+n3)/3;
		if(media >=6 ) {
			status = "Aprovado";
		}else if(media >=4 && media < 6)
			status = "Em exame";
		else
			status = "Reprovado";
	}
}
