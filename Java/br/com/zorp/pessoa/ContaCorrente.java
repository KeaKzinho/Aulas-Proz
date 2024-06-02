package br.com.zorp.pessoa;
class ContaCorrente extends Conta{
    
    @Override
    public void cobrarTaxa() {
        double taxaFixa = 20.0;
        if (saldo >= taxaFixa) {
            saldo -= taxaFixa;
            System.out.printf("A taxa fixa de R$ %.2f foi cobrada. %n", taxaFixa);
        } else {
            System.out.printf("Saldo insuficiente para cobrar a taxa fixa. %n");
        }
    }
    
    public void cobrarTaxa(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("A taxa de R$ %.2f foi cobrada. %n", valor);
        } else if (valor <= 0) {
            throw new IllegalArgumentException("O valor da taxa deve ser maior que 0. %n");
        } else {
            System.out.printf("Saldo insuficiente para cobrar a taxa de R$ %.2f %n", valor);
        }
}
}

