package Questao10;

import java.util.Scanner;

public class TesteMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MediaTripla media = new MediaTripla();
		Scanner teclado = new Scanner(System.in);
		double dado = teclado.nextDouble();
		media.setNota1(dado);
		dado = teclado.nextDouble();
		media.setNota2(dado);
		dado = teclado.nextDouble();
		media.setNota3(dado);
		System.out.print("Sua media é:" + media.mediaCalcular());
	}

}
