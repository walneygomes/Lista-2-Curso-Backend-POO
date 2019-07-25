package Questao13;

public class Circulo {
	private static final double PI = 3.1415;
	private static final int MULT = 2;
	private double raio;

	public double calcularArea() {
		return PI * (this.getRaio() * this.getRaio());
	}

	public double calcularPerimetro() {
		return MULT * PI * this.getRaio();
	}

	public double calcularDiametro() {
		return this.getRaio() * MULT * PI;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
