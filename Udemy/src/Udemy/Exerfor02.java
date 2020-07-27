package Udemy;

import java.util.Scanner;

public class Exerfor02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int n = 0;
		int in, out;
		in = 0;
		out = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		for (int i = 0; i < x ; i++) {
			n = sc.nextInt();
			if (n >= 10 && n <= 20) {  
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}
}
