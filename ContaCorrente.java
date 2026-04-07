
class ContaCorrente extends Conta {
    public ContaCorrente(String n, String a, String t, double s) { super(n, a, t, s); }
    @Override
    public double calcularTarifaMensal() { return 12.00; }

}

