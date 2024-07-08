package collections.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

//atributos
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private Double media;

    public Aluno(String nome, Long matricula, Double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public Double getMedia() {
        return media;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Aluno)) return false;
//        Aluno aluno = (Aluno) o;
//        return Objects.equals(matricula, aluno.matricula);
//    }

//    Java 16+
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Aluno aluno = (Aluno) o;
//        return Objects.equals(matricula, aluno.getMatricula);
//    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}

class ComparatorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
