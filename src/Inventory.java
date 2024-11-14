import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public List<Item> items = new ArrayList<>();

    public void display() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ") " + items.get(i).name);
        }
    }
}
