import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao,numConta;
        double limite, valor;

        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.println("1-Nova conta corrente");
            System.out.println("2-Nova conta poupança");
            System.out.println("3-Nova conta especial");
            System.out.println("4-Realizar depósito");
            System.out.println("5-Realizar saque");
            System.out.println("6-Exibir saldo");
            System.out.println("7-Sair");

            opcao = tec.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();

                    contas.novaContaCorrente(numConta);
                    break;

                case 2:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();

                    contas.novaContaPoupanca(numConta);
                    break;

                case 3:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();
                    System.out.println("Informe o limite: ");
                    limite = tec.nextDouble();

                    contas.novaContaEspecial(numConta, limite);
                    break;

                case 4:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();
                    System.out.println("Informe o valor: ");
                    valor = tec.nextDouble();

                    if (contas.fazerDeposito(numConta, valor)) {
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Falha na operação.");
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();
                    System.out.println("Informe o valor do saque: ");
                    valor = tec.nextDouble();

                    if (contas.fazerSaque(numConta, valor)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Falha na operação.");
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();

                    System.out.println(contas.exibirSaldo(numConta));
                    break;

                case 7:

                    break;

                default:
                    System.out.println("\nOpcao inválida\n");
                    break;
            }

        } while (opcao != 7);

        tec.close();

        /*
         * ContaPoupanca c = new ContaPoupanca(1234);
         * 
         * ContaPoupanca.setTaxa(0.1); // System.out.println(p);
         * 
         * System.out.println(c.retornaDados()); System.out.println(c.saque(20.00));
         * System.out.println(c.deposito(2000));
         * 
         * 
         * if (c.deposito(1000)) { System.out.println("Deposito realizado"); } else {
         * System.out.println("Falha na operacao"); } if (c.saque(1000)) {
         * System.out.println("Deposito realizado"); } else {
         * System.out.println("Falha na operacao"); } System.out.println(c);
         */
    }
}
