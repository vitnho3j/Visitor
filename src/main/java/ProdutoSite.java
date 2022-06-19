public class ProdutoSite implements Produto{

    private String nome;
    private float preco;
    private float valorFrete;

    private float acrescimo;

    private float precoTotal;

    public ProdutoSite(String nome, float preco, float valorFrete, float acrescimo) {
        this.nome = nome;
        this.preco = preco;
        this.valorFrete = valorFrete;
        this.acrescimo = acrescimo;
    }

    public float getAcrescimo() {
        return acrescimo;
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

    public float getValorFrete() {
        return valorFrete;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirValorInternet(this);
    }

    public void calcularValor(ProdutoSite produtoSite){
        this.precoTotal = produtoSite.getPreco() + valorFrete + acrescimo;
    }

}
