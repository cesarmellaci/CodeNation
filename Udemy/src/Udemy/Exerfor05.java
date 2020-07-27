package Udemy;

import java.util.Scanner;

public class Exerfor05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x = 0;
	    int f = 1;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();	    
		for (int i = 1; i <= x; i++) {
	        f *= i;
	    }
		System.out.println(f);
	}

}
