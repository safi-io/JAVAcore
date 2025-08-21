import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String isItemPresent = sc.nextLine();

        items.add("milk");
        items.add("bread");

        if (shoppingList(items, isItemPresent)) {
            System.out.println("Present!");
        } else {
            System.out.println("Not Present!");
        }
    }


    private static boolean shoppingList(List<String> items, String itemName) {
        return items.contains(itemName);
    }
}