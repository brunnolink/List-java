package set.Pesquisa.ContatosAgenda;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

             agendaContatos.adicionarContato("eliot", 819754);
    
             agendaContatos.adicionarContato("pedro", 123);
    
             agendaContatos.adicionarContato("alan", 321);
    
             agendaContatos.exibirContatos();
    
            System.out.println(agendaContatos.atualziarNumeroContato("pedro", 9902));
            System.out.println(" ");
    
            agendaContatos.exibirContatos();
        }
    }

