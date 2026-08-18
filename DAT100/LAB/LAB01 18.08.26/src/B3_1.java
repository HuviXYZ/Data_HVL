import java.util.Scanner;

public class B3_1 {
    public static void main(String[] args){

        /* alogytme / plan for programm
        Programmet skal oversette gitte sekunder fra bruker og gjøre de om til et format som viser timer, minutter, sekunder
        altså 3600 sekund = "1 timer, 0 minutt, og 0 sekund"
         */
        Scanner brukerImput = new Scanner(System.in); //nytt scanner object
        System.out.println("Hvor mange sekunder?: ");

        int sekunderFraImput = brukerImput.nextInt();

        int timer = (sekunderFraImput / 3600);

        int minutter = ((sekunderFraImput - timer * 3600 ) / 60);

        int sekunder = (sekunderFraImput - timer * 3600 - ( minutter * 60 ));

        System.out.println(timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder " );
    }


}