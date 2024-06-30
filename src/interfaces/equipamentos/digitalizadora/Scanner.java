package interfaces.equipamentos.digitalizadora;

public class Scanner  implements Digitalizadora{

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando...");
        throw new UnsupportedOperationException("Unimplemented method 'digitalizar'");
    }

}
