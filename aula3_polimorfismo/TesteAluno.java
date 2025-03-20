package aula3_polimorfismo;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		AlunoPos af = new AlunoPos();
		
		Scanner into = new Scanner(System.in);
		
		af.nome = "João";
		af.n1 = 3.0;
		af.n2 = 4.0;
		af.n3 = 1.0;
		af.n4 = 5.0;
		
		System.out.println("O aluno publicou artigo?  Deseja "
				+ "utilizar a media pela nota ou pelo artigo, Digite 1 para o artigo"
				+ " ou 0 p/ nota: "); 
		int a = into.nextInt();
		
		if(a==1) {
			af.calcMedia(a);
			af.media = af.artigo;
		}else {
			af.calcMedia();
		}
		
		System.out.println("O nome: "+af.nome);
		System.out.println("A media: "+af.media);
		System.out.println("O status: "+af.status);
		
		
		
	}

}
