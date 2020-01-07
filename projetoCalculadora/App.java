package com.caio.projetoCalculadora;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n1, n2, soma, sub, mult, div;
		int op = 0;

		System.out.print("Digite o primeiro valor: ");
		n1 = leia.nextFloat();

		System.out.print("Digite o segundo valor: ");
		n2 = leia.nextFloat();

		while (op != 1 && op != 2 && op != 3 && op != 4) {

			System.out.println("1- Soma");
			System.out.println("2- Subtração");
			System.out.println("3- Multiplicação");
			System.out.println("4- Divisão");
			System.out.print("Digite uma opcão: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				soma = n1 + n2;
				System.out.println("Soma de " + n1 + " e " + n2 + " = " + soma );
				break;
			case 2:
				sub = n1 - n2;
				System.out.println("Subtração de " + n1 + " e " + n2 + " = " + sub );
				break;
			case 3:
				mult = n1 * n2;
				System.out.println("Multiplicação de " + n1 + " e " + n2 + " = " + mult );
				break;
			case 4:
				div = n1 / n2;
				System.out.println("Divisão de " + n1 + " e " + n2 + " = " + div );
				break;
			default:
				System.out.println("Opção inválida!!");
				break;
			}
		}

	}
}
