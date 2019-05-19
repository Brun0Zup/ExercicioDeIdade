package com.br.app.de.idade;

import java.util.Calendar;
import java.util.Scanner;

public class AppDeIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int dias = 0;
		int mes = 12*18;
		int anos = 18;
		 
	
		System.out.println("idade somente em anos: "+ 18);
		
		System.out.println("idade somente em meses: " + mes );
		
		System.out.println("idade somente em dias: ");
		
		int idade = (dias +(dias*365)+(mes*30));
		System.out.println("Sua idade é de:" + idade);

	}

}
