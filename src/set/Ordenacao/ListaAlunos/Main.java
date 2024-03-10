package set.Ordenacao.ListaAlunos;

    public class Main {
    public static void main(String[] args) {
        GerenciadorDeAlunos aluno = new GerenciadorDeAlunos();

        aluno.adicionarAluno("brunno", 12345L, 9.2);

        aluno.adicionarAluno("maria", 123L, 6.5);

        aluno.adicionarAluno("joao", 1234L, 7.0);
        
        System.out.println("Alunos no gerenciador: ");
        aluno.exibirAlunos();

        aluno.removerAluno(123L);

        aluno.exibirAlunos();

        System.out.println(" "); 
        
        aluno.exibirAlunosPorNome();

        System.out.println(" ");

        aluno.exibirAlunosPorNota();
    }
}

   


