import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        int iphone = 4000;
        int ipad = 6000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("hva ønsker du å kjøpe?");
        System.out.println("****************\n");

        System.out.println("1 --Iphone - "+ iphone + "kr") ;
        System.out.println("2 --Ipad - " + ipad + "kr");

        int kjøpsvalg = scanner.nextInt();

        System.out.println("hvor mye kontanter betaler du med?");
        int betalinsum = scanner.nextInt();

        int totalVekslePenger = betalinsum - iphone;



        switch (kjøpsvalg){
            case 1:
                int antall10KR = totalVekslePenger / 10;

                int antal1KR = totalVekslePenger % 10;

                System.out.println("du får " + antall10KR + " 10Kroninger tilbake " + " og "+ antal1KR +" 1-kroninger tilbake ");




        }






    }
}
