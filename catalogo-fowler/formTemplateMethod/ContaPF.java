package formTemplateMethod;

public class ContaPF {

    private double saldo;
    private String titular;

    public ContaPF(String titular, double saldoInicial) {
        this.titular = titular;
        saldo = saldoInicial;
    }

    public void saca(double valor) {
        saldo -= valor + 0.1;
    }

    public void deposita(double valor) {
        saldo += valor - 0.1;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}