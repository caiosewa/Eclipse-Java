package com.caio.projetoLogin;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	String usuarioG,senhaG,usuarioL,senhaL;
    	Scanner leia = new Scanner(System.in);
    	
        System.out.println( "Crie um usuário: " );
        usuarioG = leia.nextLine();
        
        System.out.println( "Crie uma senha: " );
        senhaG = leia.nextLine();
        
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        
        
        System.out.println( "Digite o usuário: " );
        usuarioL = leia.nextLine();
        
        System.out.println( "Digite a senha: " );
        senhaL = leia.nextLine();
        
        if(usuarioL.equals(usuarioG) && senhaL.equals(senhaG) ) {
        	System.out.println( "Login feito com sucesso!!" );      	
        } else{
        	System.out.println( "Usuário ou senha incorretos!" );
        }
        
    }
}
