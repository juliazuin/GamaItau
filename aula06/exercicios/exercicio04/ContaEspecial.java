public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;

    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() + limite >= valor) {
            return super.saque(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        return "CE: " + super.toString() + ": " + limite;
    }

}
