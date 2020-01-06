package com.caio.projetoIdade;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	int i,j,d = 0;
		Scanner leia = new Scanner(System.in); // chamar o objeto de captura do teclado e associar a variavel (leitor)

		System.out.println("Digite a sua idade: ");
		i = leia.nextInt(); // Ler valor digitado do tipo inteiro e gravar na variavel (i)
		
		System.out.println("Digite a idade da sua mãe: ");
		j = leia.nextInt(); // Ler valor digitado do tipo inteiro e gravar na variavel (j)
		
		d = j-i; // calcular a diferença entre j e i
		System.out.printf("Minha mãe é "+ d +" anos mais velha que eu!!"); // apresentar na tela o resultado
    }
}
