import java.util.ArrayList;

public class Character {
    public int hp;
    public String name;
    public Inventory backpack;

    public Character() {
        backpack = new Inventory();

        Weapon w = new Weapon();
        w.name = "Axe";
        w.weight = 10f;

        Consumable p = new Consumable();
        p.name = "Health potion";
        p.weight = 2f;

        backpack.getItems().add(w);
        backpack.getItems().add(p);

        hp = 100;
        name = "";
    }
}
