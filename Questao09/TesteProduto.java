package Questao09;

import java.util.Scanner;

public class TesteProduto {
	public static void main(String[] args) {
		Produto produtoUm = new Produto();
		Scanner teclado = new Scanner(System.in);
		double dadoUm = teclado.nextDouble();
		System.out.println("valor produto");
		produtoUm.setPreco(dadoUm);
		System.out.println("desconto do produto");
		dadoUm = teclado.nextDouble();
		produtoUm.setDesconto(dadoUm);

		System.out.println("valor com desconto é:" + produtoUm.desconto());

	}
}
