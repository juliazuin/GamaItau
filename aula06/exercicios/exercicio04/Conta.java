public abstract class Conta {
    int numConta;
    double saldo;

    public Conta(int numConta) {
        this.numConta = numConta;
        this.saldo = 0;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return numConta + " : " + saldo;
    }

    /*
     * public Conta(int numConta, double saldo) { this.numConta = numConta;
     * this.saldo = saldo; }
     * 
     * // meu exercicio public String retornaDados() { return "Numero da conta: " +
     * numConta + " Saldo: " + saldo; }
     * 
     * public String deposito(double valorDep) { return "Saldo anterior: " +
     * this.saldo + "\nValor depositado:" + valorDep + "\nNovo saldo:" + (valorDep +
     * this.saldo); }
     * 
     * public String saque(double valorSaque) { return "Saldo anterior: " +
     * this.saldo + "\nValor sacado: " + valorSaque + "\nNovo saldo: " + (this.saldo
     * - valorSaque); }
     */

    public double getSaldo() {
        return saldo;
    }
}
