package ClasseAtributoMetodo3;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioLiquido(){
		
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		
		double por =(salarioBruto*porcentagem)/100;
		
		
	}

}
