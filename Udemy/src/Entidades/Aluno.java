package Entidades;

public class Aluno {
	public String name;
	public double nota1, nota2, nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String verificar() {
		if (notaFinal() < 59.0) {
			return "Reprovado";
		} else {
			return "Passou";
		}
	}
	
	public double falta() {
		return 60 - notaFinal();
	}
	
	public String toString() {
		return "Dados do fim do ano "
				+ String.format("%.2f",notaFinal());
	}
}
