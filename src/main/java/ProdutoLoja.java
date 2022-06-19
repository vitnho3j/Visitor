public class ProdutoLoja implements Produto{

    private String nome;
    private float preco;

    private float precoTotal;

    public ProdutoLoja(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public float getPreco() {
        return preco;
    }


    public String aceitar(Visitor visitor){
        return visitor.exibirValorLoja(this);
    }

    public void calcularValor(ProdutoLoja produtoLoja){
        this.precoTotal = produtoLoja.getPreco();
    }


}
