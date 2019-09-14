package replaceTempWithQuery;

public class Produto {
	private int quantidade;
	private int precoItem;

	double getPreco() {
		int precoBase = quantidade * precoItem;
		double fatorDesconto;
		if (precoBase > 1000)
			fatorDesconto = 0.95;
		else
			fatorDesconto = 0.98;
		return precoBase * fatorDesconto;
	}
}
