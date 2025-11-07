public class Human {
    String name;
    int age;
    double weight;

    Human() {
        this.name = "Anonymous";
    }

    Human(String name) {
        this.name = name;
    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String toString() {
        return name + "\n" + age + "\n" + weight + "\n";
    }

    void drink() {
        System.out.println(this.name + " is drinking.");
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }
}
