import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * Use case of while loop
         */
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        /*
         * Use case of for loop
         */
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        System.out.println("Happy New Year!");

        scanner.close();
    }
}
