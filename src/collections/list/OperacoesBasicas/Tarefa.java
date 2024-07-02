package collections.list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao; //construtor
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
//        return "Tarefa{" +
//                "descricao='" + descricao + '\'' +
//                '}';
        return descricao;
    }
}
