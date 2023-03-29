import java.util.Scanner;

public class CityName {
    public static class cityName {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a letter from a to f: ");
            char letter = input.next().charAt(0);

            if (letter == 'a') {
                System.out.println("Anand");
            } else if (letter == 'b') {
                System.out.println("Baroda");
            } else if (letter == 'c') {
                System.out.println("Changa");
            } else if (letter == 'd') {
                System.out.println("Dev");
            } else if (letter == 'e') {
                System.out.println("Eider");
            } else if (letter == 'f') {
                System.out.println("Franch");
            } else {
                System.out.println("Invalid entry");
            }
        }
    }

}
