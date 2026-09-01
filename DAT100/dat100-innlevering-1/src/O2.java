//bruker skal skrive inn sin poensumm i tall mellom 0 og 100,
//fek a er tall 90-100
// f er tall 0-39


import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hei student 1! hvilket karaktertall fikk du?");

        int karaktertall = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            while (karaktertall > 100 || karaktertall < 0) {
                System.out.println("du har oppgitt ugyldig tall, velg et tall fra 0-100");
                karaktertall = scanner.nextInt();

            }

             if (karaktertall <= 39) {
                System.out.println("Du har fått karakter F");
                
            } else if (karaktertall <= 49) {
                System.out.println("du har fått karater E");

            } else if (karaktertall <= 59) {
                System.out.println("DU har fått karakter D");
            } else if (karaktertall <= 79) {
                System.out.println("du har fått karakter C");
            } else if (karaktertall <= 89) {
                System.out.println("du har fptt karakter B");
            } else if (karaktertall <= 100) {
                System.out.println("du har fåt karrakter A");
                
            }

             System.out.println("Hei student" + (i +1)  + " Skriv inn karaktertallet ditt!");
             karaktertall = scanner.nextInt();


        }
    }
}
