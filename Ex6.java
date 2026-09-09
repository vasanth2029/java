import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void balance();
}

class Bank implements BankAccount {
    double bal = 1000;

    public void deposit(double amount) {
        if (amount <= 0)
            System.out.println("Invalid Amount");
        else {
            bal += amount;
            System.out.println("Deposit Successful");
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount > bal)
                throw new Exception("Insufficient Balance");
            bal -= amount;
            System.out.println("Withdrawal Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void balance() {
        System.out.println("Balance = " + bal);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter Deposit Amount: ");
        b.deposit(sc.nextDouble());

        System.out.print("Enter Withdrawal Amount: ");
        b.withdraw(sc.nextDouble());

        b.balance();

        sc.close();
    }
}


Hide message history
DP
