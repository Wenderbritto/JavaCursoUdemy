package EstruturaRepetitivaFor;
/*Leia 1 valor inteiro N, que representa o número de casos de teste que 
vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles
com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo 
valor tem peso 3 e o terceiro valor tem peso 5*/
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		
		for(int i=0; i<n; i++) {
			
			double num1 = leitor.nextDouble();
			double num2 = leitor.nextDouble();
			double num3 = leitor.nextDouble();
			
			double media = (num1*2 + num2*3 + num3*5)/10;
			
			System.out.printf("%.1f%n",media);
			
		}
		
		
		

	}

}
