public class ContaPoupanca extends Conta {
    private static double taxa;

    public ContaPoupanca(int numConta) {
        super(numConta);
    }

    public static void setTaxa(double taxa) {
        ContaPoupanca.taxa = taxa;
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() >= valor + taxa) {
            return super.saque(valor + taxa);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "CP: " + super.toString() + " - " + taxa;
    }
}
