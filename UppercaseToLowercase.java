import java.util.Scanner;
public class UppercaseToLowercase {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter an uppercase alphabet: ");
            char uppercase = input.next().charAt(0);

            // Convert uppercase to lowercase using ASCII values
            char lowercase = (char) (uppercase + 32);

            System.out.println("Lowercase: " + lowercase);
        }
    }

