package Questao13;

import java.util.Scanner;

public class TesteCircuferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo circulo = new Circulo();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Raio");
		double raio = teclado.nextDouble();
		System.out.println("Diametro");
		System.out.println(circulo.calcularPerimetro());

		System.out.println("Circunferencia");
		System.out.println(circulo.calcularDiametro());

		System.out.println("Area Total");
		System.out.println(circulo.calcularArea());

	}

}
