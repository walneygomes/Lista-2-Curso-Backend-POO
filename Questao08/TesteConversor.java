package Questao08;

import java.util.Scanner;

public class TesteConversor {
	public static void main(String[] args) {
		ConversorTemperatura tem = new ConversorTemperatura();

		Scanner dado = new Scanner(System.in);
		double informcao = dado.nextDouble();
		tem.setTemperatura(informcao);
		System.out.print(tem.fahrenheiteConverter());
	}

}
