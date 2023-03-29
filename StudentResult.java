
    import java.util.Scanner;

    public class StudentResult {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student roll number: ");
            int rollNo = input.nextInt();

            System.out.print("Enter marks for subject 1: ");
            int subject1 = input.nextInt();

            System.out.print("Enter marks for subject 2: ");
            int subject2 = input.nextInt();

            System.out.print("Enter marks for subject 3: ");
            int subject3 = input.nextInt();

            int total = subject1 + subject2 + subject3;
            double percentage = (double) total / 3;

            String result;
            if (percentage >= 35) {
                result = "pass";
            } else {
                result = "fail";
            }

            String grade;
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "D";
            }

            System.out.println("Name: " + name);
            System.out.println("Roll number: " + rollNo);
            System.out.println("Total marks: " + total);
            System.out.println("Percentage: " + percentage);
            System.out.println("Result: " + result);
            System.out.println("Grade: " + grade);
        }
    }

