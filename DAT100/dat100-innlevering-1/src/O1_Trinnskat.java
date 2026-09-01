import java.util.Scanner;

public class O1_Trinnskat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til skatteberegningsprogrammet!");
        System.out.println("***************************************");
        System.out.println("Hvor mye tjener du i bruttolønn?");

        double bruttolønn = scanner.nextDouble();

        double skattdel1 = 0;
        double skattdel2 = 0;
        double skattdel3 = 0;
        double skattdel4 = 0;
        double skattdel5 = 0;

        if (bruttolønn > 226100) {
            double inntektsdel = Math.min(bruttolønn, 318300) - 226100;
            skattdel1 = inntektsdel * 0.017;
        }

        if (bruttolønn > 318300) {
            double inntektsdel = Math.min(bruttolønn, 725050) - 318300;
            skattdel2 = inntektsdel * 0.04;
        }

        if (bruttolønn > 725050) {
            double inntektsdel = Math.min(bruttolønn, 980100) - 725050;
            skattdel3 = inntektsdel * 0.137;
        }

        if (bruttolønn > 980100) {
            double inntektsdel = Math.min(bruttolønn, 1467200) - 980100;
            skattdel4 = inntektsdel * 0.168;
        }

        if (bruttolønn > 1467200) {
            double inntektsdel = bruttolønn - 1467200;
            skattdel5 = inntektsdel * 0.178;
        }

        double totalskatt =
                skattdel1 +
                skattdel2 +
                skattdel3 +
                skattdel4 +
                skattdel5;

        System.out.println("Total trinnskatt er " + totalskatt + "kr");

        scanner.close();
    }
}