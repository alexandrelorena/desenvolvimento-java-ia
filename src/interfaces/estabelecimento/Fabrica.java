package interfaces.estabelecimento;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
// import interfaces.equipamentos.digitalizadora.Scanner;
// import interfaces.equipamentos.impressora.Deskjet;
import interfaces.equipamentos.impressora.Impressora;
// import interfaces.equipamentos.impressora.Laserjet;
import interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;
public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

       impressora.imprimir();
       digitalizadora.digitalizar();
       copiadora.copiar();

    }
}
