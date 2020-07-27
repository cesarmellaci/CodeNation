package Entidades;

public class Retangulo {
	
	public double altura, largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return (2*altura)+(2*largura);
	}

	public double diagonal() {
		return Math.sqrt((altura * altura) + (largura * largura));
	}
	
	public String toString() {
		return "Area: "
				+ String.format("%.2f", area())
				+ ", Perimetro: "
				+ String.format("%.2f", perimetro())
				+ ", Diagonal: "
				+ String.format("%.2f", diagonal());
	}
}
