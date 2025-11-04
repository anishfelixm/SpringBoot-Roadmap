import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * Using if..else..if..else clause
         */
        System.out.println("Enter an age: ");
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 75) {
            System.out.println("Senior Citizen");
        }
        else if (age >= 18) {
            System.out.println("Adult");
        }
        else if (age >= 0) {
            System.out.println("Kid");
        }
        else {
            System.out.println("Wrong age");
        }

        /*
         * Using switch clause
         */
        System.out.println("Enter todays day: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Wrong day");
        }

        scanner.close();
    }
}
