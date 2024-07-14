package collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Declaração da classe: Define a classe pública 'CadastroProdutos'. Esta classe estará acessível por outras classes.
public class CadastroProdutos {

    //Declaração do atributo: Declara um atributo privado chamado 'produtoSet'.
    // Set<Produto> significa que produtoSet é um conjunto (Set) que conterá objetos do tipo Produto.
    // A escolha de Set garante que os produtos sejam únicos (não haverá duplicatas).
    private Set<Produto> produtoSet;

    //Construtor da classe:
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>(); // this.produtoSet = new HashSet<>(); inicializa o atributo produtoSet
        // com uma nova instância de HashSet<Produto>. HashSet é uma implementação da interface Set que não permite
        // elementos duplicados e não mantém a ordem dos elementos.
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        if (!produtoSet.isEmpty()) {
            return produtosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
