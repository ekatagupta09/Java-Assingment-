public class Program18 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive count.");
        } else {
            System.out.print("Enter number 1: ");
            int first = sc.nextInt();
            int largest = first;
            int smallest = first;

            for (int i = 2; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                int number = sc.nextInt();

                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            }

            System.out.println("Largest = " + largest);
            System.out.println("Smallest = " + smallest);
        }

        sc.close();
    }
}
