
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Media: " + (nota1 + nota2) / 2);

        entrada.close();

    }
}
