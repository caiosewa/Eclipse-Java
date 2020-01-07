package com.caio.projetoOp;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float n1, n2, md;
		int op = 0;
		String sair = null;

		while (sair != "s") {

			System.out.print("Digite o primeiro valor: ");
			n1 = leia.nextFloat();

			System.out.print("Digite o segundo valor: ");
			n2 = leia.nextFloat();

			while (op != 1 && op != 2 && op != 3 && op != 4) {

				System.out.println("1- Verificar se um dos números lidos é ou não múltiplo do outro!");
				System.out.println("2- Verificar se os dois números lidos são pares!");
				System.out.println("3- Verificar se a média dos dois números é maior ou igual a 7!");
				System.out.println("4- Sair");
				System.out.print("Digite uma opcão: ");
				op = leia.nextInt();

				switch (op) {
				case 1:
					if (n1 % n2 == 0 || n2 % n1 == 0) {
						System.out.println("SIM, um dos números é múltiplo do outro!");
					} else {
						System.out.println("NAO, nenhum dos números é múltiplo do outro!");
					}
					break;
				case 2:
					if (n1 % 2 == 0 && n2 % 2 == 0) {
						System.out.println("SIM, os dois números são pares!");
					} else {
						System.out.println("NAO, os dois números não são pares!");
					}
					break;
				case 3:
					if ((n1 + n2) / 2 >= 7) {
						System.out.println("SIM, a média dos dois números é maior ou igual a 7!");
					} else {
						System.out.println("NAO, a média dos dois números não é maior ou igual a 7!");
					}
					break;
				case 4:
					sair = "s";
					break;
				default:
					System.out.println("Opção inválida!!");
					break;
				}
				
			}
			
			op = 0;
					
		}

	}

}
