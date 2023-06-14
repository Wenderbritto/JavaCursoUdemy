package EstruturaRepetitivaFor;
/*Fazer um programa para ler um número N. Depois leia N pares de números e 
mostre a divisão do primeiro pelo segundo. Se o denominador for igual a 
zero, mostrar a mensagem "divisao impossivel"*/
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		
		for(int i=0; i<n; i++) {
			
			double num1 = leitor.nextDouble();
			double num2 = leitor.nextDouble();
			
			if(num2 ==0) {
				System.out.println("Divisao impossivel");
			}
			else {
				double resul = num1/num2;
				System.out.println(resul);
			}
		}
		

	}

}
