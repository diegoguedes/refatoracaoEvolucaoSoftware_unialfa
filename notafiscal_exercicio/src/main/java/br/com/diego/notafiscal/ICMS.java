package br.com.diego.notafiscal;

import java.math.BigDecimal;

public class ICMS extends Imposto{

	@Override
	public BigDecimal valorImposto() {
		return new BigDecimal(0.11);
	}

}
