import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter ending multiplier: ");
        int end = sc.nextInt();

        if (end < 1) {
            System.out.println("Ending multiplier must be at least 1.");
            sc.close();
            return;
        }

        // Print multiplication table from 1 to end
        for (int i = 1; i <= end; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}