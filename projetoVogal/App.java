package com.caio.projetoVogal;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner leia = new Scanner(System.in);
    	String frase="", vogal="", consoante="";
    	    	
        System.out.println( "Digite a frase: " );
        frase = leia.nextLine();
        
        vogal = frase.replaceAll("[^AEIOUaeiou ]","");
        consoante = frase.replaceAll("[AEIOUaeiou]","");
        
        System.out.println();
        System.out.println( "SOMENTE VOGAIS: " + vogal );
        System.out.println( "Digite a frase: " + consoante );
        
    }
}
