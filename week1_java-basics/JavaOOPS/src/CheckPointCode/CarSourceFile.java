package CheckPointCode;

import java.util.Scanner;

public class CarSourceFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String make;
        int year, n, choice;

        System.out.println("Enter number of cars: ");
        n = Integer.parseInt(scanner.nextLine());
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter make of car: ");
            make = scanner.nextLine();
            System.out.println("Enter year of car: ");
            year = Integer.parseInt(scanner.nextLine());
            Car car = new Car(make, year);
            cars[i] = car;
        }

        System.out.println("Which car you wanna look up? [1 - " + n + "]");
        choice = Integer.parseInt(scanner.nextLine());
        cars[choice-1].displayInfo();

        System.out.println("Which car you wanna start? [1 - " + n + "]");
        choice = Integer.parseInt(scanner.nextLine());
        cars[choice-1].start();
    }
}
