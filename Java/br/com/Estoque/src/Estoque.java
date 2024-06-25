import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String nome;
    private List<Produto> produtos;

    public void verificacaoString(String valor){
        if (valor.isEmpty()){
            throw new IllegalArgumentException("Coloque alguma informação");
        }
    }

    public Estoque(String nome){
        verificacaoString(nome);
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public void exibirDetalhesProduto(String codigoBarras) {
        for (Produto produto : produtos) {
            if (produto.getCodigoBarras().equals(codigoBarras)) {
                produto.exibirDetalhes();
                
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void venderProduto(String codigoBarras, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigoBarras().equals(codigoBarras)) {
                if (produto.getQuantidade() >= quantidade) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println("Venda realizada com sucesso.");
                } else {
                    System.out.println("Quantidade insuficiente em estoque.");
                }
               
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public List<Produto> filtrarPorNome(String nome) {
        List<Produto> filtrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                filtrados.add(produto);
            }
        }
        return filtrados;
    }

    public List<Produto> filtrarPorCodigoBarras(String codigoBarras) {
        List<Produto> filtrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCodigoBarras().equals(codigoBarras)) {
                filtrados.add(produto);
            }
        }
        return filtrados;
    }

    public List<Produto> filtrarPorTipo(String tipo) {
        List<Produto> filtrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getTipo().equals(tipo)) {
                filtrados.add(produto);
            }
        }
        return filtrados;
    }

    public List<Produto> listarProdutosZerados() {
        List<Produto> zerados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getQuantidade() == 0) {
                zerados.add(produto);
            }
        }
        return zerados;
    }

    public void exibirTodosProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getQuantidade() * produto.getValor();
        }
        return valorTotal;
    }
}
