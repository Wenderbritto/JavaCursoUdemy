package EstruturaCondicionalIfElse;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro e dizer se este número 
é par ou ímpar*/
public class Questao02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero = leitor.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

	}

}
