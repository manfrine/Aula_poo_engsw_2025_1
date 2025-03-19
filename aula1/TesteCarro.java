package aula1;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o modelo: ");
		car1.modelo = into.next();
		System.out.println("Digite a marca: ");
		car1.marca = into.next();
		System.out.println("Digite o ano: ");
		car1.ano = into.nextInt();
		System.out.println("Digite o valor: ");
		car1.valor = into.nextDouble();
		car1.calcValor();
		
		System.out.println("O modelo: "+car1.modelo);
		System.out.println("A marca: "+car1.marca);
		System.out.println("O ano: "+car1.ano);
		System.out.println("O valor: R$ "+car1.valor);
		System.out.println("O valor do IPVA: R$ "+car1.ipva);
		
		
	}
}
