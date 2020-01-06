package com.caio.projetoDias;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner leia = new Scanner(System.in);
    	
    	int anos, meses, dias, totalDias;
    	
    	System.out.println( "------- Calculadora de idade em dias --------" );
    	
        System.out.print( "Digite os anos: " );
        anos = leia.nextInt();
        
        do {
        System.out.print( "Digite os meses: " );
        meses = leia.nextInt();
        } while(meses<1 || meses>12);
        
        do {
        System.out.print( "Digite os dias: " );
        dias = leia.nextInt();
        } while(dias<1 || dias>30);
        
        totalDias = (anos*365) + (meses*30) + (dias);
        
        System.out.print( "Idade total em dias = " + totalDias );
        
    }
}
