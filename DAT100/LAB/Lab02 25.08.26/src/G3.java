import java.lang.Math.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class G3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn totalt 4 tall hver for seg\n");

        System.out.println("Skriv inn første tall ut av 4");
        int tall1 = scanner.nextInt();

        System.out.println("Skriv inn Andre tall ut av 4");
        int tall2 = scanner.nextInt();

        System.out.println("Skriv inn Tredje tall ut av 4");
        int tall3 = scanner.nextInt();

        System.out.println("Skriv inn Tredje tall ut av 4");
        int tall4 = scanner.nextInt();

        int minste1 = Math.min(tall1,tall2);
        int miste2 = Math.min(tall3,tall4);

        int totalMinst = Math.min(minste1, miste2);

        System.out.println(totalMinst);









    }
}
