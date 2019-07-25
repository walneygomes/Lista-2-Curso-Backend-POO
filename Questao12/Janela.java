package Questao12;

public class Janela {
	private static final int TAM = 2;
	private int[] superior = new int[this.TAM];
	private int[] inferior = new int[this.TAM];

	public int tamanhoJanela() {
		return this.getSuperior()[0] * this.getSuperior()[1] + this.getInferior()[0] * this.getInferior()[1];

	}

	public int[] getSuperior() {
		return superior;
	}

	public void setSuperior(int[] superior) {
		this.superior = superior;
	}

	public int[] getInferior() {
		return inferior;
	}

	public void setInferior(int[] inferior) {
		this.inferior = inferior;
	}

}
