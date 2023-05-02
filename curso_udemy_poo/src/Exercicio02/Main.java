package Exercicio02;

import java.util.Locale;
import java.util.Scanner;
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar
o valor da área deste círculo com quatro casas decimais.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = leitor.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A= %.4f%n", A);

		leitor.close();

	}

}
