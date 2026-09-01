import static java.lang.Math.*;

public class Sirkel{

    void main(){
        double areal = arealSirkel(10);

    }

    public static double arealSirkel(double radius) {
        double areal = PI * pow(radius, 2);
        return areal;

    }
}

