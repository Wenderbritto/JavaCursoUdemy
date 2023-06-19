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
		
		//Instanciando um objeto do tipo Funcionario.
		Funcionario fun1 = new Funcionario();
		
		//Adicionando informacao no atributo do objeto.
		System.out.println("Funcionario: ");
		fun1.nome = leitor.nextLine();
		
		//Adicionando informacao no atributo do objeto.
		System.out.println("Salario bruto: ");
		fun1.salarioBruto = leitor.nextDouble();
		
		//Adicionando informacao no atributo do objeto.
		System.out.println("Imposto: ");
		fun1.imposto = leitor.nextDouble();
		
		System.out.println();
		
		//Imprime na tela as informacoes do contidas no objeto fun1.
		System.out.println("Funcionario: "+fun1);
		
		System.out.println();
		
		//Atribuindo valor a uma variavel.
		System.out.println("Porcentagem para incremento: ");
		double porcent = leitor.nextDouble();
		
		//Passando um valor por parametro para o metodo.
		fun1.aumentarSalario(porcent);
		
		System.out.println();
		
		//Imprimindo as informacoes atualizadas contidas no objeto fun1.
		System.out.println("Atualizado: " +fun1);

	}

}
