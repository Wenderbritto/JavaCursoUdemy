package Exercicio01;

/*Faca um programa para ler dois valores inteiros, e depois mostrar na 
tela a soma desses números com uma mensagem explicativa.*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n1,n2,soma;
		
		n1 = leitor.nextInt();
		n2 = leitor.nextInt();
		
		soma = n1+n2;
		
		System.out.printf("%d + %d = %d",n1,n2,soma);
		
	}

}
