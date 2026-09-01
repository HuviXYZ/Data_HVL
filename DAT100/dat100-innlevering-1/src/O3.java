import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn et positivt heltall:");
        int n = scanner.nextInt();

        long fakultet = 1;

        if (n <= 0) {
            System.out.println("Tallet må være større enn 0.");
        } else {
            for (int i = 1; i <= n; i++) {
                fakultet = fakultet * i;
            }

            System.out.println(n + "! = " + fakultet);
        }


    }
}