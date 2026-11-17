public class Program5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalBill = price * quantity;
        System.out.printf("Total bill = %.2f%n", totalBill);

        sc.close();
    }
}
