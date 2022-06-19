public class ProdutoTelefone implements Produto{

    private String nome;
    private float preco;
    private float valorFrete;

    private float precoTotal;

    public ProdutoTelefone(String nome, float preco, float valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.valorFrete = valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirValorTelefone(this);
    }

    public void calcularValor(ProdutoTelefone produtoTelefone){
        this.precoTotal = produtoTelefone.getPreco() + this.valorFrete;
    }

}
