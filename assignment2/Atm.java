import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        // Business rules: positive amount, multiple of 100, not exceeding balance
        if (balance < 0) {
            System.out.println("Error: Invalid account balance.");
        } else if (withdraw <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else if (withdraw % 100 != 0) {
            System.out.println("Error: Withdrawal amount must be a multiple of 100.");
        } else if (withdraw > balance) {
            System.out.println("Error: Insufficient balance.");
        } else {
            balance -= withdraw;
            System.out.printf("Withdrawal Successful; Remaining Balance: %.0f\n", balance);
        }
        sc.close();
    }
}