package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;



    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }    

    public void obterProximoEvento() {
      //Set<LocalDate> dateSet = eventosMap.keySet();
      //Collection<Evento> values = eventosMap.values();

      LocalDate dataAtual = LocalDate.now();
      Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
      LocalDate proximaData = null;
      Evento proximEvento = null;
      for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
        if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
            proximaData = entry.getKey();
            proximEvento = entry.getValue();
            System.out.println("O próximo evento: " + proximEvento + " acontecerá na data: " + proximaData);
            break;
        }
      }
    }
    //Testes em: Main
}
