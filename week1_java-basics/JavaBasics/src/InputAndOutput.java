import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); /* after you input the integer, there remains a \n in terminal as nextInt scans only the integer.
                              * Doing this additional nextLine(), reads that\n and allows the next scanner.nextLine() to proceed as usual
                              */

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
    }
}
