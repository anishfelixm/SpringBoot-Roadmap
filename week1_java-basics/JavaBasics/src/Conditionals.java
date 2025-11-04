import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}
