package map.Pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();

        

        produtos.adicionarProduto(1111, "biscoito", 2, 2.0);

        produtos.adicionarProduto(1222, "bolacha", 4, 4.0);

        produtos.adicionarProduto(1333, "jujuba", 1, 5.0);

        produtos.adicionarProduto(1444, "kitkat", 3, 8.0);

        produtos.exibirProdutos();

        System.out.println(" ");

        System.out.println("Valor total dos produtos em estoque é: " + produtos.calcularValorTotalEstoque());

        System.out.println(" ");

        System.out.println("Produto mais caro no estoque é: " + produtos.obterProdutoMaisCaro());

        System.out.println(" ");

        System.out.println("Produto mais barato no estoque é: " + produtos.obterProdutoMaisBarato());

        System.out.println(" ");

        System.out.println("O produto com maior valor no estoque é: " + produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
