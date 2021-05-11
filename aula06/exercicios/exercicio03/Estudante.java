public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String telefone, String curso) {
        super(nome, telefone); // super chama o construtor da superclasse ou classe base
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso;
    }

    public String exibir() {
        return "Estudante";
    }
}
