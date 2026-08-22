import java.sql.SQLOutput;
import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {


        String passordConfirm = "";
        String brukernavn = "";

        while (true) {
            System.out.println(passordConfirm);

            Scanner scanner = new Scanner(System.in);
            System.out.println("************************");
            System.out.println("Velkommen til Instillingersiden for konto opprettelse!");
            System.out.println("************************");
            System.out.println("1 - Lag Konto");
            System.out.println("2 - log inn");
            System.out.println("3 - avslutt");


            int instillinger = scanner.nextInt();
            scanner.nextLine();



            switch (instillinger) {
                case 1:
                    System.out.println("Skriv inn brukernavn");
                    brukernavn = scanner.nextLine();
                    System.out.println("Skriv inn passord");
                    String passord1 = scanner.nextLine();
                    System.out.println("Gjenta Passord");
                    passordConfirm = scanner.nextLine();

                    if (passordConfirm.equals(passord1)) {
                        System.out.println("Ditt brukernavn er: " + brukernavn + "\n" + "Passordet ditt er " + passordConfirm);
                    } else {
                        System.out.println("passordet matcher ikke første inskrivning, eller har du ugyldig brukernavn. PRØV IGJEN!!!");
                    }

                    break;



                case 2:
                    System.out.println("Skriv inn brukernavn");
                    String logInBrukernavn = scanner.nextLine();

                    System.out.println("Skriv inn passord");
                    String logInPassord = scanner.nextLine();

                    if (logInBrukernavn.equals(brukernavn) && logInPassord.equals(passordConfirm)) {
                        System.out.println("Du er nå logget inn! Kos deg med spillingen *pew pew*");
                        scanner.nextLine();
                    }else {
                        System.out.println("du har enten skrevet feil passord eller brukernavn, eller så har du glømt å opprette bruker, prøv igjen");
                    }

                    break;

                case 3:
                    System.out.println("Avslutter program");
                    return;


                default:
                    System.out.println("ugyldig input, prøv igjen");
                    break;


            }
        }


    }
}
