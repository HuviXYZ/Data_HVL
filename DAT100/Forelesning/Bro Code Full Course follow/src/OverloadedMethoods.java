public class OverloadedMethoods {
    public static void main(String[] args) {

       int x = calc(1,2, 3, 4);
        System.out.println(x);
    }

    static int calc(int a, int b) {
        System.out.println("dette er overloaded method #1");
        return a + b;

    }

    static int calc(int a, int b, int c) {
        System.out.println("dette er overloaded method #2");
        return a + b + c;


    }

    static int calc(int a, int b, int c, int d) {
        System.out.println("dette er overloaded method #3");
        return a + b + c + d;
    }



    

}
