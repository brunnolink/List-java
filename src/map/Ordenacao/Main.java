package map.Ordenacao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 30), "evento 1", "luisa sonza");

        agendaEventos.adicionarEvento(LocalDate.of(2024, 03, 14), "evento 2", "beyonce");

        agendaEventos.adicionarEvento(LocalDate.of(2024, 03, 10), "evento 3", "felipe neto");

        agendaEventos.adicionarEvento(LocalDate.of(2024, 05, 10), "evento 4", "ed sheeran");

        agendaEventos.exibirAgenda();

        System.out.println(" ");

        agendaEventos.obterProximoEvento();
    }
}
