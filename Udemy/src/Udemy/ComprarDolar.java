package Udemy;

import java.util.Scanner;

import Util.ConversaoMoeda;

public class ComprarDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da cotação do Dólar: ");
		double dolar = sc.nextDouble();

		System.out.println("Informe o valor de dólares que pretende comprar: ");
		double valorEmDolar = sc.nextDouble();
		
		//System.out.println("Dados do produto: " + product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		
		double ValorFinal = ConversaoMoeda.valorPagar(dolar, valorEmDolar);
		System.out.printf("Valor a pagar em Reais é R$ : %.2f%n", ValorFinal);
		System.out.println();

		sc.close();

	}

}
