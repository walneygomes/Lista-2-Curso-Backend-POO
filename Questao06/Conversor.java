package Questao06;

public abstract class Conversor {
	private char letra;

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public abstract char converter();

}
