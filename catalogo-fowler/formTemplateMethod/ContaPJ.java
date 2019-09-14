package formTemplateMethod;

public class ContaPJ {

    private double saldo;
    private String titular;

    public ContaPJ(String titular, double saldoInicial) {
        this.titular = titular;
        saldo = saldoInicial;
    }

    public void saca(double valor) {
        saldo -= valor + 0.2;
    }

    public void deposita(double valor) {
        saldo += valor - 0.2;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

