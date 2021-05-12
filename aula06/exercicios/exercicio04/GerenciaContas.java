import java.util.ArrayList;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numConta) {
        contas.add(new ContaCorrente(numConta));
    }

    public void novaContaEspecial(int numConta, double limite) {
        contas.add(new ContaEspecial(numConta, limite));
    }

    public void novaContaPoupanca(int numConta) {
        contas.add(new ContaPoupanca(numConta));
    }

    public boolean fazerDeposito(int numConta, double valor) {

        for (Conta contaCorrente : contas) {
            if (contaCorrente.getNumber() == numConta) {
                if (contaCorrente.deposito(valor)) {
                    return true;
                } else {
                    return false; // não conseguiu fazer o deposito
                }
            }
        }
        return false; // não encontrou a conta
    }

    public boolean fazerSaque(int numConta, double valor) {

        for (Conta contaCorrente : contas) {
            if (contaCorrente.getNumber() == numConta) {
                if (contaCorrente.saque(valor)) {
                    return true;
                } else {
                    return false; // não conseguiu fazer o deposito
                }
            }
        }
        return false; // não encontrou a conta
    }

    public String exibirSaldo(int numConta) {
        for (Conta contaCorrente : contas) {
            if (contaCorrente.getNumber() == numConta) {
                return contaCorrente.toString();
            }
        }
        return "Conta não encontrada";

    }
}
