package map.OperacoesBasicas.ContatosAgenda;

public class Main {
    public static void main(String[] args) {
        AgendaContatos meusContatos = new AgendaContatos();

        meusContatos.adicionarContato("Eu", 12345);
        meusContatos.adicionarContato("prego", 12345);
        meusContatos.adicionarContato("Minha vidinha", 12345);
        meusContatos.adicionarContato("Elanos", 12345);

        meusContatos.exibirContatos();

        System.out.println(" "); 

        meusContatos.removerContato("Eu");

        meusContatos.exibirContatos();

        System.out.println(" ");

        System.out.println("O numero é: " + meusContatos.pesquisarNumeroPorNome("prego")); 
    }

}
