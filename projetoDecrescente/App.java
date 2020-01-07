package com.caio.projetoDecrescente;


import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner leia = new Scanner(System.in);
    	int i,j = 3,a=0;
    	int n[] = new int[j];

    	for (i=0;i<j;i++) {
    		System.out.print("Digite o " + (i+1) + "º valor: ");
    		n[i] = leia.nextInt();	
    	}
    	
    	Arrays.sort(n);

    	/**for (j=2;j>=0;j--) {
    		for (i=0;i<j;i++) {
    			if (n[i] > n[i+1]){
    				a = n[i];
    				n[i] = n[i+1];
    				n[i+1] = a;		
    			}
    		}
    	}**/
    	
    	System.out.println();
    	
    	for (i=j-1;i>=0;i--) {
    		System.out.println(n[i]);
    		
    	}
    
    }
}
