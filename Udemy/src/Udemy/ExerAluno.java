package Udemy;

import java.util.Scanner;

import Entidades.Aluno;
import Entidades.Funcionario;

public class ExerAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Entre com os dados do aluno: ");
		System.out.print("Nome: ");
		aluno.name = sc.nextLine();
		System.out.print("Primeira Nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Primeira Nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Primeira Nota: ");
		aluno.nota3 = sc.nextDouble();
		
		//System.out.println("Dados do produto: " + product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		System.out.println(aluno);
		System.out.println(aluno.verificar());
		if (aluno.verificar() == "Reprovado") {
			System.out.println("Falta " + aluno.falta() + " pontos");
		}
		System.out.println();

		sc.close();
	}

}
