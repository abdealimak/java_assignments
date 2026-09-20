import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter membership type (Premium/Regular): ");
        String membership = sc.next();

        if (amount < 0) {
            System.out.println("Invalid amount! Amount cannot be negative.");
            sc.close();
            return;
        }

        // Business rules: Premium (10% at >=5000, else 5%), Regular (2% at >=5000, else 0%)
        double discountPercent = 0.0;
        if (membership.equalsIgnoreCase("Premium")) {
            discountPercent = (amount >= 5000) ? 0.10 : 0.05;
        } else if (membership.equalsIgnoreCase("Regular")) {
            discountPercent = (amount >= 5000) ? 0.02 : 0.0;
        } else {
            System.out.println("Unknown membership type.");
            sc.close();
            return;
        }

        double discount = amount * discountPercent;
        double finalAmount = amount - discount;

        System.out.printf("Discount ₹%.2f; Final Amount ₹%.2f\n", discount, finalAmount);
        sc.close();
    }
}