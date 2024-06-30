package interfaces.equipamentos.copiadora;

public class Xerox implements Copiadora{

    @Override
    public void copiar() {
        System.out.println("Copiando...");
        throw new UnsupportedOperationException("Unimplemented method 'copiar'");
    }

}
