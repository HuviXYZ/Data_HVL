import java.util.ArrayList;
public class inventory {

    ArrayList<item> items;

    public inventory(){
        items = new ArrayList<>();


    }
    public void addItem(Item item) {
        items.add(item);
    }
}
