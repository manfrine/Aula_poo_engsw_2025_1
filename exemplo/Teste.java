package exemplo;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] agrs) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		a1.nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
		a1.n1 = 4.0;
		a1.n2 = 5.0;
		a1.n3 = 6.0;
		a1.calcMedia();
		
		a2.nome = "Maria";
		a2.n1 = 7.0;
		a2.n2 = 8.0;
		a2.n3 = 9.0;
		a2.calcMedia();
		
		System.out.println("O nome: "+a1.nome);
		System.out.println("A media: "+a1.media);
		System.out.println("O status: "+a1.status);
		
		System.out.println("\nO nome: "+a2.nome);
		System.out.println("A media: "+a2.media);
		System.out.println("O status: "+a2.status);
	}
}
