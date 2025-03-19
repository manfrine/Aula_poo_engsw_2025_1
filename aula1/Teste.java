package aula1;

public class Teste {

	public static void main(String[]  agrs) {
		//instância
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno aluno = new Aluno();
		
		a1.nome = "João";
		a1.n1 = 7.0;
		a1.n2 = 1.0;
		a1.n3 = 2.0;
		a1.calcMedia();//mensagem
		
		a2.nome = "Maria";
		a2.n1 = 8.0;
		a2.n2 = 4.0;
		a2.n3 = 3.0;
		a2.calcMedia();
		
		aluno.nome = "Tereza";
		aluno.n1 = 8.0;
		aluno.n2 = 7.0;
		aluno.n3 = 6.0;
		aluno.calcMedia();
		
		System.out.println("O nome: "+a1.nome);
		System.out.println("A media: "+a1.media);
		System.out.println("O status: "+a1.status);
		
		System.out.println("\nO nome: "+a2.nome);
		System.out.println("A media: "+a2.media);
		System.out.println("O status: "+a2.status);
		
		System.out.println("\nO nome: "+aluno.nome);
		System.out.println("A media: "+aluno.media);
		System.out.println("O status: "+aluno.status);
		
		
		
	}
}
