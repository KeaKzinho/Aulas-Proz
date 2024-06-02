package br.com.zorp.pessoa;
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaCorrente contacorrente = new ContaCorrente();
        ContaPoupanca contapoupanca = new ContaPoupanca();

        conta.setAgencia("80000-82");
        conta.setNumeroDaConta("4002-8922");
        conta.setNomeDoTitular("Keya");
        conta.setSaldo(1000);
        conta.depositar(30);
        conta.mostrarDados();

        contacorrente.setSaldo(conta.saldo);
        contacorrente.cobrarTaxa();
        contacorrente.cobrarTaxa(200);
        System.out.println(contacorrente.getSaldo());

        contapoupanca.setSaldo(conta.saldo);
        contapoupanca.calcularJuros();
        contapoupanca.calcularJuros(0.2);
        System.out.println(contapoupanca.getSaldo());
    }

}
