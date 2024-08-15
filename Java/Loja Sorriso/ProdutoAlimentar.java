package br.com.sorriso.loja;

public class ProdutoAlimentar extends Produto{
    private String dataValidade;

    public ProdutoAlimentar(String nome, String codigo, double preco, int quantidadeEmEstoque, String dataValidade){
        super(nome, codigo, preco, quantidadeEmEstoque);


        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        if (dataValidade.isEmpty()){
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }
        this.dataValidade = dataValidade;
    }
}
