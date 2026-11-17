public class Program10 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Length = " + text.length());
        System.out.println("Uppercase = " + text.toUpperCase());
        System.out.println("Lowercase = " + text.toLowerCase());

        sc.close();
    }
}
