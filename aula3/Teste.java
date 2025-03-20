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
			
			System.out.println("\nDigite 1 p/ continuar ou 0 p/ sair: ");
			a = into.nextInt();
			
		}while(a !=0);
		
		
		
		
	}
}


