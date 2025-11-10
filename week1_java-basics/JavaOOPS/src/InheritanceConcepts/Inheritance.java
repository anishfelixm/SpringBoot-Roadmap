package InheritanceConcepts;

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();

        car.go();
        System.out.println("number of wheels: " + car.wheels);
        bike.stop();
        System.out.println("Number of pedals: " + bike.pedals);

        System.out.println();
        /*
         * method overriding in show
         */
        Animal animal = new Animal();
        animal.speak();
        Dog dog = new Dog();
        dog.speak();

        System.out.println();
        /*
         * Super keyword
         */
        Hero hero = new Hero("Batman", 44, "$$$");
        System.out.println(hero.toString());
    }
}
