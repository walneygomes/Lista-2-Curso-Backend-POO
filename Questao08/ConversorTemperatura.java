package Questao08;

public class ConversorTemperatura {

	private double temperatura;
	private static final double DIVISOR = 5 / 3;
	private static final int VALOR = 32;

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double fahrenheiteConverter() {
		return DIVISOR * (this.getTemperatura() - VALOR);
	}
}
