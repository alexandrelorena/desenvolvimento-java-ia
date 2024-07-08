package collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    //atributo
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);;
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()) {
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

//    public Set<Aluno> exibirAlunos() {
//        Set<Aluno> alunos = new TreeSet<>(alunosSet);
//        if (!alunosSet.isEmpty()) {
//            return alunos;
//        } else {
//            throw new RuntimeException("O conjunto está vazio!");
//        }
//    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 0001L, 8.0);
        gerenciadorAlunos.adicionarAluno("Maria", 0002L, 7.5);
        gerenciadorAlunos.adicionarAluno("Manoel", 0003L, 7.6);
        gerenciadorAlunos.adicionarAluno("Joaquim", 0004L, 8.5);
        gerenciadorAlunos.adicionarAluno("Elaine", 0005L, 9.0);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        System.out.println("Removendo alunos:");
        gerenciadorAlunos.removerAlunoPorMatricula(0004L);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        System.out.println("Exibindo por nome:");
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        System.out.println("Exibindo por nota:");
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}