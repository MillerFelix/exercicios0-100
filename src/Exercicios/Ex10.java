package Exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		// Converter um inteiro informado menor que 32 para sua representa��o em bin�rio

		Scanner sc = new Scanner(System.in);

		int numero;
		int r1;
		int r2;
		int r3;
		int r4;
		int r5;

		System.out.println("Informe um numero menos que 32, para ser convertido para um bin�rio");
		numero = sc.nextInt();

		r1 = numero % 2;

		r2 = r1 % 2;

		r3 = r2 % 2;

		r4 = r3 % 2;

		r5 = r4 % 2;

		System.out.println("O numero bin�rio �: " + r5 + r4 + r3 + r2 + r1);

		sc.close();

	}

}
