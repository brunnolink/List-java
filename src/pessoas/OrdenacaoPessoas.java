package pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
   private List<Pessoa> pessoaList;

   public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList();
   }

   public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura)); 
   }

   public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
   }

   public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }


    public static void main(String[] args) {
        OrdenacaoPessoas ordenarPessoas = new OrdenacaoPessoas();

        ordenarPessoas.adicionarPessoa("nome1", 28, 1.60);
        
        ordenarPessoas.adicionarPessoa("nome2", 32, 1.90);
        ordenarPessoas.adicionarPessoa("nome3", 22, 1.72);
        ordenarPessoas.adicionarPessoa("nome4", 15, 1.52);

        System.out.println(ordenarPessoas.ordenarPorAltura());
        System.out.println(" ");
        System.out.println(ordenarPessoas.ordenarPorIdade());
    }
}
