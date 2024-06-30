package interfaces.equipamentos.impressora;

public class Deskjet implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Deskjet...");
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

}
