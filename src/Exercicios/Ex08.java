package Exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		// Dado que a f�rmula para convers�o de Fahrenheit para Celsius � C = 5/9 (F �
		// 32), leu um
		// valor de temperatura em Fahrenheit e exibi-lo em Celsius

		Scanner sc = new Scanner(System.in);

		double Celsius;
		double Fahrenheit;

		System.out.println("Informe a temperatura em Fahrenheit: ");

		Fahrenheit = sc.nextInt();

		Celsius = (5 * (Fahrenheit - 32)) / 9;

		System.out.println("A temperatura em Celsius �: " + Celsius + " Celsius");
		
		sc.close();
	}

}
