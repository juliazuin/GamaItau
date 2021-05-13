import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Digite seu salario: ");
        salario = entrada.nextDouble();

        double novoSalario = (0.25 * salario);

        System.out.println(novoSalario + salario);

        entrada.close();

    }
}
