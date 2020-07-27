package Udemy;

import java.util.Scanner;

public class Exerwhi01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int senha = 0;
		Scanner sc = new Scanner(System.in);
		while (senha != 2002) {
			senha = sc.nextInt();
			if (senha != 2002) {
				System.out.println("Senha inválida");
			}
		}
		sc.close();
	}
}
