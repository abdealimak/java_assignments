import java.util.Scanner;

public class Salary {
    // HRA = 20% of basic
    public static double calculateHra(double basic) {
        return basic * 0.20;
    }

    // DA = 10% of basic
    public static double calculateDa(double basic) {
        return basic * 0.10;
    }

    // Special allowance = 5% if basic > 50000, else 2%
    public static double calculateAllowance(double basic) {
        return basic > 50000 ? (basic * 0.05) : (basic * 0.02);
    }

    // Gross salary = basic + HRA + DA + Special allowance
    public static double calculateGross(double basic, double hra, double da, double allowance) {
        return basic + hra + da + allowance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        if (basic < 0) {
            System.out.println("Basic salary cannot be negative.");
            sc.close();
            return;
        }

        double hra = calculateHra(basic);
        double da = calculateDa(basic);
        double allowance = calculateAllowance(basic);
        double gross = calculateGross(basic, hra, da, allowance);

        System.out.printf("HRA %.0f; DA %.0f; Allowance %.0f; Gross %.0f\n",
                hra, da, allowance, gross);
        sc.close();
    }
}