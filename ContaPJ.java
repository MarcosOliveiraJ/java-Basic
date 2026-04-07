class ContaPJ extends Conta {
    public ContaPJ(String n, String a, String t, double s) { super(n, a, t, s); }

    @Override
    public void sacar(double valor) {
        double taxa = 1.50;
        if (valor > 0) {
            if (valor + taxa <= saldo) {
                saldo -= (valor + taxa);
                System.out.println("Saque PJ realizado com taxa de R$ 1,50.");
            } else {
                System.out.println("Saldo insuficiente para saque + taxa.");
            }
        }
    }

    @Override
    public double calcularTarifaMensal() { return 20.00; }
}

