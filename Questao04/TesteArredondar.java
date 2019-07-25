package Questao04;

public class TesteArredondar {

	public static void main(String[] args) {
		Arrendondador arredon = Arrendondador.intanciar();

		arredon.setNumero(3.944);
		System.out.println(arredon.tratarNumero());

	}

}
