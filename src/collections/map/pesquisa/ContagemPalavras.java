package collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    // Atributo
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    // Adiciona uma palavra com sua contagem
    public void adicionarPalavras(String linguagem, Integer contagem) {
        palavras.put(linguagem, contagem);
    }

    // Remove uma quantidade específica de uma palavra do mapa
    public void removerPalavra(String palavra, Integer quantidade) {
        if (palavras.containsKey(palavra)) {
            int contagemAtual = palavras.get(palavra);
            int novaContagem = contagemAtual - quantidade;

            if (novaContagem > 0) {
                palavras.put(palavra, novaContagem);
            } else {
                palavras.remove(palavra);
            }
        }
    }


    // Retorna a contagem total de todas as palavras
    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    // Encontra a palavra mais frequente
    public String encontrarPalavraMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    // Encontra a palavra menos frequente
    public String encontrarPalavraMenosFrequente() {
        String linguagemMenosFrequente = null;
        int menorContagem = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() < menorContagem) {
                menorContagem = entry.getValue();
                linguagemMenosFrequente = entry.getKey();
            }
        }
        return linguagemMenosFrequente;
    }

    // Exibe todas as palavras e suas contagens
    public void exibirTodasPalavras() {
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 3);
        contagemLinguagens.adicionarPalavras("C#", 5);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Exibe todas as linguagens e suas contagens
        System.out.println("Contagem de cada linguagem:");
        contagemLinguagens.exibirTodasPalavras();

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequenteAntes = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente antes é: " + linguagemMaisFrequenteAntes);

        // Encontra e exibe a linguagem menos frequente
        String linguagemMenosFrequenteAntes = contagemLinguagens.encontrarPalavraMenosFrequente();
        System.out.println("A linguagem menos frequente antes é: " + linguagemMenosFrequenteAntes);

        contagemLinguagens.removerPalavra("Python", 4);
        contagemLinguagens.removerPalavra("JavaScript", 2);


        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Exibe todas as linguagens e suas contagens
        System.out.println("Contagem de cada linguagem:");
        contagemLinguagens.exibirTodasPalavras();

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequenteDepois = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente depois é: " + linguagemMaisFrequenteDepois);

        // Encontra e exibe a linguagem menos frequente
        String linguagemMenosFrequenteDepois = contagemLinguagens.encontrarPalavraMenosFrequente();
        System.out.println("A linguagem menos frequente depois é: " + linguagemMenosFrequenteDepois);
    }
}
