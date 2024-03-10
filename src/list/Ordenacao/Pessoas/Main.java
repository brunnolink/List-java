package list.Ordenacao.Pessoas;

public class Main {
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
