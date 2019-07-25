package Questao04;

public class Arrendondador {
	private double numero;

	private static Arrendondador instance = null;

	private Arrendondador() {
		System.out.println("ARRENDONDADOR 2019");
	}

	public static Arrendondador intanciar() {
		if (instance == null) {
			instance = new Arrendondador();

		}
		return instance;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public double tratarNumero() {
		double valor = (int) this.getNumero();

		if ((this.getNumero() - valor) > 0.7) {
			valor = valor + 1;
		} else if (((this.getNumero() - valor) >= 0.3 && ((this.getNumero() - valor) <= 0.6))) {
			valor = this.getNumero() + 0.5;
		} else if ((this.getNumero() - valor) < 0.3) {
			valor = this.getNumero();
		}

		return valor;
	}

}
