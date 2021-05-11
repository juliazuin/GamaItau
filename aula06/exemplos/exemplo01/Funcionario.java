
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {
        nome = "";
        salario = 0;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        salario = 0;
    }

    // overload = sobrecarregar metodos de uma classe
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String exibir() {
        return nome + ", " + salario;
    }

    public void aumentaSalario(double porcent) {
        salario += salario * porcent / 100;
    }
}
