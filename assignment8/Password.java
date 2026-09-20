import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean hasMinLength = password.length() >= 8;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        if (hasMinLength && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid. Missing requirements:");
            if (!hasMinLength) System.out.println("- At least 8 characters");
            if (!hasUpper) System.out.println("- At least one uppercase letter");
            if (!hasLower) System.out.println("- At least one lowercase letter");
            if (!hasDigit) System.out.println("- At least one digit");
            if (!hasSpecial) System.out.println("- At least one special character");
        }
        sc.close();
    }
}