package set.Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorDeAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunosParaRemover = null;
        if(!alunosSet.isEmpty()) {
        for (Aluno a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunosParaRemover = a;
                break;
                } 
            }
            alunosSet.remove(alunosParaRemover);
        }else {
               throw new RuntimeException("O conjunto está vazio!");     
    }

    if(alunosParaRemover == null) {
        System.out.println("Matrícula não encontrada!");
    }
}

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunosSet.isEmpty()) {
        alunosPorNota.addAll(alunosSet);
        System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }


    

}
