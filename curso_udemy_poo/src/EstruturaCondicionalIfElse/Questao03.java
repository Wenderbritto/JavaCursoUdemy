package EstruturaCondicionalIfElse;
import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
lidos são múltiplos entre si. Atenção: os números devem poder ser 
digitados em ordem crescente ou decrescente.*/
public class Questao03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		

	}

}
