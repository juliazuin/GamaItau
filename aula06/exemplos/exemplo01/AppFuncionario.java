public class AppFuncionario {
    public static void main(String[] args) {
        Gerente g = new Gerente("Marcelo", 1000, 10);
        Funcionario f = new Funcionario("Arnaldo", 1000);

        g.aumentaSalario(10);
        f.aumentaSalario(10);

        System.out.println(g.exibir());
        System.out.println(f.exibir());
    }
}
