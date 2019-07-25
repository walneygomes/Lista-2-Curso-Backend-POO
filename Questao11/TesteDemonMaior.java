package Questao11;

import java.util.Scanner;

public abstract class TesteDemonMaior {

	public static void main(String[] args) {
		ConversorNumero numero = new ConversorNumero();
		Scanner teclado = new Scanner(System.in);
		int k = teclado.nextInt();
		int n = teclado.nextInt();
		System.out.print("VALOR:" + numero.maiorMultiplo(k, n));

	}

}
