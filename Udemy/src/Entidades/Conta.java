package Entidades;

public class Conta {

	private String nome;
	private int conta;
	private double saldo;
	private double taxa = 5.00;
	
	public Conta() {	
	}
	
	public Conta(String nome, int conta, double saldo) {
		this.nome = nome;
		this.conta = conta;
		deposito(saldo);
	}

	public Conta(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		 saldo -= valor + taxa;
	}
	
	public String toString() {
		return "Dados da Conta: "
				+ nome
				+ ", conta: "
				+ conta
				+ ", saldo R$ "
				+ String.format("%.2f", saldo);
	}
}
