package Exercicios;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {

		// Ler um número inteiro e exibir o seu sucessor.

		String numero;
		int num = 0;
		int antecessor = 0;
		int sucessor = 0;

		numero = JOptionPane.showInputDialog("Entre com o número");
		num = Integer.parseInt(numero);

		antecessor = num - 1;
		sucessor = num + 1;

		JOptionPane.showMessageDialog(null,
				" O antecessor de " + num + " é " + antecessor + "\n O sucessor de " + num + " é " + sucessor);

	}

}
