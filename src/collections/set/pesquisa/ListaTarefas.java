package collections.set.pesquisa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ListaTarefas {
    //atributos
    private Set<Tarefa> tarefasSet; //Atributo

    public ListaTarefas() { //Atributo
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) { //Método
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) { // Método
        Optional<Tarefa> tarefaParaRemover = encontrarTarefaPorDescricao(descricao);
        if (tarefaParaRemover.isPresent()) {
            tarefasSet.remove(tarefaParaRemover.get());
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() { //Método
        if(!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Nenhuma tarefa encontrada!");
        }
    }

    public int contarTarefas() { //Método
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() { //Método
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() { //Método
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) { // Método
        Optional<Tarefa> tarefa = encontrarTarefaPorDescricao(descricao);
        tarefa.ifPresent(t -> t.setConcluida(true));
    }

    public void marcarTarefaPendente(String descricao) { // Método
        Optional<Tarefa> tarefa = encontrarTarefaPorDescricao(descricao);
        tarefa.ifPresent(t -> t.setConcluida(false));
    }

    public void limparListaTarefas() { //Método
        if(tarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefasSet.clear();
        }
    }

    private Optional<Tarefa> encontrarTarefaPorDescricao(String descricao) {
        return tarefasSet.stream()
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao))
                .findFirst();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}