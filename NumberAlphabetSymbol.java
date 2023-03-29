import java.util.Scanner;
public class NumberAlphabetSymbol {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a value: ");
            char value = input.next().charAt(0);

            if (value >= '0' && value <= '9') {
                System.out.println("The value is a number.");
            } else if ((value >= 'a' && value <= 'z') ) {
                System.out.println("The value is an alphabet.");
            } else {
                System.out.println("The value is a symbol.");
            }
        }
    }

