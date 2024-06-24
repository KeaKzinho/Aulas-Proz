package br.com.zorp.pessoa;

public class ContaPoupanca extends Conta {
    public void calcularJuros() {
        double taxaFixa = 0.1;
        double juros = saldo * taxaFixa;
        saldo += juros;
        System.out.printf("Os juros de %.0f /100 foram adicionados em seu saldo. %n", taxaFixa * 100);
    }

    public void calcularJuros(double taxa) {
        if (taxa > 0) {
            double juros = saldo * taxa;
            saldo += juros;
            System.out.printf("Os juros de %.0f /100 foram adicionados em seu saldo. %n", taxa * 100);
        } else {
            throw new IllegalArgumentException("A taxa de juros deve ser maior que 0. %n");
        }
    }
}

