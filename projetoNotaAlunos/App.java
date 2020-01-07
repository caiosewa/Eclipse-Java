package com.caio.projetoNotaAlunos;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Integer qtd = 0, i, n7 = 0, n5 = 0;
		float media, a = 0;

		System.out.println("Digite a quantidade de alunos: ");
		qtd = leia.nextInt();
		float notas[] = new float[qtd];

		for (i = 0; i < qtd; i++) {
			System.out.println("Digite a nota do" + (i + 1) + "º alunos: ");
			notas[i] = leia.nextFloat();
			a = a + notas[i];

			if (notas[i] > 7) {
				n7 = n7 + 1;
			} else if (notas[i] > 5) {
				n5 = n5 + 1;
			}
		}

		if(n7 == 0 && n5 == 0) {
			System.out.println("Nenhum aluno tirou mais que 5!");
		} else {
			System.out.println("Alunos que tiraram mais que 7: " + n7);
		}
		
		media = a / (notas.length);
		System.out.println("Média aritmética das notas: " + media);


	}
}
