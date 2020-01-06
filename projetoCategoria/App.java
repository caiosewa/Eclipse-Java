package com.caio.projetoCategoria;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade;
		
		do {
		System.out.print("Digite a idade do nadador: ");
		idade = leia.nextInt();
		} while(idade<1);
			
		
		if (idade <= 4) {
			System.out.println("Sem categoria!");
		} else if (idade <= 7) {
			System.out.println("Infantil A = 5 a 7 anos");
		} else if (idade <= 11) {
			System.out.println("Infantil B = 8 a 11 anos");
		} else if (idade <= 13) {
			System.out.println("Juvenil A = 12 a 13 anos");
		} else if (idade <= 17) {
			System.out.println("Juvenil B = 14 a 17 anos");
		} else {
			System.out.println("Maiores de 18 anos");
		}
		
	}
}
