import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoVisitorTest {

    @Test
    void deveCalcularValorProdutoLoja(){
        ProdutoLoja produto = new ProdutoLoja("Camisa", 10);
        ProdutoVisitor visitor = new ProdutoVisitor();
        visitor.calcularvalorProdutoLoja(produto);
        assertEquals("ProdutoLoja{nome='Camisa', preco=10.0, precoTotal=10.0}", visitor.exibirValorLoja(produto));
    }

    @Test
    void deveCalcularValorProdutoTelefone(){
        ProdutoTelefone produto = new ProdutoTelefone("Camisa", 10, 5);
        ProdutoVisitor visitor = new ProdutoVisitor();
        visitor.calcularValorProdutoTelefone(produto);
        assertEquals("ProdutoTelefone{nome='Camisa', preco=10.0, valorFrete=5.0, precoTotal=15.0}", visitor.exibirValorTelefone(produto));
    }

    @Test
    void deveCalcularValorProdutoSite(){
        ProdutoSite produtoSite = new ProdutoSite("Camisa", 10, 5, 3);
        ProdutoVisitor visitor = new ProdutoVisitor();
        visitor.calcularValorProdutoSite(produtoSite);
        assertEquals("ProdutoSite{nome='Camisa', preco=10.0, valorFrete=5.0, acrescimo=3.0, precoTotal=18.0}", visitor.exibirValorInternet(produtoSite));
    }

}
