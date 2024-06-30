package POO.Abstracao;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		System.out.println("\nMSN\n");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

		//abrindo FacebookMessenger
		System.out.println("\nFacebookMessenger\n");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();

		//abrindo Telegram
		System.out.println("\nTelegram\n");
		Telegram tele = new Telegram();
		tele.enviarMensagem();
		tele.receberMensagem();
	}
}