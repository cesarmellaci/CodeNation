package Udemy;

import java.util.Scanner;

import Entidades.Funcionario;

public class ExerFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println("Entre com os dados do funcionario: ");
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		//System.out.println("Dados do produto: " + product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		System.out.println(funcionario);
		
		System.out.println();
		System.out.print("Informe a porcentagem que deverá aumentar o salario do funcionario: ");
		double porcentagem2 = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem2);

		System.out.println();
		System.out.println(funcionario);
		
		sc.close();
	}

}
