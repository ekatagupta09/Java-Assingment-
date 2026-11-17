public class Program2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Perimeter = %.2f%n", perimeter);

        sc.close();
    }
}
