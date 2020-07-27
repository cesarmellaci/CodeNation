package Udemy;

import java.util.Scanner;
import Entidades.Retangulo;

public class ExerRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.println("Entre com os dados do retangulo: ");
		System.out.print("Altura: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Largura: ");
		retangulo.largura = sc.nextDouble();
		
		//System.out.println("Dados do produto: " + product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		System.out.println(retangulo);
		
		sc.close();
	}

}
