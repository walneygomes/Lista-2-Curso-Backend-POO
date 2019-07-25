package Questao10;

public class MediaTripla {

	private static final int TRIPLAR = 3;
	private double nota1, nota2, nota3;

	public double mediaCalcular() {
		return (this.nota1 + this.nota2 + this.nota3) / TRIPLAR;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

}
