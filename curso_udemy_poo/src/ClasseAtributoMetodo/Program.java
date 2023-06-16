package ClasseAtributoMetodo;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		//Instanciando os objetos do tipo Triangle.
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		//Atribuindo valores para os atributos do objeto x.
		System.out.println("Enter the measures of triangle X: ");
		x.a= leitor.nextDouble();
		x.b= leitor.nextDouble();
		x.c= leitor.nextDouble();
		
		//Atribuindo valores para os atributos do objeto y.
		System.out.println("Enter the measures of triangle Y: ");
		y.a= leitor.nextDouble();
		y.b= leitor.nextDouble();
		y.c= leitor.nextDouble();
		
		//Declarando variaveis com o metodo para calcular a area.
		double areaX= x.area();
		double areaY= y.area();
		
		System.out.printf("Triangle x area: %.4f%n",areaX);
		System.out.printf("Triangle y area: %.4f%n",areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		

	}

}
