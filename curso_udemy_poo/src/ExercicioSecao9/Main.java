package ExercicioSecao9;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		Conta c1;
		
		System.out.println("Digite o numero da conta: ");
		int numConta = leitor.nextInt();
		
		System.out.println("Digite seu nome: ");
		leitor.nextLine();
		String nome = leitor.nextLine();
		
		System.out.println("Vai fazer o deposito inicial?(S/N)");
		char resp = leitor.next().charAt(0);
		
		if(resp == 'S') {
			
			System.out.println("Digite o saldo inicial: ");
			double saldoIni = leitor.nextDouble();
			
			c1 = new Conta(numConta, nome, saldoIni);
		}
		else {
			c1 = new Conta(numConta, nome);
		}
		
		System.out.println();
		
		System.out.println("Dados da Conta: ");
		System.out.println(c1);
		
		System.out.println();
		System.out.print("Digite um valor para deposito: ");
		double dep = leitor.nextDouble();
		
		c1.deposito(dep);
		
		System.out.println("Atualizado!");
		System.out.println(c1);
		
		
		System.out.println();
		System.out.print("Digite um valor para sacar: ");
		double sac = leitor.nextDouble();
		
		c1.saque(sac);
		
		System.out.println("Atualizado!");
		System.out.println(c1);

	}

}
