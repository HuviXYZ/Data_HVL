import java.util.Scanner;


import javax.swing.*;

public class IFSTATEMENTSETC {

    public static void main(String[] args) {

        //program som validerer hvilken skyss bilett type jeg må kjøpe
        // 3 kategorier :
        // under 18 = barnebilett
        // 18 til 25 ungdomsbilett
        // 25 og oppover voksenbilett

        Scanner scanner = new Scanner(System.in);
        System.out.println("hvor gammel er du? oppgi svar i tall: ");

        int alder = scanner.nextInt();

        if (alder < 18) {
            System.out.println("du kan/må kjøpe en barnebilett\n");
        } else if (alder >= 18 && alder <= 25) {
            System.out.println("du må kjøpe ungdummsbilett\n");
            
        }else if (alder > 25){
            System.out.println("du er over over 25 år gammel og trenger en voksenbilett");
        }









    }
}
