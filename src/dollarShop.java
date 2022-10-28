import java.util.Scanner;

public class dollarShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double price=0;
        double total=0;
        {
            do {
                price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 9.99);
                total += price;
                done = SafeInput.getYN(in, "Do you want to keep shopping ");
                if (!done)
                    System.out.println("Your total is: " + total);

            } while (done);
        }
    }
}
