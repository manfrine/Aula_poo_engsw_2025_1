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
			
			System.out.println("Escolha a marca pelo número correspondente ");
			b = into.nextInt();
			if(b==1)
				vei.marca = m1;
			if(b==2)
				vei.marca = m2;
			else
				vei.marca = m3;
			
			System.out.println("\n------------------------\n");
			
			System.out.println("\nDigite o modelo da moto: ");
			m.modelo = into.next();
			System.out.println("Digite a cor do moto: ");
			m.cor = into.next();
			System.out.println("Digite o valor do moto: ");
			m.valor = into.nextDouble();
			System.out.println("Digite as cilindradas do moto: ");
			m.cilindradas = into.nextInt();
			m.calcIpva();// mensagem
			
			System.out.println("\nA marca 1: "+m1.nome);
			System.out.println("A marca 2: "+m2.nome);
			System.out.println("A marca 3: "+m3.nome);
			
			System.out.println("Escolha a marca pelo número correspondente ");
			c = into.nextInt();
			if(c==1)
				m.marca = m1;
			if(c==2)
				m.marca = m2;
			else
				m.marca = m3;
						
			System.out.println("\nO veículo: "+vei.modelo);
			System.out.println("O valor veículo: R$ "+vei.valor);
			System.out.println("O valor do IPVA veículo: R$ "+vei.ipva);
			System.out.println("A marca do veículo: "+vei.marca.nome);
			System.out.println("\n------------------------\n");
			System.out.println("\nA moto: "+m.modelo);
			System.out.println("O valor da moto: R$ "+m.valor);
			System.out.println("O valor do IPVA da moto: R$ "+m.ipva);
			System.out.println("As cilindradas da moto: R$ "+m.cilindradas);
			System.out.println("A marca do moto: "+m.marca.nome);
			
			
			System.out.println("\nDigite 1 p/ continuar ou 0 p/ sair: ");
			a = into.nextInt();
			
		}while(a !=0);

		
	}
}


