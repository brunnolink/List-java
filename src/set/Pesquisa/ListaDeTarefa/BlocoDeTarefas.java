package set.Pesquisa.ListaDeTarefa;

public class BlocoDeTarefas {
    public static void main(String[] args) {
        ListaTarefas taskList = new ListaTarefas();

        taskList.adicionarTarefa("Nadar");
        taskList.adicionarTarefa("andar");

        taskList.exibirTarefas();

        taskList.marcarTarefaConcluida("andar");

        taskList.exibirTarefas();

        System.out.println("As tarefas concluidas são: " + taskList.obterTarefasConcluidas());
        
        System.out.println("As tarefas pendentes são: " + taskList.obterTarefasPendentes());
    }
    
}
