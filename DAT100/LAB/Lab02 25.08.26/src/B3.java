import java.util.Scanner;

public class B3 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        String lagretBrukernavn = "huvi";
        String lagretPassord = "1234";

        int forsok = 1;

        System.out.println("skriv inn brukernavn");
        String brukernavn = scanner.nextLine();

        System.out.println("skriv inn passord");
        String passord = scanner.nextLine();

        while(!brukernavn.equals(lagretBrukernavn) || !passord.equals(lagretPassord) || forsok < 3) {
            System.out.println("feil brukernavn eller passord prøv igjen " + "Du har " + (3-forsok) + " Forsøkigjen");

            System.out.println("skriv inn brukernavn");

            brukernavn = scanner.nextLine();

            System.out.println("skriv inn passord");
            passord = scanner.nextLine();
            forsok++;
        }

        if (brukernavn.equals(lagretBrukernavn) && passord.equals(lagretPassord)) {
            System.out.println("Gratulerer, du har skrevet riktig passord og brukerenan, og er nå logget inn");
            scanner.nextLine();

        }else{
            System.out.println("du har prøv for mange ganger, for sikkerhetsårsaker vil programmet avsluttes.");
        }






    }
}