package ClasseAtributoMetodo;

//Criando uma classe publica.
public class Triangle {
	
	//Declarando os atributos dessa classe.
	public double a;
	public double b;
	public double c;
	
	//Criando um metodo para calcular a area.
	public double area() {
		
		double p =(a+b+c)/2.0;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}
