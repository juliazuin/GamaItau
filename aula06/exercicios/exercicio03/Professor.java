public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String telefone, double salario) {
        super(nome, telefone); // super chama o construtor da superclasse ou classe base
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario: " + salario;
    }

    public String exibir() {
        return "Professor";
    }

}
