import java.util.Scanner;
import java.util.SortedMap;

public class ForLOppsi {
    public static void main(String[] args) {
      //lage et program som lager figurer basert på kolonner og rows

        int hello = 5;
       int rows;
       int coloums;
       String symbol = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter amount of rows you want");
        rows = scanner.nextInt();

         System.out.println("enter amount of coloums you want");
         coloums = scanner.nextInt();

         scanner.nextLine();
         System.out.println("What symbol do u wanna use?");
         symbol = scanner.nextLine();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for(int j = 1; j <= coloums; j++){
                System.out.print(symbol);
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i <= hello; i++) {
            System.out.println("hello");

        }





        }
    }

