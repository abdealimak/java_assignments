import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        if (hours < 0) {
            System.out.println("Invalid number of hours.");
            return;
        }

        if (hours == 0) {
            System.out.println("Parking Fee: ₹0");
        } else {
            int fee = 30;

            if (hours <= 2) {
                fee = 30;
            } else if (hours <= 5) {
                fee = 30 + (hours - 2) * 20;
            } else {
                fee = 30 + (3 * 20) + (hours - 5) * 30;
            }

            System.out.println("Parking Fee: ₹" + fee);
        }

        sc.close();
    }
}