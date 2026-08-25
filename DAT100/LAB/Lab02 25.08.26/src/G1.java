import java.util.Scanner;

public class G1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oppgi heltall");
        int tall = scanner.nextInt();

        int rest = tall % 2;


        if (rest == 0) {
            System.out.println("Tallet er et partall");
        }else {
            System.out.println("tallet er et oddetall");
        }


    }
}
