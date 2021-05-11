public class AppConta {
    public static void main(String[] args) {

        Conta c = new ContaEspecial(1234, 100);

        // System.out.println(p);
        /*
         * System.out.println(c.retornaDados()); System.out.println(c.saque(20.00));
         * System.out.println(c.deposito(2000));
         */

        if (c.deposito(1000)) {
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Falha na operacao");
        }
        if (c.saque(1000)) {
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Falha na operacao");
        }
        System.out.println(c);
    }
}
