package com.caio.projetoMultiplos;

public class App {
	public static void main(String[] args) {

		int i;

		for (i = 1; i <= 100; i++) {

			if (i % 10 == 0) {
				System.out.println(i +" é Múltiplo de 10.");
				
			} else {
				System.out.println(i);
			}

		}
	}
}
