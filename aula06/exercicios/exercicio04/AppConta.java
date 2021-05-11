import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao;
        int numConta;
        double limite, valor;

        ArrayList<Conta> contas = new ArrayList<>();
        ContaCorrente cc = null;
        ContaPoupanca cp = null;
        ContaEspecial ce = null;

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

                    cc = new ContaCorrente(numConta);
                    contas.add(cc);

                    break;

                case 2:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();

                    cp = new ContaPoupanca(numConta);
                    contas.add(cp);
                    break;

                case 3:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();
                    System.out.println("Informe o limite: ");
                    limite = tec.nextDouble();

                    ce = new ContaEspecial(numConta, limite);
                    contas.add(ce);

                    break;

                case 4:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();
                    System.out.println("Informe o valor: ");
                    valor = tec.nextDouble();

                    for (Conta contaCorrente : contas) {
                        if (contaCorrente.getNumber() == numConta) {
                            if (contaCorrente.deposito(valor)) {
                                System.out.println("Depósito realizado.");
                            } else {
                                System.out.println("Falha na operação.");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();
                    System.out.println("Informe o valor do saque: ");
                    valor = tec.nextDouble();

                    for (Conta contaCorrente : contas) {
                        if (contaCorrente.getNumber() == numConta) {
                            if (contaCorrente.saque(valor)) {
                                System.out.println("Saque realizado.");
                            } else {
                                System.out.println("Falha na operação.");
                            }
                        }
                    }

                    break;

                case 6:
                    System.out.println("Informe o número da conta: ");
                    numConta = tec.nextInt();

                    for (Conta contaCorrente : contas) {
                        if (contaCorrente.getNumber() == numConta) {
                            System.out.println(contaCorrente);
                        }
                    }

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
