package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		selecionarIngredientesLanche();
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}

	public void adicionarSucoNoBalcao() {
		selecionarIngredientesVitamina();
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}

	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}

	private void prepararLanche() {
		fritarIngredientesLanche();
		System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
	}

	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}

	private void prepararCombo() {
		baterVitaminaLiquidificador();
		prepararLanche();
		prepararVitamina();
	}

	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}

	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}

	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}

	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}

	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}

	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}

	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
