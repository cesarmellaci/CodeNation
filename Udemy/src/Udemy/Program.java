package Udemy;

import java.util.Scanner;
import Udemy.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome do produto: ");
		product.name = sc.nextLine();
		System.out.print("Informe o preço do produto: ");
		product.price = sc.nextDouble();
		System.out.print("Informe a quantidade do produto: ");
		product.quantity = sc.nextInt();
		
		//System.out.println("Dados do produto: " + product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.print("Informe a quantidade de produtos a ser adicionado ao estoque: ");
		int quantity2 = sc.nextInt();
		product.addProducts(quantity2);
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.print("Informe a quantidade de produtos a ser removido do estoque: ");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		
		System.out.println();
		System.out.println(product);
		
		sc.close();
	}
}
