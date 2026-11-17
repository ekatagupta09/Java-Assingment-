public class Program3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Circumference = %.2f%n", circumference);

        sc.close();
    }
}
