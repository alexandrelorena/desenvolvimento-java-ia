package POO.Polimorfismo;

import POO.Polimorfismo.Apps.FacebookMessenger;
import POO.Polimorfismo.Apps.MSNMessenger;
import POO.Polimorfismo.Apps.ServicoMensagemInstantanea;
import POO.Polimorfismo.Apps.Telegram;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}