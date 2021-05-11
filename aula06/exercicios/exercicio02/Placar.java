public class Placar {
    private String time1, time2;
    private int golsTime1, golsTime2;

    public Placar() {
        this("time1", "time2", 0, 0);
        /*
         * time1 = "teste"; time2 = "teste"; golsTime1 = 0; golsTime2 = 0;
         */
    }

    public Placar(String time1, String time2) {
        this(time1, time2, 0, 0); // chama o construtor da propria classe
        
        /*
         * this.time1 = time1; this.time2 = time2; golsTime1 = 0; golsTime2 = 0;
         */
    }

    public Placar(String time1, String time2, int golsTime1, int golsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public String exibir() {
        return time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2;
    }
}
