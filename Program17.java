public class Program17 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive count.");
        } else {
            int[] numbers = new int[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }

            double average = (double) sum / n;
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.2f%n", average);
        }

        sc.close();
    }
}
