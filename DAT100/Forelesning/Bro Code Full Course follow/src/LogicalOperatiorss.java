import java.util.Scanner;

public class LogicalOperatiorss {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are in the program, press 'q' or 'Q' to quit");

        String response = scanner.nextLine();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You just quit the game");

        } else {
            System.out.println("you are still playing the game! whats your next move?: ");

        }

    }
}
