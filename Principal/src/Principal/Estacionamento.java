package Principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Estacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Estacionamento novoEstacionamento = new Estacionamento();
			System.out.println(novoEstacionamento.Verificar(100));
	}

	public boolean Verificar(int valorNumero) {
		boolean variavel = true;

		ArrayList<Integer> sequencia = new ArrayList<>();
		
		int a = 0, b = 1;
		int x;
		int[] f = new int[10];
		
		for (int c = 0; c < 40; c++) {
			if (c > 0) {
				if ((c % 2) == 0 ) {
					if (b < 350) {
						sequencia.add(b);
					}
					f[c] = b;
					x = a+b;
					b = x;
				} else {
					if (a < 350) {
						sequencia.add(a);
					}
					f[c] = a;
					x = a+b;
					a = x;
				}
				if (f[c] > 350) {
					break;
				}
			}
	    }
		if (sequencia.contains(valorNumero)) {
			return true;
		} else {  
			return false;
		}
	}
}
