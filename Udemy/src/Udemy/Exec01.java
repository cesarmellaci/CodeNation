package Udemy;

import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("O valor da soma dos n�meros digitados � igual a : " + c);
		sc.close();
	}

}