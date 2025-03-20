package aula3;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Veiculo vei = new Veiculo();
		Moto m = new Moto();
		Caminhao cam = new Caminhao();
		
		Marca m1 = new Marca("Honda");
		Marca m2 = new Marca("Mercedes");
		Marca m3 = new Marca("Toyota");
		
		Scanner into = new Scanner(System.in);	
		int a, b, c;
		
		do {
			
			System.out.println("\nDigite o modelo do veiculo: ");
			vei.modelo = into.next();
			System.out.println("Digite a cor do veiculo: ");
			vei.cor = into.next();
			System.out.println("Digite o valor do veiculo: ");
			vei.valor = into.nextDouble();
			vei.calcIpva();// mensagem
			
			System.out.println("\nA marca 1: "+m1.nome);
			System.out.println("A marca 2: "+m2.nome);
			System.out.println("A marca 3: "+m3.nome);
			
			b = into.nextInt();
			if(b==1)
				vei.marca = m1;
			if(b==2)
				vei.marca = m2;
			else
				vei.marca = m3;
			
			
			System.out.println("O veículo: "+vei.modelo);
			System.out.println("O valor veículo: R$ "+vei.valor);
			System.out.println("O valor do IPVA veículo: R$ "+vei.ipva);
			System.out.println("A marca veículo: R$ "+vei.marca.nome);
			
			
			
			System.out.println("\nDigite 1 p/ continuar ou 0 p/ sair: ");
			a = into.nextInt();
			
		}while(a !=0);

		
	}
}


