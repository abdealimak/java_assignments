import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity units: ");
        double units = sc.nextDouble();

        // Handle invalid input
        if (units < 0) {
            System.out.println("Invalid units! Units cannot be negative.");
            sc.close();
            return;
        }

        // Slab calculation: 1-100 @ 2, 101-200 @ 3, >200 @ 5
        double bill = 0;
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        System.out.printf("Total Electricity Bill: ₹%.2f\n", bill);
        sc.close();
    }
}