package Exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		// Fa�a um algoritmo que calcule e apresente o valor do volume de uma lata de
		// �leo, dado
		// seu raio e sua altura.

		Scanner sc = new Scanner(System.in);

		final double PI = 3.14;
		double raio;
		double volume;
		double altura;

		System.out.println("Informe o raio e altura da lata de �leo: ");

		raio = sc.nextDouble();
		altura = sc.nextDouble();

		volume = PI * (raio * 2) * altura;

		System.out.println("O volume da lata � " + volume);

		sc.close();

	}

}
