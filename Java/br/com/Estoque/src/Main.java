import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Estoque Principal");

        Produto p1 = new Produto("Gloss Labial", "53983", "Batom", "OBoticário", "12/12/2025", 15.0, 150);
        Produto p2 = new Produto("Creme hidratante facial", "98364", "Creme", "Eudora", "01/01/2026", 25.0, 100);
        Produto p3 = new Produto("Blush Rosa", "45678", "Blush", "Avon", "20/03/2025", 15.0, 200);
        Produto p4 = new Produto("Lapis Retratil", "53242", "Lapis", "Mary Kay", "12/07/2026", 40.0, 200);

        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);
        estoque.adicionarProduto(p4);

        List<Produto> produtosPorNome = estoque.filtrarPorNome("Blush Rosa");
        for (Produto produto : produtosPorNome) {
            produto.exibirDetalhes();
        }

        System.out.println("----------------------------------");

        List<Produto> produtosPorCodigoBarras = estoque.filtrarPorCodigoBarras("45678");
        for (Produto produto : produtosPorCodigoBarras) {
            produto.exibirDetalhes();
        }

        System.out.println("----------------------------------");

        List<Produto> produtosPorTipo = estoque.filtrarPorTipo("Batom");
        for (Produto produto : produtosPorTipo) {
            produto.exibirDetalhes();
        }

        System.out.println("----------------------------------");

        // Listando produtos com quantidade zerada:
        List<Produto> produtosZerados = estoque.listarProdutosZerados();
        for (Produto produto : produtosZerados) {
            produto.exibirDetalhes();
        }

        System.out.println("----------------------------------");

        // Calculando o valor total do estoque:
        double valorTotalEstoque = estoque.calcularValorTotalEstoque();
        System.out.println("Valor total do estoque: R$ " + valorTotalEstoque);
    }
}
