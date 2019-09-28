package br.com.diego.notafiscal;

import java.math.BigDecimal;

public class ISS extends Imposto{

	@Override
	public BigDecimal valorImposto() {
		return new BigDecimal(0.1);
	}

}
