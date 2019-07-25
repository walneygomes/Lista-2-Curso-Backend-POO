package Questao09;

public class Produto {
	private static final double TOTAL = 100;
	private double preco;
	private double desconto;

	public double desconto() {
		return this.desconto - (this.getDesconto() * TOTAL);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
