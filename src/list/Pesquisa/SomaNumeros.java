package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numeros) {
        this.numeroList.add(numeros);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numeroList.isEmpty()) {
            for (Integer nm : numeroList) {
                soma += nm;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNum = 0;
        if (!numeroList.isEmpty()) {
            for (Integer nm : numeroList) {
                if (nm > maiorNum) {
                    maiorNum = nm;
                }
            }
        }
        return maiorNum;
    }

    public int encontrarMenorNumero() {
        int menorNum = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer nm : numeroList) {
                if (nm <= menorNum) {
                    menorNum = nm;
                }
            }
            return menorNum;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("A lista de números está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros num = new SomaNumeros();

        num.adicionarNumero(5);
        num.adicionarNumero(2);
        num.adicionarNumero(3);

        num.calcularSoma();

        System.out.println("A soma dos numeros é " + num.calcularSoma() + " - o menor numero é: " + num.encontrarMenorNumero() + " - e o maior número é " + num.encontrarMaiorNumero());
    }

}
