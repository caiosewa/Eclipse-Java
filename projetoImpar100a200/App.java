package com.caio.projetoImpar100a200;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1, n2, i, a;

		do {
			System.out.print("Digite dois valores entre 100 e 200: ");
			n1 = leia.nextInt();
			n2 = leia.nextInt();
			
		} while ((n1 < 100) || (n1 > 200) || (n2 < 100) || (n2 > 200));


		if (n2 < n1) {
			a = n2;
			n2 = n1;
			n1 = a;
		}

		for (i = n2; n1 <= i; n1++) {
			if (n1 % 2 != 0) {
				System.out.println(n1);
			}
		}
	}
}
