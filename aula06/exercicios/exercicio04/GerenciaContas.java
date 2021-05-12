import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numConta) {
        contas.put(numConta, new ContaCorrente(numConta));
    }

    public void novaContaEspecial(int numConta, double limite) {
        contas.put(numConta, new ContaEspecial(numConta, limite));
    }

    public void novaContaPoupanca(int numConta) {
        contas.put(numConta, new ContaPoupanca(numConta));
    }

    public boolean fazerDeposito(int numConta, double valor) {

        Conta objConta = contas.get(numConta);

        if (objConta != null) {
            return objConta.deposito(valor);
        }
        return false; // não encontrou a conta

    }

    public boolean fazerSaque(int numConta, double valor) {

        Conta objConta = contas.get(numConta);

        if (objConta != null) {
            return objConta.saque(valor);
        }
        return false; // não encontrou a conta
    }

    public String exibirSaldo(int numConta) {

        Conta objConta = contas.get(numConta);

        if (objConta != null) {
            objConta.toString();
        }
        return "Conta não encontrada"; // não encontrou a conta

    }
}
