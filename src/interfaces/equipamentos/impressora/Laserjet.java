package interfaces.equipamentos.impressora;

public class Laserjet implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Laserjet...");
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

}
