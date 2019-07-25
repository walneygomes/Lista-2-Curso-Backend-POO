package Questao06;

public class ConversorMinuscula extends Conversor {

	private static final int DIFERENCA = 32;

	private static final char[] valores = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
			'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	@Override
	public char converter() {

		return buscarLetra();
	}

	private char buscarLetra() {
		char valor = 0;
		for (int i = 0; i < this.valores.length; i++) {
			if (((int) (valores[i] - this.getLetra())) == this.DIFERENCA) {
				valor = valores[i];
			}
		}

		return valor;
	}

}
