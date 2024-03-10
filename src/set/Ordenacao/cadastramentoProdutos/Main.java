package set.Ordenacao.cadastramentoProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        

        produtos.adicionarProduto("coca", 1.89, 123, 1);
        produtos.adicionarProduto("dawney", 3.78, 321, 1);
        produtos.adicionarProduto("biscoito", 19.99, 1234, 1);
        produtos.adicionarProduto("abao", 18.99, 12342, 1);

        produtos.exibirProdutos();

        System.out.println(" ");

        // System.out.println(produtos.exibirProdutoPorNome());
        System.out.println(produtos.exibirProdutoPorPreco());
    }
}
