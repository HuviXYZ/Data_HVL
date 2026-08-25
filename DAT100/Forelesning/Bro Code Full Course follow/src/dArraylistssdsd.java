import java.util.*;

public class dArraylistssdsd {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> handleliste = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");


        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomats");
        produceList.add("peppers");
        produceList.add("shiuni");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("cola");
        drinksList.add("pepsimax");
        drinksList.add("water");

        handleliste.add(bakeryList);
        handleliste.add(produceList);
        handleliste.add(drinksList);
        System.out.println(handleliste.get(0).get(0));


    }
}
