public class CarClass {
    String make;
    int year;

    CarClass() {
        this.make = "";
        this.year = 0;
    }

    CarClass(String make, int year) {
        this.make = make;
        this.year = year;
    }

    void start() {
        System.out.println("Car is starting.");
    }

    void displayInfo() {
        System.out.println("make: " + make);
        System.out.println("year: " + year);
    }
}
