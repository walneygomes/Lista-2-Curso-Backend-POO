package Questao01;

import java.util.ArrayList;

public class Inteiro {
	private static final int CETENA = 3;
	private static final int DEZENA = 2;
	private static final int UNIDADE = 1;

	private int numero;

	public int quantidadeDigitos() {

		return Integer.toString(this.getNumero()).length();
	}

	public int valorUnidade() {

		return converterCDU("unidade");

	}

	public int valorCentena() {

		return converterCDU("cetena");

	}

	public int valorDezena() {

		return converterCDU("dezena");

	}

	private int converterCDU(String cdu) {
		String[] unidades = (Integer.toString(this.getNumero()).split(""));
		int valor = 0;

		if ("unidade".equals(cdu) && unidades.length >= 1) {
			valor = Integer.valueOf(unidades[unidades.length - this.UNIDADE]);

		} else if ("dezena".equals(cdu) && unidades.length >= 2) {
			valor = Integer.valueOf(unidades[unidades.length - this.DEZENA]);

		} else if ("cetena".equals(cdu) && unidades.length >= 3) {
			valor = Integer.valueOf(unidades[unidades.length - this.CETENA]);

		}

		return valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
