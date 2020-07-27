package Udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Empregado;

public class ExerList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Empregado> list = new ArrayList<>();
		
		System.out.println("Quantos empregados serão adicionados?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Informe o id do empregado: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Informe outro id de empregado, o mesmo já existe");
				id = sc.nextInt();
			}  
			System.out.println("Informe o nome do empregado: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe o salario do empregado: ");
			double salario = sc.nextDouble();
			list.add(new Empregado(id, nome, salario));
		}

		System.out.println(" ");
		System.out.println("Informe o id do empregado que ganhará aumento: ");
		int id = sc.nextInt();
		Empregado result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (result == null) {
			System.out.println("Id de empregado inválido");
		} else {
			System.out.println("Informe o valor do percentual: ");
			double porcentagem = sc.nextDouble();
			result.aumentarSalario(porcentagem);
			//Empregado.aumentarSalario(porcentagem);
			//Empregado.class
		}
		
		System.out.println(" ");
		System.out.println("Lista de empregados cadastrados: ");
		for (Empregado obj : list) {
			System.out.println(obj);
		}
		sc.close();

	}

	private static boolean hasId(List<Empregado> list, int id) {
		// TODO Auto-generated method stub
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
