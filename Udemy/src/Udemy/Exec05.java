package Udemy;

import java.util.Scanner;

public class Exec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod1, qtde1, cod2, qtde2; 
		double pr1, pr2, total;
		Scanner sc = new Scanner(System.in);
		cod1 = sc.nextInt();
		qtde1 = sc.nextInt();
		pr1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtde2 = sc.nextInt();
		pr2 = sc.nextDouble();
		
		total = ((qtde1 * pr1) + (qtde2 * pr2));
		System.out.printf("O valor total a pagar: R$ " + "%.2f%n",total);
		sc.close();
	}

}
