import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you first number: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter you Second number: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.printf("Sum: %.4f", sum(a,b));
    }

    static double sum(double a, double b) {
        return a + b;
    }
}
