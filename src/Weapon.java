import java.util.Random;

public class Weapon extends Item {
    public int minDamage = 10;
    public int maxDamage = 20;

    public int attack() {
        Random random = new Random();
        return random.nextInt(maxDamage - minDamage) + minDamage;
    }
}
