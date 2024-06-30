package POO;
public class Carro extends Veiculo { // HERANÇA

    public void ligar() {
        confereCambio(); // ENCAPSULAMENTO - os métodos confereCambio e confereCombustivel estão "encapsulados", não aparecem ao usuario.
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }
    private void confereCambio() {
        System.out.println("Conferindo câmbio em P");
    }
}


