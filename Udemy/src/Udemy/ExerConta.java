package Udemy;

import java.util.Scanner;
import Entidades.Conta;
import Util.ConversaoMoeda;

public class ExerConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Informe o proprietario da Conta: ");
		String nome = sc.nextLine();

		System.out.println("Informe o numero da Conta: ");
		int numconta = sc.nextInt();

		System.out.println("Será feito deposito inicial(s/n)?");
		char inicial = sc.next().charAt(0);
		
		if (inicial == 's') {
			System.out.println("Informe o valor do deposito inicial R$: ");
			double valor = sc.nextDouble();
			conta = new Conta(nome, numconta, valor);
		} else {
			conta = new Conta(nome, numconta);
		}

	//System.out.println("Dados do produto: " + product.name + ", " + product.price + ", " + product.quantity);
	
		System.out.println();
		System.out.println(conta);
		System.out.println();
		
		System.out.println("Informe o valor de deposito R$: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);

		System.out.println();
		System.out.println(conta);
		System.out.println();

		System.out.println("Informe o valor do saque R$: ");
		valor = sc.nextDouble();
		conta.saque(valor);

		System.out.println();
		System.out.println(conta);
		System.out.println();


		sc.close();

	}

}
