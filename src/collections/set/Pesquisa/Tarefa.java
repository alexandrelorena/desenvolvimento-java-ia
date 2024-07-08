package collections.set.Pesquisa;

public class Tarefa {
    private String descricao; //Atributo
    private Boolean concluida; //Atributo

    public Tarefa(String descricao) { //Construtor
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() { //Método
        return descricao;
    }

    public Boolean isConcluida() { //Método
        return concluida;
    }

    public void setDescricao(String descricao) { //Método
        this.descricao = descricao;
    }

    public void setConcluida(Boolean concluida) { //Método
        this.concluida = concluida;
    }

    @Override
    public String toString() { //Retorna uma representação em string
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
