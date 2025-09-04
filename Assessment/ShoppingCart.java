// 3. The Online Shopping Cart 
// A shopping app stores product prices in an array when a customer adds items.
// Use a loop to calculate the total cart value.
// Apply a discount of 10% if the total exceeds 5000.
// Add a delivery charge of 100 if the total after discount is less than 2000.
// Display the final payable amount.


import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items in the cart: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of item " + (i + 1) + ":");
            prices[i] = sc.nextDouble();
        }

        double total = 0;

       
        for (double price : prices) {
            total += price;
        }

        System.out.println("\nTotal cart value before discount: ₹" + total);

       
        if (total > 5000) {
            double discount = total * 0.10;
            total -= discount;
            System.out.println("10% discount applied: ₹" + discount);
        }

       
        if (total < 2000) {
            total += 100;
            System.out.println("Delivery charge of ₹100 added.");
        }

        System.out.println("Final payable amount: ₹" + total);

        sc.close();
    }
}
