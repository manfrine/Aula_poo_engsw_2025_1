package aula1;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		a1.nome = into.next();//o método next captura Strings
		
		System.out.println("Digite a n1: ");
		a1.n1 = into.nextDouble();//o metodo nextDouble captura Doubles
		System.out.println("Digite a n2: ");
		a1.n2 = into.nextDouble();
		System.out.println("Digite a n3: ");
		a1.n3 = into.nextDouble();
		a1.calcMedia();
		
		System.out.println("O nome: "+a1.nome);
		System.out.println("A media: "+a1.media);
		System.out.println("O status: "+a1.status);
		
	}
}
