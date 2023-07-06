package ExercicioSecao9;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome, double depositoIni) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoIni);
	}
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	public void saque(double saldo) {
		this.saldo -= saldo +5;
	}
	
	public String toString() {
		return "Conta" +
				numero +
				", nome: " +
				nome +
				", saldo: $ " +
				String.format("%.2f", saldo);
				
	}


}
