package Questao05;

public class FactoryConversor {
	public Conversor criarConversor(String tipo) {
		Conversor objeto = null;
		if ("Maiuscula".equals(tipo)) {
			objeto = new ConversorMaiuscula();

		} else if ("Minuscula".equals(tipo)) {
			objeto = new ConversorMinuscula();
		}
		return objeto;

	}

}
