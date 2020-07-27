package Entidades;

public class Funcionario {
	public String name;
	public double salarioBruto, imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		salarioBruto += ((salarioBruto * porcentagem)/100);
	}
	
	public String toString() {
		return "Dados do Funcionario: "
				+ name
				+ ", R$ "
				+ String.format("%.2f", salarioLiquido());
	}
}
