package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("olá, " + nome);

        entrada.close();
    }
}
