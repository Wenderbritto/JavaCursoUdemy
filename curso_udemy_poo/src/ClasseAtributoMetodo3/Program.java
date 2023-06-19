package ClasseAtributoMetodo3;
import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler os dados de um funcionario
(nome, salario bruto e imposto). Em seguida, mostrar os 
dados do funcionario (nome e salario liquido). Em seguida,
aumentar o salario do funcionario com base em uma porcentagem
dada (somente o salario bruto e afetado pela porcentagem) e mostrar
novamente os dados do funcionario.*/
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		Funcionario fun1 = new Funcionario();
		
		System.out.println("Funcionario: ");
		fun1.nome = leitor.nextLine();
		
		System.out.println("Salario bruto: ");
		fun1.salarioBruto = leitor.nextDouble();
		
		System.out.println("Imposto: ");
		fun1.imposto = leitor.nextDouble();
		
		System.out.println();
		
		System.out.println("Funcionario: "+fun1);
		
		System.out.println();
		
		System.out.println("Porcentagem para incremento: ");
		double porcent = leitor.nextDouble();
		
		fun1.aumentarSalario(porcent);
		
		System.out.println();
		System.out.println("Atualizado: " +fun1);

	}

}
