abstract class Payment {
    protected double amount; // Common field for all payment types

    public Payment(double amount) {
        this.amount = amount;
    }

    // Common method inherited by all child classes
    public void printReceipt() {
        System.out.printf("Receipt amount: Rs. %.2f%n", amount);
    }

    // Each child class provides its own implementation
    public abstract void pay();
}

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.printf("Paid Rs. %.2f using cash.%n", amount);
    }
}

class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.printf("Paid Rs. %.2f using card.%n", amount);
    }
}

class UpiPayment extends Payment {
    public UpiPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.printf("Paid Rs. %.2f using UPI.%n", amount);
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Payment[] payments = {
            new CashPayment(500),
            new CardPayment(1200),
            new UpiPayment(750)
        };

        for (Payment payment : payments) {
            payment.pay();
            payment.printReceipt();
            System.out.println();
        }
    }
}
