package collections.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class AgendaEventos {
    // Atributo
    private final Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new TreeMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
        if (data == null || nomeEvento == null || descricaoAtracao == null) {
            throw new IllegalArgumentException("Os parâmetros não podem ser nulos.");
        }
        eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
    }

    public void exibirAgenda() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento.format(formatter) + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Optional<Map.Entry<LocalDate, Evento>> proximoEvento = eventosMap.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().isBefore(dataAtual))
                .findFirst();

        if (proximoEvento.isPresent()) {
            Map.Entry<LocalDate, Evento> entry = proximoEvento.get();
            LocalDate proximaData = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("O próximo evento: " + evento.getNome() + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    }

//    private static class Evento {
//        private final String nome;
//        private final String atracao;
//
//        public Evento(String nome, String atracao) {
//            this.nome = nome;
//            this.atracao = atracao;
//        }
//
//        public String getNome() {
//            return nome;
//        }
//
//        public String getAtracao() {
//            return atracao;
//        }
//    }
}
