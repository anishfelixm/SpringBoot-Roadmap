public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.model);
        car1.drive();

        System.out.println();

        System.out.println(car2.model);
        car2.brake();
    }
}
