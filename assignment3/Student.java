import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects (out of 100):");
        double[] marks = new double[5];
        double total = 0;
        boolean hasFailedSubject = false;

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextDouble();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Marks must be between 0 and 100.");
                sc.close();
                return;
            }
            total += marks[i];
            // Business rule: any subject below 40 means FAIL
            if (marks[i] < 40) {
                hasFailedSubject = true;
            }
        }

        double percentage = (total / 500.0) * 100.0;
        String result;
        String grade;

        if (hasFailedSubject || percentage < 40) {
            result = "FAIL";
            grade = "F";
        } else {
            result = "PASS";
            // Grading logic: A >= 80, B 60-79, C 50-59, D 40-49
            if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "D";
            }
        }

        System.out.printf("Total %.0f/500; Percentage %.2f%%; %s; Grade %s\n", total, percentage, result, grade);
        sc.close();
    }
}