import java.util.Scanner;

public class G2 {
    public static void main(String[] args) {

        System.out.println("Velg nummer for å skrive ut ukedag 1-mandag osv\n");
        System.out.println("********************");

        System.out.println("1 - ");
        System.out.println("2 - ");
        System.out.println("3 - ");
        System.out.println("4 - ");
        System.out.println("5- ");
        System.out.println("6- ");
        System.out.println("7 - ");

        Scanner scanner = new Scanner(System.in);
        int nd = scanner.nextInt();

        while(nd > 7 || nd < 1){
            System.out.println("ugyldig nummer, prøv igjen");
            nd = scanner.nextInt();

        }


            switch (nd) {
                case 1:
                    System.out.println("det er mandag i dag");
                    break;
                case 2:
                    System.out.println("det er Tirsdag i dag");
                    break;
                case 3:
                    System.out.println("det er Onsdag i dag");
                    break;
                case 4:
                    System.out.println("det er Torsdag i dag");
                    break;
                case 5:
                    System.out.println("det er Fredag i dag");
                    break;
                case 6:
                    System.out.println("det er Lørdag i dag");
                    break;
                case 7:
                    System.out.println("det er Søndag i dag");
                    break;
            }


        }





    }

