import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name :");
        String name = scanner.next();

        System.out.print("Enter a place :");
        String place = scanner.next();

        System.out.print("Enter a noun (Thing) :");
        String noun = scanner.next();

        System.out.print("Enter a verb (action) :");
        String verb = scanner.next();

        System.out.print("Enter an adjective (describing word) :");
        String adjective = scanner.next();

        System.out.print("Enter an animal :");
        String animal = scanner.next();

        System.out.println("One day, " +name+ "was walking through " +place+ "holding a" +noun+  ".");
        System.out.println("Suddenly," +adjective+ " " +animal+   " appeared out of nowhere!");
        System.out.println("Without thinking," +name+ " decided to " +verb+  " the " +animal+ ".");
        System.out.println("The " +animal+  " looked surprised, grabbed the " +noun+ ", and ran away yelling,");
        System.out.println("THIS IS MINE NOW!");
        System.out.println("And " +name+ " just stood there saying,");
        System.out.println("Well, that escalated quickly.");
        System.out.println("                   THE END");

        scanner.close();
    }
}