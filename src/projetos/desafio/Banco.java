package projetos.desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    static String nome = "THE BANK";
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Conta> contas;

    public static void main(String[] args) {
        Banco.contas = new ArrayList<Conta>();
        while (true) {
            Banco.menu();
        }
    }

    public static void menu() {
        int opcao = 0;
        System.out.println("\n========== Bem vindo ao " + Banco.nome + " ========== \n");
        System.out.println("Selecione uma opção no menu: \n");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Efetuar saque");
        System.out.println("3 - Efetuar depósito");
        System.out.println("4 - Efetuar transferência");
        System.out.println("5 - Listar contas");
        System.out.println("6 - Sair do sistema");
        System.out.println("\n===========================================");

        try {
            opcao = Integer.parseInt(Banco.teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, informe uma opção válida.");
            Utils.pausar(1);
            return;
        }

        switch (opcao) {
            case 1:
                Banco.criarConta();
                break;
            case 2:
                Banco.efetuarSaque();
                break;
            case 3:
                Banco.efetuarDeposito();
                break;
            case 4:
                Banco.efetuarTransferencia();
                break;
            case 5:
                Banco.listarContas();
                break;
            case 6:
                System.out.println("Até a próxima!");
                Utils.pausar(2);
                System.exit(0);
            default:
                System.out.println("Opção inválida");
                Utils.pausar(2);
                break;
        }
    }

    public static void efetuarDeposito() {
        System.out.println("Informe o número da conta para depósito: ");
        int numero = Banco.teclado.nextInt();
        Banco.teclado.nextLine(); // Consumir a quebra de linha

        Conta conta = Banco.buscarContaPorNumero(numero);

        if (conta != null) {
            System.out.println("Informe o valor de depósito: ");
            Double valor = Banco.teclado.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("Não foi encontrada a conta número " + numero);
        }
        Utils.pausar(3);
    }
    public static void efetuarSaque() {
        System.out.println("Informe o número da conta: ");
        int numero = Banco.teclado.nextInt();
        Banco.teclado.nextLine(); // Consumir a quebra de linha

        Conta conta = Banco.buscarContaPorNumero(numero);

        if (conta != null) {
            System.out.println("Informe o valor para saque: ");
            Double valor = Banco.teclado.nextDouble();
            conta.sacar(valor);
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Não foi encontrada a conta número " + numero);
        }
        Utils.pausar(3);
    }

    public static void criarConta() {
        System.out.println("Criando conta. Informe os dados do cliente: ");

        System.out.println("Nome do cliente: ");
        String nome = Banco.teclado.nextLine();

        System.out.println("E-mail do cliente: ");
        String email = Banco.teclado.nextLine();

        System.out.println("CPF do cliente: ");
        String cpf = Banco.teclado.nextLine();

        System.out.println("Data de nascimento do cliente: ");
        String data_nascimento = Banco.teclado.nextLine();

        Cliente cliente = new Cliente(nome, email, cpf, Utils.stringParaData(data_nascimento));

        Conta conta = new Conta(cliente);

        Banco.contas.add(conta);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Dados da conta criada: ");
        System.out.println(conta);
        System.out.println();

        Utils.pausar(4);
    }

    public static void efetuarTransferencia() {
        System.out.println("Informe a conta para transferência");
        int numero_o = Banco.teclado.nextInt();
        Banco.teclado.nextLine(); // Consumir a quebra de linha

        Conta conta_o = Banco.buscarContaPorNumero(numero_o);

        if (conta_o != null) {
            System.out.println("Informe o número da conta destino: ");
            int numero_d = Banco.teclado.nextInt();
            Banco.teclado.nextLine(); // Consumir a quebra de linha

            Conta conta_d = Banco.buscarContaPorNumero(numero_d);

            if (conta_d != null) {
                System.out.println("Informe o valor da transferência: ");
                Double valor = Banco.teclado.nextDouble();

                conta_o.transferir(conta_d, valor);
                System.out.println("Transferência efetuada com sucesso!");
            } else {
                System.out.println("A conta destino número " + numero_d + " não foi encontrada!");
            }
        } else {
            System.out.println("Não foi encontrada a conta número " + numero_o);
        }
        Utils.pausar(3);
    }

    public static void listarContas() {
        if (!Banco.contas.isEmpty()) {
            System.out.println("Listagem de contas");
            System.out.println();

            for (Conta conta : Banco.contas) {
                System.out.println(conta);
                System.out.println();
                Utils.pausar(1);
            }
        } else {
            System.out.println("Não existem contas cadastradas ainda!");
        }
        Utils.pausar(3);
    }

    private static Conta buscarContaPorNumero(int numero) {
        Conta c = null;
        if (!Banco.contas.isEmpty()) {
            for (Conta conta : Banco.contas) {
                if (conta.getNumero() == numero) {
                    c = conta;
                }
            }
        }
        return c;
    }
}
