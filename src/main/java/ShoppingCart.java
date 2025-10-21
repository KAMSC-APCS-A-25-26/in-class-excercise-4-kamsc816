import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        // TODO: Use a for loop to read each item's price (double)
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int num = sc.nextInt();
        double total = 0.0;
        for (int i=1; i<=num; i++){
            System.out.print("Price of item " + i + "? ");
            double price = sc.nextDouble();
            total += price;
        }
        System.out.print("Your cart has " + num + " items with a total cost of $" + total);
    }
}
