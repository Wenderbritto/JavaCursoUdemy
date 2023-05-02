package Exercicio03;

import java.util.Scanner;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto de A e B pelo produto de C e D 
segundo a fórmula: DIFERENCA = (A * B - C * D)*/
public class Main {

	public static void main(String[] args) {
		
		int A,B,C,D,diferenca;
		
		Scanner leitor = new Scanner(System.in);
		
		A = leitor.nextInt();
		B = leitor.nextInt();
		C = leitor.nextInt();
		D = leitor.nextInt();
		
		diferenca = (A*B - C*D);
		
		System.out.printf("Diferenca: %d",diferenca);
		
		
		

	}

}
