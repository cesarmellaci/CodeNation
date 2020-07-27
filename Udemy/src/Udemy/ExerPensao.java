package Udemy;

import java.util.Scanner;

import Entidades.Pensao;

public class ExerPensao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Pensao[] pensao = new Pensao[10];
	
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Informe o nome da pessoa: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe o e-mail da pessoa: ");
			String email = sc.nextLine();
			System.out.println("Informe o número do quarto a ser alugado: ");
			int quarto = sc.nextInt();
			pensao[quarto] = new Pensao(nome, email);
		}

		System.out.println(" ");
		System.out.println("Quartos ocupados: ");
		for (int i=0; i<10; i++) {
			if (pensao[i] != null) {
				System.out.println(i + " " + pensao[i]);
			}
		}
		sc.close();
	}

}
