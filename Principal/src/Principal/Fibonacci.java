package Principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> sequencia = new ArrayList<>();
		
		int a = 0, b = 1;
		int x;
		int[] f = new int[50];
        
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
		mostrar(sequencia);
	}
	
	public static void mostrar(ArrayList<Integer> sequencia) {
		  for (Integer item : sequencia)
		    System.out.printf(" %s", item);
		    System.out.println();
	}	
}
