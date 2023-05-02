package Exercicio04;

import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcula o salário desse 
funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais*/
public class Main {

	public static void main(String[] args) {
		
		int numFun;
		double horas, valor, salario;
		
		Scanner leitor = new Scanner(System.in);
		
		numFun = leitor.nextInt();
		horas = leitor.nextDouble();
		valor = leitor.nextDouble();
		
		salario = horas * valor;
		
		
		System.out.printf("Numero Funcionario: %d\n",numFun);
		System.out.printf("Salario: %.2f",salario);
		
		

	}

}
