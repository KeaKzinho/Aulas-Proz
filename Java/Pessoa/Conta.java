package br.com.zorp.pessoa;
class Conta{
    protected String agencia;
    protected String numeroDaConta;
    protected String nomeDoTitular;
    protected double saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia){
        if(agencia.isEmpty()){
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }
        this.agencia = agencia;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;   
    }

    public void setNumeroDaConta(String numeroDaConta) {
        if(numeroDaConta.isEmpty()){
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }

        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        if(nomeDoTitular.isEmpty()){
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }

        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo<0){
            throw new IllegalArgumentException("Coloque um valor igual ou maior do que zero.");
        }

        this.saldo = saldo;
    }

    public double depositar(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Coloque um valor maior do que zero.");
        }

        saldo += valor;
        return saldo;
    }

    public void mostrarDados(){
        System.out.printf("""
                Agência: %s
                Número da conta: %s
                Nome do títular: %s
                Saldo: %.2f 
                """, agencia, numeroDaConta, nomeDoTitular, saldo);
    }

    public void cobrarTaxa(){
        System.out.println("A taxa foi cobrada.");
    }
}
