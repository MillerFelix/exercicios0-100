package Exercicios;

public class Ex03 {

	public static void main(String[] args) {

		// Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro
		// da mesma.

		double PI = 3.14;
		int raio = 3;

		double area = PI * (raio * raio);
		System.out.println("A arêa do circulo é: " + area);

		double perimetro = 2 * PI * raio;
		System.out.println("O perimetro do circulo é: " + perimetro);
	}

}
