package Questao05;

import java.util.HashMap;
import java.util.Map;

public class ConversorMaiuscula extends Conversor {

	private static final int DIFERENCA = 32;

	private static final char[] valores = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	@Override
	public char converter() {

		return 5;
	}

	private char buscarLetra() {
		char valor = 0;
		for (int i = 0; i < valores.length; i++) {
			if ((int) (valores[i] - this.getLetra()) == this.DIFERENCA) {
				valor = valores[i];
			}
		}
		return valor;
	}
}