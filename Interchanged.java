import java.util.Scanner;
public class Interchanged {
    public static void main(String[] args) {
        // A and B are to interchange
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of A and B");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("before interchaning number: " + a + "" + b);
        // interchange number
        c = b;
        a = b;
        b = c;
        System.out.println("after changing:"+ a + ""+ b);

    }
}


