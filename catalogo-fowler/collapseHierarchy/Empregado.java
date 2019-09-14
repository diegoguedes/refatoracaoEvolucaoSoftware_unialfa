package collapseHierarchy;

import java.math.BigDecimal;

public abstract class Empregado {
	private String nome;
	private BigDecimal salario;

	
	public Empregado(String nome, BigDecimal salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public abstract BigDecimal calcularSalario();
}
