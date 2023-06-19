package ClasseAtributoMetodo3;

public class Funcionario {
	
	//Atributos
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	//Metodo para calcular o salario liquido.
	public double salarioLiquido(){
		
		return salarioBruto - imposto;
	}
	
	//Metodo para calcular o aumento em porcentagem.
	public void aumentarSalario(double porcentagem) {
		
		salarioBruto += salarioBruto * porcentagem / 100;
		
	}
	
	//Metodo para exibir as informacoes.
	public String toString() {
		
		return nome + ", $ " + String.format("%.2f",salarioLiquido());
		
	}
}
