public class ProdutoVisitor implements Visitor{

    public String exibir(Produto produto){
        return produto.aceitar(this);
    }


    public String exibirValorLoja(ProdutoLoja produtoLoja){
        return "ProdutoLoja{" +
                "nome='" + produtoLoja.getNome() + '\'' +
                ", preco=" + produtoLoja.getPreco() +
                ", precoTotal=" + produtoLoja.getPrecoTotal() +
                '}';
    }

    public String exibirValorTelefone(ProdutoTelefone produtoTelefone){
        return "ProdutoTelefone{" +
                "nome='" + produtoTelefone.getNome() + '\'' +
                ", preco=" + produtoTelefone.getPreco() +
                ", valorFrete=" + produtoTelefone.getValorFrete() +
                ", precoTotal=" + produtoTelefone.getPrecoTotal() +
                '}';
    }

    public String exibirValorInternet(ProdutoSite produtoSite){
        return "ProdutoSite{" +
                "nome='" + produtoSite.getNome() + '\'' +
                ", preco=" + produtoSite.getPreco() +
                ", valorFrete=" + produtoSite.getValorFrete() +
                ", acrescimo=" + produtoSite.getAcrescimo() +
                ", precoTotal=" + produtoSite.getPrecoTotal() +
                '}';
    }

    public ProdutoSite calcularValorProdutoSite(ProdutoSite produtoSite){

        float precoTotal = produtoSite.getPreco() + produtoSite.getValorFrete() + produtoSite.getAcrescimo();
        produtoSite.setPrecoTotal(precoTotal);
        return produtoSite;
    }

    public ProdutoLoja calcularvalorProdutoLoja(ProdutoLoja produtoLoja){
        float precoTotal = produtoLoja.getPreco();
        produtoLoja.setPrecoTotal(precoTotal);
        return produtoLoja;
    }

    public ProdutoTelefone calcularValorProdutoTelefone(ProdutoTelefone produtoTelefone){
        float precoTotal = produtoTelefone.getPreco() + produtoTelefone.getValorFrete();
        produtoTelefone.setPrecoTotal(precoTotal);
        return produtoTelefone;
    }

}
