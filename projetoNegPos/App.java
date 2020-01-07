package com.caio.projetoNegPos;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i,esc = 3 ;

		boolean sair = false;

		do {

			System.out.print("Digite um número qualquer: ");
			i = leia.nextInt();

			if (i >= 0) {
				System.out.println("O número é Positivo!");
			} else {
				System.out.println("O número é Negativo!");
			}
			
			System.out.println();
						
			while(esc!=0 && esc!=1) {
			System.out.println("Deseja sair?");
			System.out.println("0 - Não");
			System.out.println("1 - Sim");
			esc = leia.nextInt();
			
			switch (esc) {
			case 0:
				sair = false;
				break;
			case 1:	
				sair = true;
				break;
			default:
				sair = false;
				System.out.println("Valor incorreto!! Digite novamente..");
				break;
			}
			}
			
			System.out.println();
			esc = 3;
			
		} while (sair == false);

	}
}
