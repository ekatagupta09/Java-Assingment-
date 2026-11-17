public class Program11 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a string with at least 3 characters: ");
        String text = sc.nextLine();

        if (text.length() >= 3) {
            System.out.println("First character = " + text.charAt(0));
            System.out.println("Last character = " + text.charAt(text.length() - 1));
            System.out.println("Character at position 3 = " + text.charAt(2));
        } else {
            System.out.println("The string must contain at least 3 characters.");
        }

        sc.close();
    }
}
