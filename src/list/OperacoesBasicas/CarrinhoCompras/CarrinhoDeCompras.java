package list.OperacoesBasicas.CarrinhoCompras;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompra;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItems = new ArrayList<>();
        if (!carrinhoDeCompra.isEmpty()) {
            for (Item i : carrinhoDeCompra) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removerItems.add(i);
                }                
            }
            carrinhoDeCompra.removeAll(removerItems);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!carrinhoDeCompra.isEmpty()) {
            for (Item item : carrinhoDeCompra) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
          }
        
    }


    public void exibirItens() {
        if (!carrinhoDeCompra.isEmpty()) {
            System.out.println(this.carrinhoDeCompra);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

 @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + carrinhoDeCompra +
          '}';
    }
}
