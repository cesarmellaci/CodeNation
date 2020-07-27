package Udemy;

import java.util.Scanner;

public class Exerfor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		for (int i = 0; i <= x ; i++) {
			if ((i % 2) != 0) {  
				System.out.println(i);
			}
		}
		sc.close();
	}

}
