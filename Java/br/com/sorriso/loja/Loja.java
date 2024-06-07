package br.com.sorriso.loja;

public class Loja{
    private Produto[] produtos;
    private int contador;

    public Loja(int indiceProduto){
        produtos = new Produto[indiceProduto];
    }

    public void adicionarProduto(Produto produto) {
        produtos[contador] = produto;
        contador++;
    }

    public void listarProdutos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(produtos[i].getNome());
        }
    }
}
