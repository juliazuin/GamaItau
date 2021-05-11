public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("XV de Piracicaba", "Inter de Limeira");
        Placar p3 = new Placar("XV de Piracicaba", "Inter de Limeira", 4, 2);

        System.out.println(p1.exibir());
        System.out.println(p2.exibir());
        System.out.println(p3.exibir());
    }
}
