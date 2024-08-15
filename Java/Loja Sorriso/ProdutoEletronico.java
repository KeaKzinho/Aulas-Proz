package br.com.sorriso.loja;

public class ProdutoEletronico extends Produto {
    private String garantiaMeses;

    public ProdutoEletronico(String nome, String codigo, double preco, int quantidadeEmEstoque, String garantiaMeses){
        super(nome, codigo, preco, quantidadeEmEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    public String getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(String garantiaMeses) {
        if (garantiaMeses.isEmpty()){
            throw new IllegalArgumentException("Preencha com alguma informação.");
        }
        this.garantiaMeses = garantiaMeses;
    }
}
