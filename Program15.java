public class Program15 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine().trim();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine().trim();

        String fullName = firstName + " " + lastName;
        String initials = "";

        if (!firstName.isEmpty()) {
            initials += Character.toUpperCase(firstName.charAt(0)) + ".";
        }
        if (!lastName.isEmpty()) {
            initials += Character.toUpperCase(lastName.charAt(0)) + ".";
        }

        System.out.println("Full name = " + fullName);
        System.out.println("Initials = " + initials);

        sc.close();
    }
}
