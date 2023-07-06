package ExercicioSecao9;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	public void saque(double saldo) {
		this.saldo -= saldo -5;
	}
	
	public String toString() {
		return "Nome: " + nome +
				", numero: " + numero +
				", saldo: " + saldo;
	}

}
