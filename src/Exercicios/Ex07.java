package Exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		// Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos,
		// meses e dias.

		Scanner sc = new Scanner(System.in);

		int umAno = 365;
		int umMes = 30;
		int dias, idadeEmDias, ano, mes;

		System.out.println("Informe sua idade em dias: ");

		idadeEmDias = sc.nextInt();

		ano = idadeEmDias / umAno;
		mes = ((idadeEmDias % umAno) / umMes);
		dias = ((idadeEmDias % umAno) % umMes);

		System.out.println("Sua idade é " + ano + " anos, " + mes + " meses e " + dias + " dias.");

		sc.close();

	}
}
