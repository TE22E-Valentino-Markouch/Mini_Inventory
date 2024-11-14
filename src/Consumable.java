public class Consumable extends Item {
    public int usesMax = 3;
    public int usesCurrent = 3;

    public void use(Character target) {
        if (usesCurrent > 0) {
            target.hp += 10;
            usesCurrent--;
        }
    }
}
