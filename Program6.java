public class Program6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.printf("Temperature in Fahrenheit = %.2f%n", fahrenheit);

        sc.close();
    }
}
