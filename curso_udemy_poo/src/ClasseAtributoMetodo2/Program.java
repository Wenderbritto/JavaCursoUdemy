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
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = leitor.nextLine();
		
		System.out.print("Price: ");
		product.price = leitor.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = leitor.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of product to be added in stock: ");
		int quantity = leitor.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of product to be removed from stock: ");
		quantity = leitor.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
	}

}
