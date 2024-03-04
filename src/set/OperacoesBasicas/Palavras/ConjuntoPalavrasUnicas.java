package set.OperacoesBasicas.Palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
          
            if (palavrasUnicas.contains(palavra)) {
                palavrasUnicas.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada no conjunto!");
              }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicas.isEmpty()) {
          System.out.println(palavrasUnicas);
        } else {
          System.out.println("O conjunto está vazio!");
        }
      }


      public static void main(String[] args) {
        ConjuntoPalavrasUnicas linguagens = new ConjuntoPalavrasUnicas();

        linguagens.adicionarPalavra("Java");
        
        linguagens.adicionarPalavra("C#");

        linguagens.adicionarPalavra("C++");

        linguagens.adicionarPalavra("Flutter");
        
        linguagens.adicionarPalavra("JavaScript");

        linguagens.exibirPalavrasUnicas();

        linguagens.removerPalavra("Flutter");
        linguagens.exibirPalavrasUnicas();

        System.out.println("A lingaugem 'Java' está no conjunto? " + linguagens.verificarPalavra("Java"));
      }

}
