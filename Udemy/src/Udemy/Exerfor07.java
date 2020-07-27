package Udemy;

import java.util.Scanner;

public class Exerfor07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x = 0;
	    int linha = 0;
	    int quadrado = 0;
	    int cubo = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();	    
		for (int i = 1; i <= x; i++) {
	        quadrado = i * i;
	        cubo = i * i * i;
	        System.out.println(i + " " + quadrado + " " + cubo);
		}
	}
}
