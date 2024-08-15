public class Produto {
    private String nome, codigoBarras, tipo, marca, validade;
    private double valor;
    private int quantidade;

    public void verificacaoString(String valor){
        if (valor.isEmpty()){
            throw new IllegalArgumentException("Coloque alguma informação");
        }
    }

    public void verificacaoDouble(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Coloque algum valor maior ou igual a 0.");
        }
    }

    public void verificacaoInteiro(int valor){
        if (valor < 0){
            throw new IllegalArgumentException("Coloque algum valor maior ou igual a 0.");
        }
    }

    public Produto(String nome, String codigoBarras, String tipo, String marca, String validade, double valor, int quantidade) {
        verificacaoString(nome);
        this.nome = nome;
        verificacaoString(codigoBarras);
        this.codigoBarras = codigoBarras;
        verificacaoString(tipo);
        this.tipo = tipo;
        verificacaoString(marca);
        this.marca = marca;
        verificacaoString(validade);
        this.validade = validade;
        verificacaoDouble(valor);
        this.valor = valor;
        verificacaoInteiro(quantidade);
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        verificacaoString(nome);
        this.nome = nome;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        verificacaoString(codigoBarras);
        this.codigoBarras = codigoBarras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        verificacaoString(tipo);
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        verificacaoString(marca);
        this.marca = marca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        verificacaoString(validade);
        this.validade = validade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        verificacaoDouble(valor);
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        verificacaoInteiro(quantidade);
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        System.out.printf("""
                Nome: %s
                Código de barras: %s
                Tipo: %s
                Marca: %s
                Validade: %s
                Valor: %.2f
                Quantidade: %d
                """, this.nome, this.codigoBarras, this.tipo, this.marca, this.validade, this.valor, this.quantidade);
    }

}
