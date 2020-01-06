package com.caio.projetoEstoque;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float estMin, estMax, estMed;
		

		System.out.print("Digite o estoque Mínimo: ");
		estMin = leia.nextInt();

		System.out.print("Digite o estoque Máximo: ");
		estMax = leia.nextInt();

		while (estMax < estMin) {
			System.out.print("Digite um valor maior para o estoque Máximo: ");
			estMax = leia.nextInt();
		}

		estMed = (estMin + estMax) / 2;

		System.out.println("Média do estoque= " + estMed);

	}
}
