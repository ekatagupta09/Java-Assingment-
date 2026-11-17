interface Notifier {
    void sendNotification(String message);
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // 1. Inner class: can access and modify the outer class's private field.
    class BalanceManager {
        public void addMoney(double amount) {
            balance += amount;
            System.out.printf("Balance after deposit: Rs. %.2f%n", balance);
        }

        public void showBalance() {
            System.out.printf("Current balance: Rs. %.2f%n", balance);
        }
    }

    // 2. Static nested class: does not need a BankAccount object.
    static class ReceiptPrinter {
        public void printReceipt(String accountHolder, double amount) {
            System.out.println("----- BANK RECEIPT -----");
            System.out.println("Account holder: " + accountHolder);
            System.out.printf("Transaction amount: Rs. %.2f%n", amount);
            System.out.println("------------------------");
        }
    }

    // 3. Accepts an object of the Notifier interface.
    public void notifyUser(Notifier notifier, String message) {
        notifier.sendNotification(message);
    }
}

public class NestedClassesDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);

        // Create inner-class object using the outer-class object.
        BankAccount.BalanceManager manager = account.new BalanceManager();
        manager.showBalance();
        manager.addMoney(500.00);

        // Create static nested-class object without an outer object.
        BankAccount.ReceiptPrinter printer = new BankAccount.ReceiptPrinter();
        printer.printReceipt("Ravi Kumar", 500.00);

        // Anonymous inner class implementing Notifier.
        Notifier emailNotifier = new Notifier() {
            @Override
            public void sendNotification(String message) {
                System.out.println("Notification: " + message);
            }
        };

        account.notifyUser(emailNotifier, "Your deposit was successful.");
    }
}
