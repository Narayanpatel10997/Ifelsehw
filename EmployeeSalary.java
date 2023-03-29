 import java.util.Scanner;

public class EmployeeSalary {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter employee ID: ");
            int empId = input.nextInt();
            input.nextLine(); // consume the leftover newline character

            System.out.print("Enter employee name: ");
            String empName = input.nextLine();

            System.out.print("Enter basic salary: ");
            double basicSalary = input.nextDouble();

            double hra = 0.1 * basicSalary;
            double ta = 0.09 * basicSalary;
            double da = 0.08 * basicSalary;
            double pf = 0.2 * basicSalary;
            double grossSalary = basicSalary + hra + ta + da - pf;

            System.out.println("Employee ID: " + empId);
            System.out.println("Employee name: " + empName);
            System.out.println("Basic salary: " + basicSalary);
            System.out.println("HRA: " + hra);
            System.out.println("TA: " + ta);
            System.out.println("DA: " + da);
            System.out.println("PF: " + pf);
            System.out.println("Gross salary: " + grossSalary);
        }
    }



