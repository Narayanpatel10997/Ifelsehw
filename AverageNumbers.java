import java.util.Scanner;
public class AverageNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter third number: ");
            double num3 = input.nextDouble();

            System.out.print("Enter fourth number: ");
            double num4 = input.nextDouble();

            System.out.print("Enter fifth number: ");
            double num5 = input.nextDouble();

            double average = (num1 + num2 + num3 + num4 + num5) / 5.0;

            System.out.println("Average of the five numbers is: " + average);
        }
    }



