package Udemy;

import java.util.Scanner;

public class Exerfor06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x = 0;
	    int f = 1;
	    double resto = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();	    
		for (int i = 1; i <= x; i++) {
	        resto = x % i;
	        if (resto == 0) {
	        	System.out.println(i);
	        }
		}
	}
}
