package com.caio.projetoComissao;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner leia = new Scanner(System.in);
    	
    	int idVendedor, idPeca, qtdPeca;
    	float valorPeca;
    	double comissao, taxaComissao= 0.05;
    	
        System.out.print( "Digite a identificação do vendedor: " );
        idVendedor = leia.nextInt();
        
        System.out.print( "Digite o ID da Peça: " );
        idPeca = leia.nextInt();
        
        System.out.print( "Digite o preço unitário da peça: " );
        valorPeca = leia.nextInt();
        
        System.out.print( "Digite a quantidade de peças vendidas: " );
        qtdPeca = leia.nextInt();
        
        comissao = (valorPeca * qtdPeca) * taxaComissao;
        System.out.print( "O valor da comissao é de " + comissao + " reais. " );
    }
}
