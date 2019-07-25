package Questao12;

import java.util.Scanner;

public class TesteJanela {

	public static void main(String[] args) {
		Janela janela = new Janela();
		Scanner dado = new Scanner(System.in);
		int informacaoSuperiorEsquerdo = dado.nextInt();
		int informacaoSuperior = dado.nextInt();

		int[] superior = { informacaoSuperiorEsquerdo, informacaoSuperior };
		janela.setSuperior(superior);

		int informacaoInferiorDireito = dado.nextInt();
		int informacaoInferior = dado.nextInt();

		int[] inferior = { informacaoInferiorDireito, informacaoInferior };
		janela.setInferior(inferior);

		System.out.print(" Tamanho " + janela.tamanhoJanela());
	}

}
