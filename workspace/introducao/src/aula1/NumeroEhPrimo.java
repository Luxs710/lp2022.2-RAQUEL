package aula1;

import java.util.Scanner;

public class NumeroEhPrimo {

	public static void main(String[] args) {
		int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
		Scanner sc = new Scanner(System.in);
		String prompt1 = "Qual numero voce quer testar? (numero entre 1 e 40) ";
		//equivale a String prompt1 = new String("Qual numero voce quer testar? (numero entre 1 e 40) ");
		System.out.println(prompt1);
		int numero = sc.nextInt();
		
		if(numero > 40 || numero < 0) {
			System.err.println("Digite um numero entre 1 e 40");
			System.exit(1);
		}
		
		if(numero == 1) {
			System.out.println("O numero " + numero + " eh primo!");
			System.exit(0);
		}
		
		for (int i = 0; i < primos.length; i++) {
			if(numero % primos[i] == 0 && numero != primos[i]) {
				System.out.println("O numero " + numero + " nao eh primo!");
				System.exit(0);
			}				
		}
		
		System.out.println("O numero " + numero + " eh primo!");
		
	}

}
