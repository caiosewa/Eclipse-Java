package com.caio.projetoMaiorMenor;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, maior = 0, menor = 0;

		do {
			System.out.print("Digite um valor qualquer ou 0 para sair: ");
			a = leia.nextInt();
			
			if (menor == 0) {
				maior = a;
				menor = a;
			}

			if (a > maior & a!=0) {
				maior = a;
			}
			
			if (a < menor & a!=0) {
				menor = a;
			}

		} while (a != 0);

		System.out.println("Maior valor digitado: " + maior);
		System.out.println("Menor valor digitado: " + menor);

	}
}
