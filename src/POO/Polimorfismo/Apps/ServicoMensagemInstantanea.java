package POO.Polimorfismo.Apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	

	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	

}

//  A classe abstrata, tem métodos abstratos e os métodos não tem corpo, sendo encerrados por um ';'.