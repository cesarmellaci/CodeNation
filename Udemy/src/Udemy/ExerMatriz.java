package Udemy;

import java.util.Scanner;

public class ExerMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantas linhas terá a matriz:");
		int linha = sc.nextInt();
		System.out.println("Informe quantas colunas terá a matriz:");
		int coluna = sc.nextInt();
		int r1, r2 = 0;
				
		int[][] mat = new int[linha][coluna];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
					System.out.println("Informe o dado da matriz na posicao " + i + ", " + j + ": ");
					mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe o valor que será pesquisado: ");
		int pesquisa = sc.nextInt();				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == pesquisa) {
					System.out.println("Posicao: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}					
					if (i < mat.length-1) {
						System.out.println("Baixo: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
