package com.caio.projetoAorB;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner leia = new Scanner(System.in);
    	float i,a=0,b=0;
    	
        System.out.println( "Digite um número: " );
        i = leia.nextFloat();
        
        if (i >= 0) {
			a = i;
		} else {
			b = i;
		}
        
        System.out.println( "A = " +  a  );
        System.out.println( "B = " +  b  );
        
    }
}
