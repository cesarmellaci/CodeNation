package Udemy;

import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, resultado;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		resultado = (a * b - c * d);
		System.out.println("O valor da diferença é igual a : " + resultado);
		sc.close();
	}

}
