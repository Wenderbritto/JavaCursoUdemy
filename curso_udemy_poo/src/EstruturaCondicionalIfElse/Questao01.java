package EstruturaCondicionalIfElse;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este 
número é negativo ou não.*/

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero = leitor.nextInt();
		
		if(numero > 0) {
			System.out.println("Numero positvo");
		}
		else {
			System.out.println("Numero negativo");
		}

	}

}
