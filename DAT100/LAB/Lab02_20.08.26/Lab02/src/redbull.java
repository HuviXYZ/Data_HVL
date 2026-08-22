import java.util.Scanner;

public class redbull{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("liker du redbull? Svar ja eller nei");

        String svarObj = obj.nextLine();


                     while (!svarObj.equals("ja") && (!svarObj.equals("nei"))) {
                         System.out.println("du oppga ugyldig svar, du må svare ja eller nei, prøv igjen!: ");
                         svarObj = obj.nextLine();
                     }
        if (svarObj.equals("ja")) {
            System.out.println("yeey så gøy! jeg liker også redbull");
        }
        else if(svarObj.equals("nei")){
            System.out.println("det var dumt, jeg hater deg!!");
        }






    }

}