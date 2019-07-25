package Questao02;

import java.util.Scanner;

public class TesteInteiro {
	private static void tabelaPrint(String args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(args);
		}
	}

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		System.out.print("Digite um numero:");
		int teclado = (int) dado.nextInt();
		Inteiro inteiro = new Inteiro();
		inteiro.setNumero(teclado);

		System.out.println("UNIDADE");
		System.out.println(inteiro.valorUnidade());
		System.out.println("DEZENA");
		System.out.println(inteiro.valorDezena());
		System.out.println("Centena");
		System.out.print(inteiro.valorCentena());

	}

}
