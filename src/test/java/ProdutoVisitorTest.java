import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoVisitorTest {

    @Test
    void deveExibirInformacoesProdutoLoja(){
        ProdutoLoja produto = new ProdutoLoja("Camisa", 10);
        produto.calcularValor(produto);
        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("ProdutoLoja{nome='Camisa', preco=10.0, precoTotal=10.0}", visitor.exibirValorLoja(produto));
    }

    @Test
    void deveExibirInformacoesProdutoTelefone(){
        ProdutoTelefone produto = new ProdutoTelefone("Camisa", 10, 5);
        produto.calcularValor(produto);
        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("ProdutoTelefone{nome='Camisa', preco=10.0, valorFrete=5.0, precoTotal=15.0}", visitor.exibirValorTelefone(produto));
    }

    @Test
    void deveExibirInformacoesProdutoSite(){
        ProdutoSite produtoSite = new ProdutoSite("Camisa", 10, 5, 3);
        produtoSite.calcularValor(produtoSite);
        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("ProdutoSite{nome='Camisa', preco=10.0, valorFrete=5.0, acrescimo=3.0, precoTotal=18.0}", visitor.exibirValorInternet(produtoSite));
    }

}
