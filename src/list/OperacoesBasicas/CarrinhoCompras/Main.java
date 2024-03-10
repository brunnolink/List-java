package list.OperacoesBasicas.CarrinhoCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("biscoito", 1, 1);
        compras.adicionarItem("salgadinho", 1, 1);
        compras.adicionarItem("salgadinho", 2, 1);
        compras.adicionarItem("desodorante", 19.50, 2);
        
        compras.exibirItens();
        compras.removerItem("salgadinho");
        compras.exibirItens();

        System.out.println("O valor total da compra deu: " + compras.calcularValorTotal());


    }
}
