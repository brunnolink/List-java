package listanumeros;

import java.util.ArrayList;
import java.util.List;

public class ListNumeros {
    private List<Integer> numeroList;

    public ListNumeros() {
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
        ListNumeros num = new ListNumeros();

        num.adicionarNumero(5);
        num.adicionarNumero(2);
        num.adicionarNumero(3);

        System.out.println("E o menor numero é: " + num.encontrarMenorNumero());
    }

}
