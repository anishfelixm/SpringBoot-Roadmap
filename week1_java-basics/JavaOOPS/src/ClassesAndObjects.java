public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        Garage garage = new Garage();

        /*
         * without an overridden toString method defined, the object address will be displayed
         */
        System.out.println(car1.toString());
        System.out.println(car1.model);
        car1.drive();
        garage.park(car1);

        System.out.println();

        Human person1 = new Human("Morty", 22, 68.9);
        Human person2 = new Human("Rick", 45);

        Human[] people = new Human[2];
        people[0] = person1;
        people[1] = person2;

        System.out.println(person1.toString());
        System.out.println(people[1].toString());
        person1.eat();
        person2.drink();
    }
}
