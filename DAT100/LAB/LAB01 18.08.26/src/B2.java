import static java.lang.Math.*;
import java.util.Scanner; //impoterer scanner klassen

public class B2 {
    public static void main(String[] args){

        //volum av sylinder ved bruk av brukerimput ved bruk av scanner

        //scanner aka brukerimput
        Scanner myScanner = new Scanner(System.in);

        System.out.println("hva er høyde?");
        double h = myScanner.nextDouble();

        System.out.println("hva er radius?");
        double r = myScanner.nextDouble();

        //formel for volum basert på brukerimput

        double V = (PI * pow(r,2) * h );

        System.out.println("volumet av sylinderen er: " + V);

    }


}