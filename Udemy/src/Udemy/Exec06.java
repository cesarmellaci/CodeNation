package Udemy;

import java.util.Scanner;

public class Exec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		double pi = 3.14159;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		triangulo = (a * c)/2;
		circulo = pi * (Math.pow(c,2));
		trapezio = ((a+b)*c)/2;
		quadrado = Math.pow(b,2);
		retangulo = a*b;
		System.out.printf("O valor do raio do triangulo é igual a : " + "%.3f%n",triangulo);
		System.out.printf("O valor do raio do circulo é igual a : " + "%.3f%n",circulo);
		System.out.printf("O valor do raio do trapezio é igual a : " + "%.3f%n",trapezio);
		System.out.printf("O valor do raio do quadrado é igual a : " + "%.3f%n",quadrado);
		System.out.printf("O valor do raio do retangulo é igual a : " + "%.3f%n",retangulo);
		//System.out.println("%.4f%n", c);
		sc.close();
	}

}
