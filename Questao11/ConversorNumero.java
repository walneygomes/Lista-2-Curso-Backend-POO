package Questao11;

public class ConversorNumero {
	public int maiorMultiplo(int k, int n) {

		int valor = 0;
		int[] valores = gerarTabela(k, n);
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > n) {
				valor = valores[i - 1];
				i = valores.length;
			}
		}
		return valor;
	}

	private int[] gerarTabela(int k, int n) {
		int[] valores = new int[n];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = (i + 1) * k;
		}
		return valores;
	}

}
