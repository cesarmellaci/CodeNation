package Udemy;

import java.util.Scanner;

public class Exerwhi03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int combustivel = 0;
		int qtdealcool, qtdegasolina, qtdediesel;
		qtdealcool = 0;
		qtdegasolina = 0;
		qtdediesel = 0;
		Scanner sc = new Scanner(System.in);
		while (combustivel != 4) {
			combustivel = sc.nextInt();
			if (combustivel == 1) {
				qtdealcool += 1;
			} else if (combustivel == 2) {
				qtdegasolina += 1;
			} else if (combustivel == 3){
				qtdediesel += 1;
			}
		}
		sc.close();
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + qtdealcool);
		System.out.println("Gasolina: " + qtdegasolina);
		System.out.println("Diesel: " + qtdediesel);
	}

}
