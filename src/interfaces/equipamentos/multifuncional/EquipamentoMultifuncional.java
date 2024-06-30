package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

//  Java não permite 'herança múltipla'.
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

}
