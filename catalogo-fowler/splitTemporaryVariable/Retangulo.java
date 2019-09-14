package splitTemporaryVariable;

public class Retangulo {
	private double altura;
	private double largura;

	public void calcular() {
		double temp = 2 * (altura + largura);
		System.out.println(temp);
		temp = altura * largura;
		System.out.println(temp);
	}
}
