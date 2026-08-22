import java.util.Scanner;
import java.util.Scanner.*;

public class MATHHYP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("katet a:");
        double a = scanner.nextDouble();

        System.out.println("katet b:");
        double b = scanner.nextDouble();

        double hyp = Math.pow(a,2) + Math.pow(b, 2);

        hyp = Math.sqrt(hyp);
        System.out.println("hypotinusen er" + hyp);

    }
}
