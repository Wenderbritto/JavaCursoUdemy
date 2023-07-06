package ExercicioSecao9;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	public void saque(double saldo) {
		this.saldo -= saldo -5;
	}
	

}
