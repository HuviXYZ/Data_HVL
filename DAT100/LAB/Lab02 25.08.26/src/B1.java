import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dette er et programm som oversetter gitt dagsnummer");
        System.out.println("********************************\n");

        System.out.println("Skriv in dagsnummer i form av x, fek 1 som dag 1 i måneden");
        int dagInput = scanner.nextInt();

        System.out.println("Skriv in Månedsnummer i form av x, fek 9 = september");
        int manedInput = scanner.nextInt();

        System.out.println("Skriv in Månedsnummer i form av xxxx, fek 1934 ");
        int aarInput = scanner.nextInt();

        System.out.println(dagInput + ", " + manedInput + ", " + aarInput );







    }

}
