package Questao06;

import java.util.Scanner;

public class TesteMaiuscula {
	private static final int INDEX = 0;

	public static void main(String[] args) {

		FactoryConversor conversor = new FactoryConversor();
		Scanner dado = new Scanner(System.in);
		char informcao = dado.next().charAt(INDEX);
		Conversor con = conversor.criarConversor("Minuscula");
		con.setLetra(informcao);
		System.out.print(con.converter());
	}

}
