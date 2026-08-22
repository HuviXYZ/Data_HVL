public class dArraysss {
    public static void main(String[] args) {

        //2d arrays
        String[][] cars = new String[3][3];
        cars[0][0] = "toyota";
        cars[0][1] = "bmw";
        cars[0][2] = "vw";
        cars[1][0] = "hayy";
        cars[1][1] = "4343rw";
        cars[1][2] = "dsdsstttttt";
        cars[2][0] = "aasdsadsadasd";
        cars[2][1] = "jjjjjj";
        cars[2][2] = "ddddddd";

        for(int i = 0; i < cars.length; i++){
            System.out.println();


            for(int j = 0; j < cars.length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }




    }


}
