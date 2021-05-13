import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, qtdKlw;

        System.out.println("Digite seu salario: ");
        salario = entrada.nextDouble();

        System.out.println("Digite qtd de quilowatts: ");
        qtdKlw = entrada.nextDouble();

        System.out.println("Valor em reais: " + qtdKlw * (1 / 500 * salario));
        // valor = 50*(1/500*1000) reaisF

        entrada.close();
    }
}
