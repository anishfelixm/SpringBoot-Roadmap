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
        System.out.print("Enter the # of rows: ");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the # of cols: ");
        int cols = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the symbol: ");
        String symbol = scanner.next();
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
        }

        scanner.close();
    }
}
