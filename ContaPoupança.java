class ContaPoupanca extends Conta {
    public ContaPoupanca(String n, String a, String t, double s) { super(n, a, t, s); }
    @Override
    public double calcularTarifaMensal() { return 0.0; }
}


