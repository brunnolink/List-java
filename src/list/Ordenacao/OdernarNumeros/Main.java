package list.Ordenacao.OdernarNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(3);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);

        numeros.exibirNumeros();

        System.out.println(" ");

        System.out.println(numeros.ordenarAscendente());

        System.out.println(" ");

        System.out.println(numeros.ordenarDescendente());
    }
}
