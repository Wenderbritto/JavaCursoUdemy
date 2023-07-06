package ExercicioSecao9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		int numConta = leitor.nextInt();
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.next();
		
		System.out.println("Vai fazer o deposito inicial?(S/N)");
		String init = leitor.next();
		
		if(init == "S") {
			
			
		}
		
		Conta c1 = new Conta(numConta, nome);
		System.out.println();
		
		System.out.println("Dados da Conta: "+c1);

	}

}
