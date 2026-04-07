void main() {
    ContaCorrente contaCorrente = new ContaCorrente("780", "234", "sdtft", 237);
    ContaPoupanca contaPoupanca = new ContaPoupanca("209", "290", "jonas", 789);
    ContaPJ cpj = new ContaPJ("759", "720", "Igor", 890);

    System.out.println("Conta Corrente");
    contaCorrente.depositar(200);
    contaCorrente.sacar(2000);
    contaCorrente.calcularTarifaMensal();

    System.out.println("-------------------------------------");
    System.out.println("Conta Poupança");
    contaPoupanca.depositar(200);
    contaPoupanca.sacar(150);
    contaPoupanca.calcularTarifaMensal();

    System.out.println("-------------------------------------");
    System.out.println("Conta Pessoa Jurídica");
    cpj.depositar(100);
    cpj.sacar(20);
    cpj.calcularTarifaMensal();
}