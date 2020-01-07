package com.caio.projetoDezValor;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n[] = new int[10],i, a = 0;
		float j, b=0 ,md=0;

		for (i = 0; i <= 9; i++) {
			do {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			n[i] = leia.nextInt();
			} while(n[i] < 0);
		}

		Arrays.sort(n);
		
		System.out.println("O maior valor é " + n[9]);
		System.out.println("O menor valor é " + n[0]);

		for (i = 0; i <= 9; i++) {
			md = (b = n[i] + b)/(n.length);
		}
		
		System.out.println("A média dos valores é " + md);
		
	}
}
