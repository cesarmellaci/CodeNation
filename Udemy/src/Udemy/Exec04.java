package Udemy;

import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nf, ht; 
		double vr, salario;
		Scanner sc = new Scanner(System.in);
		nf = sc.nextInt();
		ht = sc.nextInt();
		vr = sc.nextDouble();
		salario = (ht * vr);
		System.out.println("O n�mero do funcion�rio � : " + nf);
		System.out.printf("O valor o salario � igual a R$ " + "%.2f%n",salario);
		sc.close();
	}

}
