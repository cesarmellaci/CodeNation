package Udemy;

import java.util.Scanner;

public class Exerfor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int inteiro = 0;
		int divisor = 0;
		double resultado = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		for (int i = 0; i < x ; i++) {
			inteiro = sc.nextInt();
			divisor = sc.nextInt();
			if (divisor != 0) {
				resultado = (inteiro / divisor);
				System.out.printf("%.1f%n",resultado);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();
	}

}
