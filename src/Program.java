import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Character myChar = new Character();

        // Visa nuvarande innehåll i ryggsäcken
        myChar.backpack.display();

        // Skapa en ny Armor och fråga om spelaren vill ta upp den
        Armor helmet = new Armor();
        helmet.name = "Bronze helmet";
        helmet.weight = 3f;

        System.out.println("You've found a " + helmet.name + ". Pick it up? [yes|no]");

        Scanner scanner = new Scanner(System.in);
        String choice = "";

        // Vänta på ett giltigt svar
        while (!choice.equals("yes") && !choice.equals("no")) {
            choice = scanner.nextLine().toLowerCase();
        }

        if (choice.equals("yes")) {
            System.out.println("Adding it to your inventory");
            myChar.backpack.items.add(helmet);
        } else {
            System.out.println("Skipping it");
        }

        // Visa nuvarande innehåll i ryggsäcken igen
        System.out.println("Your inventory is now:");
        myChar.backpack.display();

        scanner.close();
    }
}
