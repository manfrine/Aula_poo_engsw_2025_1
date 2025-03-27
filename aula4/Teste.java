package aula4;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Bairro b1 = new Bairro();
		Bairro b2 = new Bairro();
		
		Pessoa p1 = new Pessoa();
		
		Scanner into = new Scanner(System.in);
				
		b1.setId(10);
		b1.setNome("Centro");
		
		System.out.println("Digite o ID do Bairro: ");
		b2.setId(into.nextInt());
		System.out.println("Digite o nome do Bairro: ");
		b2.setNome(into.next());
		
		
		System.out.println("\n\nDigite o nome da pessoa: ");
		p1.setNome(into.next());
		System.out.println("Digite a idade da pessoa: ");
		p1.setIdade(into.nextInt());
		System.out.println("Digite a renda da pessoa: ");
		p1.setRenda(into.nextDouble());
		
		System.out.println("O ID: "+b1.getId());
		System.out.println("O nome: "+b1.getNome());
		System.out.println("\nO ID: "+b2.getId());
		System.out.println("O nome: "+b2.getNome());
		
		System.out.println("Digite o 1 p/ o bairro 1 ou 2 p/ o bairro 2: ");
		int a = into.nextInt();
		
		if(a == 1) {
			p1.setBairro(b1);
		}else {
			p1.setBairro(b2);
		}
		
		System.out.println("\nO nome da pessoa: "+p1.getNome());
		System.out.println("A idade da pessoa: "+p1.getIdade());
		System.out.println("A renda da pessoa: "+p1.getRenda());
		System.out.println("O bairro da pessoa: "+p1.getBairro().getNome());
		
	}
}
