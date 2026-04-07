public abstract class Conta {
    public String numero;
    public String agencia;
    public String titular;
    public double saldo;

    public Conta(String numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    public abstract double calcularTarifaMensal();
}
