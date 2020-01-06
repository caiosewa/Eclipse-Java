package com.caio.projetoComparacoes;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner leia = new Scanner(System.in);
    	
    	float n1, n2;
    	
        System.out.println( "-------- Mostrador de relacionamentos ---------" );
        System.out.println();
        
        System.out.print( "Digite o primeiro número: " );
        n1 = leia.nextFloat();
        
        System.out.print( "Digite o segundo número: " );
        n2 = leia.nextFloat();
        
        
        System.out.println();
        System.out.println( "Igual = " + (n1 == n2) );
        System.out.println( "Não igual = " + (n1 != n2) );
        System.out.println( "Maior = " + (n1 > n2) );
        System.out.println( "Menor = " + (n1 < n2) );
        System.out.println( "Maior ou igual = " + (n1 >= n2) );
        System.out.println( "Menor ou igual = " + (n1 <= n2) );
        
    }
}
