package com.caio.projetoCambio;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner leia = new Scanner(System.in);
    	
    	float cDolar, vDolar, vReal;
    	
        System.out.println( "--------- Conversor de Dolar em Real ---------" );
        
        System.out.print("Digite a cotação do Dolar: ");
        cDolar = leia.nextFloat();
        
        System.out.print("Digite o valor: ");
        vDolar = leia.nextFloat();
        
        vReal = cDolar * vDolar ;
        System.out.print("O valor em Reais é " + vReal);
        

    }
}
