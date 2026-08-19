import java.util.Scanner;

public class B3_2 {
    public static void main(String[] args) {

        /* program som tar sekunder og gjør det om til (timer, minutt, sekund)
        skal bruke rest (%) og det og fek at i 3600 sekund så er det 1 time, og ved 4000sekund % 3600 så er det en rest på 400 sekund
         */

        Scanner sekundScanner = new Scanner(System.in); //opprettelse av scanner objektet

        System.out.println("hvor mange sekund?");
        int sekundFraBruker = sekundScanner.nextInt()


        int timer = (sekundFraBruker / 3600);
        int restEtterTimer = (sekundFraBruker % 3600);
        int minutter = restEtterTimer / 60;
        int sekunder = restEtterTimer % 60;


        System.out.println(timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder");







    }
}