package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProduto);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }            
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProduto.isEmpty()) {
        for(Produto p : estoqueProduto.values()){
            if(maiorPreco < p.getPreco()) {
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProduto.isEmpty()) {
            for(Produto p : estoqueProduto.values()) {
                if(menorPreco > p.getPreco()) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProduto.isEmpty()) {
          for (Map.Entry<Long, Produto> entry : estoqueProduto.entrySet()) {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }
      //Testes em: Main
}
