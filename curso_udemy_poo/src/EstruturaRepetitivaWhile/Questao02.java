package EstruturaRepetitivaWhile;
/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o 
quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever 
mensagem alguma).*/
import java.util.Scanner;
public class Questao02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x = leitor.nextInt();
		int y = leitor.nextInt();
		
		while(x != 0 && y !=0) {
			
			if(x > 0 && y > 0) 
			{
				System.out.println("Primeiro");
				
			}
			else if(x < 0 && y > 0) {
				
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0) {
				
				System.out.println("Terceito");
			}
			else {
				System.out.println("Quarto");
			}
			
			x = leitor.nextInt();
			y = leitor.nextInt();
			
		}
		
		

	}

}
