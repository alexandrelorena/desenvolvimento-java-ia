package POO.Iphone;

import POO.Iphone.Apps.AparelhoTelefonico;
import POO.Iphone.Apps.NavegadorInternet;
import POO.Iphone.Apps.ReprodutorMusical;

public class IphonePedrinho {
    public static void main(String[] args) {
        
        AparelhoTelefonico ae = null;
        NavegadorInternet ni = null;
        ReprodutorMusical rm = null;


        String appEscolhido="tel";

        if(appEscolhido.equals("tel")) {
            ae = new AparelhoTelefonico();
            ae.ligar();
            ae.atender();
            ae.iniciarCorreioVoz();
        } else if(appEscolhido.equals("nav")) {
            ni = new NavegadorInternet();
            ni.exibirPagina();
            ni.adicionarNovaAba();
            ni.atualizarPagina();
        } else if(appEscolhido.equals("rep")) {
            rm = new ReprodutorMusical();
            rm.tocar();
            rm.pausar();
            rm.selecionarMusica();
        } else {
            System.out.println("App não encontrado");
        }
    }
}
