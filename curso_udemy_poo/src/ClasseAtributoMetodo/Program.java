package ClasseAtributoMetodo;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a= leitor.nextDouble();
		x.b= leitor.nextDouble();
		x.c= leitor.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a= leitor.nextDouble();
		y.b= leitor.nextDouble();
		y.c= leitor.nextDouble();
		

	}

}
