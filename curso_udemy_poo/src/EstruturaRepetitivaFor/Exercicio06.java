package EstruturaRepetitivaFor;
/*Ler um número inteiro N e calcular todos os seus divisores.*/
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		double n = leitor.nextDouble();
		
		for(int i=1; i<=n; i++) {
			
			if(n % i ==0) {
				
				System.out.println(i);
			}
			
			
		}
		

	}

}
