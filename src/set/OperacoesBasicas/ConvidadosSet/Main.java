package set.OperacoesBasicas.ConvidadosSet;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("convidado1", 1234);
        convidados.adicionarConvidado("convidado2", 1234);
        convidados.adicionarConvidado("convidado3", 1235);
        convidados.adicionarConvidado("convidado4", 1236);

      

        convidados.exibirConvidados();
        System.out.println(" ");

        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do salão");      

        System.out.println(" ");

        convidados.removerCandidatoPorCodigoConvite(1234);
        convidados.removerCandidatoPorCodigoConvite(1235);


        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do salão");  

        System.out.println(" ");
        convidados.exibirConvidados();
    }
}
