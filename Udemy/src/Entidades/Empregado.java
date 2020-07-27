package Entidades;

public class Empregado {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Empregado() {
	}

	public Empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double porcentagem) {
		salario += ((salario * porcentagem)/100);
	}
	
	public String toString() {
		return    id
				+ ", "
				+ nome
				+ ", R$ "
				+ String.format("%.2f", getSalario());
	}
}
