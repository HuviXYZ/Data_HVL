public class Sjakk {
    public static void main(String[] args) {

        final String SVART = "##";
        final String HVIT = "  ";
        final int ANTALL_RUTER = 8;

        for(int i = 1; i <= ANTALL_RUTER; i++ ){
        char bokstaverOverst = (char) ('a' + i);
            System.out.print(bokstaverOverst);
            System.out.print(" ");
        }

        //kollonner nedover

        for(int i = 1; i <= ANTALL_RUTER; i++){
            System.out.println();


        }
    }

}