package Udemy;

import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, c;
		double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		c = pi * (Math.pow(a, 2));
		System.out.printf("O valor do raio do circulo é igual a : " + "%.4f%n",c);
		//System.out.println("%.4f%n", c);
		sc.close();
	}
}