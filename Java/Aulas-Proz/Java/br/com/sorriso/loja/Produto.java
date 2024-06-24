package br.com.sorriso.loja;

public class Produto {
    private String nome, codigo;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, String codigo, double preco, int quantidadeEmEstoque){
        if (nome.isEmpty()){
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }
        this.nome = nome;

        if (codigo.isEmpty()) {
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }
        this.codigo = codigo;

        if (preco <= 0){
            throw new IllegalArgumentException("Coloque um valor maior do que zero.");
        }
        this.preco = preco;

        if (quantidadeEmEstoque < 0){
            throw new IllegalArgumentException("Coloque um valor maior ou igual a zero.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()){
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.isEmpty()){
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0){
            throw new IllegalArgumentException("Coloque um valor maior do que zero.");
        }
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0){
            throw new IllegalArgumentException("Coloque um valor maior ou igual a zero.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
