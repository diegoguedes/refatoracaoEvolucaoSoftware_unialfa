package collapseHierarchy;

import java.math.BigDecimal;

public class Vendedor extends Empregado {
	private BigDecimal comissao;

	public Vendedor(String nome, BigDecimal salario, BigDecimal comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}

	public BigDecimal getComissao() {
		return comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}

	public BigDecimal calcularSalario() {
		return this.getSalario().add(comissao);

	}
}
