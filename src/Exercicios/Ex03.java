package Exercicios;

public class Ex03 {

	public static void main(String[] args) {

		// Dado o tamanho do raio de uma circunfer�ncia, calcular a �rea e o per�metro
		// da mesma.

		double PI = 3.14;
		int raio = 3;

		double area = PI * (raio * raio);
		System.out.println("A ar�a do circulo �: " + area);

		double perimetro = 2 * PI * raio;
		System.out.println("O perimetro do circulo �: " + perimetro);
	}

}
