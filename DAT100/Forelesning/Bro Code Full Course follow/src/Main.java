import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Scanner.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scanner objekt for navn og alder

        System.out.println("whats your name?: ");

        String name = scanner.nextLine();

        System.out.println("how old are you?: ");

        int age = scanner.nextInt();

        System.out.println("type pi with 4 decimal numbers");

        double piAnswer = scanner.nextDouble();

        while (age >= 20 && piAnswer != 3.1416) {
            System.out.println("you are wrong!! for beeing over 19 years old you should learn this right away!\n");

            System.out.println("Pleae try again, think harder this time:");
            piAnswer = scanner.nextDouble();
        } if (age >= 20 && piAnswer == 3.1416){
            System.out.println("Yeeey congratulatons " + name + "this is expected since you are over the age of 20");
        }


        


    }
}
