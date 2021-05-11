
public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario); // super chama o construtor da superclasse ou classe base
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public String exibir() {
        return "Gerente" + super.exibir() + " " + numFuncionarios;
    }

    @Override
    public void aumentaSalario(double porcent) {
        super.aumentaSalario(porcent + 10);
    }

}
