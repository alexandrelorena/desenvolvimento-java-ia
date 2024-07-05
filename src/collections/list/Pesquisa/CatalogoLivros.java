package collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return  livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Fulano da Silva", 1984);
        catalogoLivros.adicionarLivro("Livro 2", "Beltrano de Souza", 2003);
        catalogoLivros.adicionarLivro("Livro 3", "Cicrano Martins", 1997);
        catalogoLivros.adicionarLivro("Livro 4", "J́osé da Silva", 1985);
        catalogoLivros.adicionarLivro("Livro 5", "Maria da Silva", 1986);
        catalogoLivros.adicionarLivro("Livro 6", "Joaquim Silveira", 1987);
        catalogoLivros.adicionarLivro("Livro 7", "Hipotenusa da Silva", 1988);
        catalogoLivros.adicionarLivro("Livro 8", "Hipotenusa da Silva", 1989);
        catalogoLivros.adicionarLivro("Livro 9", "Hipotenusa da Silva", 1990);
        catalogoLivros.adicionarLivro("Livro 10", "Hipotenusa da Silva", 1991);


        System.out.println(catalogoLivros.pesquisarPorAutor("Hipotenusa da Silva"));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 9"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2003));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}



