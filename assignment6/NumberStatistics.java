import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of numbers (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid count. N must be positive.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " integers:");
        int first = sc.nextInt();
        int sum = first;
        int largest = first;
        int smallest = first;
        int evenCount = (first % 2 == 0) ? 1 : 0;
        int oddCount = (first % 2 != 0) ? 1 : 0;

        for (int i = 1; i < n; i++) {
            int val = sc.nextInt();
            sum += val;
            if (val > largest) largest = val;
            if (val < smallest) smallest = val;
            if (val % 2 == 0) evenCount++;
            else oddCount++;
        }

        double average = (double) sum / n;

        System.out.printf("Sum %d; Average %.2f; Largest %d; Smallest %d; Even %d; Odd %d\n",
                sum, average, largest, smallest, evenCount, oddCount);
        sc.close();
    }
}