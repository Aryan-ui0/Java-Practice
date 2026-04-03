package questions_first.hard;

import java.util.Scanner;

class Account {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
}

class Bank {
    Account[] accounts = new Account[3];
    int count = 0;

    void addAccount(Account a) {
        if (count < 3) {
            accounts[count++] = a;
        }
    }

    void deposit(int accNo, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accNo == accNo) {
                accounts[i].balance += amount;
                return;
            }
        }
    }

    void withdraw(int accNo, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accNo == accNo) {
                accounts[i].balance -= amount;
                return;
            }
        }
    }

    void displayAccounts() {
        System.out.println("Accounts:");
        for (int i = 0; i < count; i++) {
            System.out.println(
                "Account: " + accounts[i].accNo +
                ", Name: " + accounts[i].name +
                ", Balance: " + accounts[i].balance
            );
        }
    }
}

public class que22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            int accNo = sc.nextInt();
            String name = sc.next();
            double balance = sc.nextDouble();
            bank.addAccount(new Account(accNo, name, balance));
        }

        String action1 = sc.next();
        int accNo1 = sc.nextInt();
        double amount1 = sc.nextDouble();

        if (action1.equalsIgnoreCase("Deposit")) {
            bank.deposit(accNo1, amount1);
        }

        String action2 = sc.next();
        int accNo2 = sc.nextInt();
        double amount2 = sc.nextDouble();

        if (action2.equalsIgnoreCase("Withdraw")) {
            bank.withdraw(accNo2, amount2);
        }

        bank.displayAccounts();
        sc.close();
    }
}
