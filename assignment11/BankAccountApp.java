import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Withdrawal rejected: Insufficient balance.");
        } else {
            balance -= amount;
        }
    }

    public void display() {
        System.out.printf("Balance ₹%.0f\n", balance);
    }
}

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accNo = sc.next();
        System.out.print("Enter holder name: ");
        String name = sc.next();
        System.out.print("Enter opening balance: ");
        double opening = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, opening);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

        System.out.print("Enter withdrawal amount: ");
        double with = sc.nextDouble();
        account.withdraw(with);

        account.display();
        sc.close();
    }
}