package ClasseAtributoMetodo2;

import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler os dados de um produto em estoque 
(nome, preco e quantidade no estoque).Em seguida: 
* Mostrar os dados do produto (nome, preco, quantidade no estoque, 
valor total do estoque);
* Realizar uma entrada no estoque e mostrar novamente os dados do produto;
* Realizar uma saida no estoque e mostrar novamente os dados do produto.*/
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		//Instanciando um objeto do tipo Product
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		//Vai inserir um nome no atributo do objeto product.
		System.out.print("Name: ");
		product.name = leitor.nextLine();
		
		//Vai inserir o preco no atributo do objeto product.
		System.out.print("Price: ");
		product.price = leitor.nextDouble();
		
		//Vai inserir uma quantidade de estoque no atributo do objeto produt.
		System.out.print("Quantity in stock: ");
		product.quantity = leitor.nextInt();
		
		//Vai imprimir as informacoes do objeto product, conforme foi formatado no metodo toString.
		System.out.println();
		System.out.println("Product data: " + product);
		
		//Vai solicitar que o usuario digite
		System.out.println();
		System.out.println("Enter the number of product to be added in stock: ");
		int quantity = leitor.nextInt();
		//E o metodo addProducts vai receber o valor digitado pelo usuario.
		product.addProducts(quantity);
		
		//Vai imprimir as informacoes do objeto product, conforme foi formatado no metodo toString.
		System.out.println();
		System.out.println("Updated data: " + product);
		
		//Vai solicitar que o usuario digite
		System.out.println();
		System.out.println("Enter the number of product to be removed from stock: ");
		quantity = leitor.nextInt();
		//E metodo removeProducts vai receber o valor digitado pelo usuario.
		product.removeProducts(quantity);
		
		//Vai imprimir as informacoes do objeto product, conforme foi formatado no metodo toString.
		System.out.println();
		System.out.println("Updated data: " + product);
	}

}
